package com.arg;

public class Honda extends Araba {
    private int beygirgucu;

    public int getBeygirgucu() {
        return beygirgucu;
    }

    public void setBeygirgucu(int beygirgucu) {
        this.beygirgucu = beygirgucu;
    }

    @Override
    public int saatteyaktigibenzinlitresi() {
        return getAgirlik()/7;
    }
}
