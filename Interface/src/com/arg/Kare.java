package com.arg;

public class Kare implements Karsilastir{
    private double mKenaruzunlugu;

    public Kare() {
        mKenaruzunlugu=0;
    }
    public Kare (double kenar){
        this.mKenaruzunlugu=kenar;
    }

    public double getmKenaruzunlugu() {
        return mKenaruzunlugu;
    }

    public void setmKenaruzunlugu(double mKenaruzunlugu) {
        this.mKenaruzunlugu = mKenaruzunlugu;
    }

    public double alanhesapla(){
    return mKenaruzunlugu*mKenaruzunlugu;
    }

    @Override
    public String karsilastir(Object Nesne) {
        Kare k2= (Kare) Nesne; //Hata veriyor. Nedeni int 4= float 4 eşlemesindeki hatayla aynıdır. Başına veritipini belirtirken yapıldıgı gibi
                               //Nesne adı başa belirtilerek hata giderilir.
        if (this.alanhesapla() > k2.alanhesapla()){
            return "Asıl nesnenin alanı parametredeki nesne alanından büyüktür!";
        }else if(this.alanhesapla()<k2.alanhesapla()){
            return  "Asıl nesnenin alanı parametredeki nesne alanından küçüktür!";
        }else{
            return "Alanlar eşittir.";
        }
    }
}
