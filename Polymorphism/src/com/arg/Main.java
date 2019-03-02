package com.arg;

public class Main {

    public static void main(String[] args) {

        GeometrikSek g1 = new GeometrikSek();
        Kare k1 = new Kare(9);
        Dikdortgen d1= new Dikdortgen(4,7);
        Kare k2 = new Kare(77);

        sekilAlanlari(g1);
        sekilAlanlari(k1);
        sekilAlanlari(d1);
        sekilAlanlari(k2);
    }
    public static void sekilAlanlari(GeometrikSek sekil){
        System.out.println("Alan bilgisi: "+sekil.alanHesapla());
    }
}
