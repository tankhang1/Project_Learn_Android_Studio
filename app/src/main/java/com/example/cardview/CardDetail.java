package com.example.cardview;

public class CardDetail {
    private String text;
    private int imgSrc;

    public CardDetail(String text, int imgSrc) {
        this.text = text;
        this.imgSrc = imgSrc;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }
}
