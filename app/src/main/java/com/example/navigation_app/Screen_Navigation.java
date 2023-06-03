package com.example.navigation_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Screen_Navigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_navigation);
        //Collect data by explicit intent in activity main
        Intent i= getIntent();
        String k= i.getStringExtra("Khang");
        Toast.makeText(this, "We passed" + k, Toast.LENGTH_SHORT).show();
    }
}