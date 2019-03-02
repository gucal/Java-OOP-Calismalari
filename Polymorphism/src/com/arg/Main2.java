package com.arg;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int a;
        System.out.println("Lütfen bir değer giriniz: ");
        a=input.nextInt();
        GeometrikSek gs1 = new GeometrikSek();
        Kare k1 = new Kare(a);
        Dikdortgen d1 = new Dikdortgen(7,13);

        sekilAlanlariHesapla(gs1);
        sekilAlanlariHesapla(k1);
        sekilAlanlariHesapla(d1);

    }

    private static void sekilAlanlariHesapla(Object gelenSekilNesnesi) {
        if(gelenSekilNesnesi instanceof GeometrikSek){
            GeometrikSek gs= (GeometrikSek) gelenSekilNesnesi;
            System.out.println("Şekil alanı: "+gs.alanHesapla());

        }else if(gelenSekilNesnesi instanceof Kare){
          Kare k =(Kare) gelenSekilNesnesi;
            System.out.println("Karenin alanı: "+k.alanHesapla());
        }
        else{
        Dikdortgen d=(Dikdortgen) gelenSekilNesnesi;
            System.out.println("Dikdörtgen alanı: "+d.alanHesapla());
        }
    }
}
