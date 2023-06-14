package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<CardDetail> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.recycleView);
        arrayList = new ArrayList<>();
        arrayList.add(new CardDetail("HELLO",R.drawable.boy));
        arrayList.add(new CardDetail("HI",R.drawable.swordsman));
        CardApdater cardApdater= new CardApdater(arrayList,getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(cardApdater);
    }
}