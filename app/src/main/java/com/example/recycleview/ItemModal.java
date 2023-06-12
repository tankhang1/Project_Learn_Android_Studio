package com.example.recycleview;

import androidx.recyclerview.widget.RecyclerView;

public class ItemModal{
    private String text;
    private int imgSource;

    public ItemModal(String text, int imgSource) {
        this.text = text;
        this.imgSource = imgSource;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImgSource() {
        return imgSource;
    }

    public void setImgSource(int imgSource) {
        this.imgSource = imgSource;
    }
}
