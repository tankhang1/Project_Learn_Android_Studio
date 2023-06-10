package com.example.media_player;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    Button btn_backward, btn_play_or_pause, btn_forward;
    SeekBar seekBar;
    TextView time, filePath;
    MediaPlayer mediaPlayer;

    int timeStart = 0;
    int timeFinish = 0;

    final int jump = 10000;

    Handler handler = new Handler();
    private boolean checkPlay = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Constructor();
        setUpMedia();
        onPlay();
        onForward();
        onBackward();
    }

    private void Constructor() {
        btn_backward = findViewById(R.id.btn_backward);
        btn_forward = findViewById(R.id.btn_forward);
        btn_play_or_pause = findViewById(R.id.btn_play_or_pause);
        seekBar = findViewById(R.id.seekBar);
        time = findViewById(R.id.time);
        filePath = findViewById(R.id.filePath);
    }

    private void setUpMedia() {
        mediaPlayer = MediaPlayer.create(this, R.raw.lac_troi);

        timeStart = mediaPlayer.getCurrentPosition();
        timeFinish = mediaPlayer.getDuration();
        seekBar.setMax(timeFinish);
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(timeFinish);
        int seconds = (int) ((int) TimeUnit.MILLISECONDS.toSeconds(timeFinish) - TimeUnit.MINUTES.toSeconds(minutes));
        time.setText(String.format("%d : %d", minutes, seconds));
        filePath.setText(getResources().getIdentifier("lac_troi", "raw", getPackageName()));

        handler.post(updateSongTime);
    }

    private void onForward() {
        btn_forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.getCurrentPosition() + jump <= timeFinish) {
                    mediaPlayer.seekTo(mediaPlayer.getCurrentPosition() + jump);
                }

            }
        });
    }
    private void onBackward() {
        btn_backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.getCurrentPosition() - jump >= 0) {
                    mediaPlayer.seekTo(mediaPlayer.getCurrentPosition() - jump);
                }
            }
        });
    }
    private void onPlay() {
        btn_play_or_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable pause = getResources().getDrawable(R.drawable.baseline_pause_24, getTheme());
                Drawable play = getResources().getDrawable(R.drawable.baseline_play_arrow_24, getTheme());
                checkPlay = !checkPlay;
                if (checkPlay) {
                    btn_play_or_pause.setBackground(pause);
                    mediaPlayer.start();
                } else {
                    btn_play_or_pause.setBackground(play);
                    mediaPlayer.pause();
                }
                ;
            }
        });
    }

    private Runnable updateSongTime = new Runnable() {
        @Override
        public void run() {
            timeStart = mediaPlayer.getCurrentPosition();
            seekBar.setProgress(timeStart);
            int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(timeFinish - timeStart);
            int seconds = (int) ((int) TimeUnit.MILLISECONDS.toSeconds(timeFinish - timeStart) - TimeUnit.MINUTES.toSeconds(minutes));
            time.setText(String.format("%d : %d", minutes, seconds));
            handler.post(this);
        }
    };
}