package com.example.navigation_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button navigate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigate = findViewById(R.id.navigateToScreen);
        navigate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //explicit navigation to Screen Navigation
                Intent i = new Intent(getApplicationContext(), Screen_Navigation.class);
                //Explicit pass data to other screen
                i.putExtra("Khang", "2023");
                startActivity(i);


            }
        });
        //inplicit navigation
        Button goToGoogle= findViewById(R.id.goToGoogle);
        goToGoogle.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //implicit intent
                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.google.com"));
                startActivity(i);

            }
        });
    }
}