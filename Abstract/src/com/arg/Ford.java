package com.arg;

public class Ford extends Araba { //soyut sınıftan normal sınıf extends edilemez

    private int cantKalinlik;

    public int getCantKalinlik() {
        return cantKalinlik;
    }

    public void setCantKalinlik(int cantKalinlik) {
        this.cantKalinlik = cantKalinlik;
    }

    @Override
    public int saatteyaktigibenzinlitresi() {
        return getAgirlik() /10 ;
    }
}
