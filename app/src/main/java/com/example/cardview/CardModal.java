package com.example.cardview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CardModal extends RecyclerView.ViewHolder  {
    ImageView imageView;
    TextView textView;

    public CardModal(@NonNull View itemView) {
        super(itemView);
        imageView= itemView.findViewById(R.id.image);
        textView= itemView.findViewById(R.id.textHeader) ;
    }


}
