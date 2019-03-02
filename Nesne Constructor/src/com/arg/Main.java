package com.arg;

public class Main extends Object {//extend Object manuel yazılmasına gerek yoktur. JAVA bunu otomatik olarak yapar.

    public static void main(String[] args) {

        Dikdortgen d1= new Dikdortgen(); //PUBLIC değerler ulaşılabilir değerlerdir.
                                        // Private değerlere ise sadece aynı class içindeki methodlar ulaşabilir.
        d1.en = 5;
        d1.boy = 10;
        System.out.println("Dikdörtgen alanı:"+d1.alaniHesapla());

        Dikdortgen d2= new Dikdortgen();

        d2.en=7;
        d2.boy=11;
        System.out.println("Dikdörtgen alanı:"+d2.alaniHesapla());

        Dikdortgen d3=new Dikdortgen();

        d3.setBoy(15);
        System.out.println("Dikdörtgen alanı:"+d3.alaniHesapla());


    }
}
