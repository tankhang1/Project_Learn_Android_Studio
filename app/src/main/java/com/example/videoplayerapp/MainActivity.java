package com.example.videoplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    VideoView videoView_local;
    VideoView videoView_uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Constructor();
        playVideoLocal();
        playVideoUri();
    }

    private void Constructor() {
        videoView_local = findViewById(R.id.video_local);
        videoView_uri = findViewById(R.id.video_uri);
    }

    private void playVideoLocal() {
        MediaController mc = new MediaController(this);
        mc.setAnchorView(videoView_local);
        videoView_local.setMediaController(mc);
        videoView_local.setVideoPath("android.resource://" + getPackageName() + '/' + R.raw.enviroment);
    }

    private void playVideoUri(){

        Uri uri = Uri.parse("https://static.videezy.com/system/resources/previews/000/002/231/original/5226496.mp4");
        videoView_uri.setVideoURI(uri);

        MediaController mc2 = new MediaController(this);
        mc2.setAnchorView(videoView_uri);
        videoView_uri.setMediaController(mc2);
        videoView_uri.start();

    }
}