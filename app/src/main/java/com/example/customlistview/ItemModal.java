package com.example.customlistview;



public class ItemModal {
   private String nameCountry,numberOfWin;
   private int imgSource;

    public ItemModal(String nameCountry, String numberOfWin, int imgSource) {
        this.nameCountry = nameCountry;
        this.numberOfWin = numberOfWin;
        this.imgSource = imgSource;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getNumberOfWin() {
        return numberOfWin;
    }

    public void setNumberOfWin(String numberOfWin) {
        this.numberOfWin = numberOfWin;
    }

    public int getImgSource() {
        return imgSource;
    }

    public void setImgSource(int imgSource) {
        this.imgSource = imgSource;
    }
}
