package com.arg;

public abstract class Araba {
    private int agirlik;
    private String model;
    private String renk;
    private int yil;

    public int getYil() { return yil; }

    public void setYil(int yil) { this.yil = yil; }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public abstract int saatteyaktigibenzinlitresi();
}