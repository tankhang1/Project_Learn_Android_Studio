package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button yellow,red,green,purple;
    MediaPlayer mediaPlayer= new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Constructor();
        yellowClick();
        redClick();
        greenClick();
        purpleClick();
    }
    private void Constructor(){
        yellow= findViewById(R.id.yellow_btn);
        red= findViewById(R.id.red_btn);
        green= findViewById(R.id.green_btn);
        purple= findViewById(R.id.purple_btn);
    }
    private void yellowClick(){
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer= MediaPlayer.create(getApplicationContext(), R.raw.yellow);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(),yellow.getTag()+"",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void redClick(){
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer= MediaPlayer.create(getApplicationContext(), R.raw.red);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(),red.getTag()+"",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void greenClick(){
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer= MediaPlayer.create(getApplicationContext(), R.raw.green);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(),green.getTag()+"",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void purpleClick(){
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer= MediaPlayer.create(getApplicationContext(), R.raw.purple);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(),purple.getTag()+"",Toast.LENGTH_SHORT).show();
            }
        });
    }
}