package com.arg;

public class Audi extends Araba {
    private int tork;

    public int getTork() { return tork; }

    public void setTork(int tork) {this.tork = tork; }

    @Override
    public int saatteyaktigibenzinlitresi() {
        return getAgirlik() /2;
    }
}
