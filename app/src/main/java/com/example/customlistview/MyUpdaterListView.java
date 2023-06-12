package com.example.customlistview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Console;
import java.util.ArrayList;
import java.util.Objects;

public class MyUpdaterListView extends ArrayAdapter<ItemModal> {
    private ArrayList<ItemModal> arrayList;
    private Context context;

    public MyUpdaterListView(ArrayList<ItemModal> arrayList, Context context) {
        super(context, R.layout.item_listview_layout, arrayList);
        this.context = context;
        this.arrayList = arrayList;

    }

    //View Lookup Cache
    private static class ViewHolder {
        TextView txtCountry, txtWin;
        ImageView imgSource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ItemModal itemModal = getItem(position);
        ViewHolder viewHolder;
        Log.i("Item modal", itemModal + ""
        );
        Log.i("position", position + "");
        Log.i("convertView", convertView + "");
        Log.i("parent", parent + "");

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(R.layout.item_listview_layout, parent, false);
            viewHolder.txtCountry = (TextView) convertView.findViewById(R.id.nameCountry);
            viewHolder.txtWin = (TextView) convertView.findViewById(R.id.numberOfWin);
            viewHolder.imgSource = (ImageView) convertView.findViewById(R.id.image);
            convertView.setTag(viewHolder);


        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }


        viewHolder.txtWin.setText(itemModal.getNumberOfWin());
        viewHolder.txtCountry.setText(itemModal.getNameCountry());
        viewHolder.imgSource.setImageResource(itemModal.getImgSource());
        Log.i("View Holder", viewHolder + "");
        Log.i("New ConvertView", convertView + "");
        return convertView;
    }
}
