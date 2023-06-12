package com.example.recycleview;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public ImageView imageView;
    public ViewHolder(@NonNull View view) {
        super(view);
        Log.i("View",view+"");
        this.imageView = view.findViewById(R.id.image);
        this.textView = view.findViewById(R.id.text);


    }
}
