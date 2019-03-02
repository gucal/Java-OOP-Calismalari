package com.arg;

public class Daire extends GeometrikSek {

    private double yaricap ;

    public Daire(){
        yaricap=0;
    }
    public Daire(double yaricap){
    setYaricap(yaricap);
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        if (yaricap < 0) {
            this.yaricap = 0;
        } else {
            this.yaricap = yaricap;
        }
    }

    @Override
    public double alanHesapla() {
        return Math.PI * yaricap * yaricap;
    }
}
