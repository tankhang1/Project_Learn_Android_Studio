package com.example.recycleview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewClass extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<ItemModal> list;

    public RecycleViewClass(ArrayList<ItemModal> arrayList) {
        this.list = arrayList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view= layoutInflater.inflate(R.layout.layout_item,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemModal itemModal = this.list.get(position);
        holder.textView.setText(itemModal.getText());
        holder.imageView.setImageResource(itemModal.getImgSource());

    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
