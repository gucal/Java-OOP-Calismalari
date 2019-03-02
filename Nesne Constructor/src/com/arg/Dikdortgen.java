package com.arg;

public class Dikdortgen {
    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public static double en;
    public static double boy;
    public double alaniHesapla(){
        return en * boy;
    }
    public Dikdortgen(){
        en=11;
    }
}
