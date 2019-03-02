package com.arg;

public class Seat extends Araba {
    private int vitesSayisi;

    public int getVitesSayisi() { return vitesSayisi; }

    public void setVitesSayisi(int vitesSayisi) {
        this.vitesSayisi = vitesSayisi;
    }

    @Override
    public int saatteyaktigibenzinlitresi() {
        return getAgirlik() /3;
    }
}
