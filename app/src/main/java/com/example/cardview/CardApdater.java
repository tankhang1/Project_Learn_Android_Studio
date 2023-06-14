package com.example.cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardApdater extends RecyclerView.Adapter<CardModal> {
    ArrayList<CardDetail> arrayList;

    Context context;
    public CardApdater(ArrayList<CardDetail> arrayList,Context context) {
        this.context= context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public CardModal onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view= layoutInflater.inflate(R.layout.layout_item,parent,false);
        CardModal  cardModal= new CardModal(view);
        return  cardModal;
    }

    @Override
    public void onBindViewHolder(@NonNull CardModal holder, int position) {
        CardDetail cardModal= arrayList.get(position);
        holder.textView.setText(cardModal.getText());
        holder.imageView.setImageResource(cardModal.getImgSrc());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, holder.textView.getText(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
