package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    private static MyUpdaterListView myUpdaterListView ;

    ArrayList<ItemModal> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Use template available

    /*    arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dataSources);
        listView= findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);*/

        // Custome template

        listView= findViewById(R.id.listView);

        arrayList= new ArrayList<>();
        arrayList.add(new ItemModal("VN","11",R.drawable.vn));
        arrayList.add(new ItemModal("Lao","2",R.drawable.laos));
        arrayList.add(new ItemModal("US","12",R.drawable.us));

        myUpdaterListView= new MyUpdaterListView(arrayList,getApplicationContext());

        listView.setAdapter(myUpdaterListView);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i(i+"",i+ " "+ view);
            }
        });
    }
}