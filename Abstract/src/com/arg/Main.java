package com.arg;

//ABSTARCK CLASS == Bu projede abstract class Araba.java classıdır. Abstract class ortak yönleri olan classlar için temel class görevini görür.

public class Main {
    public static void main(String[] args) {

/*  Ford f= new Ford();
    f.setCantKalinlik(10);*/

        Araba f= new Ford(); // Ford f= new Ford(); nesnesinin oluşumundan farkı yoktur.
        f.setAgirlik(1500);
        f.setRenk("Mor");
        f.setModel("Focus");
        f.setYil(2016);


        Araba h= new Honda();
        h.setAgirlik(1000);
        h.setModel("Civic");
        h.setRenk("Siyah");
        h.setYil(2010);


        Araba s=new Seat();
        s.setAgirlik(780);
        s.setRenk("Bej");
        s.setModel("Toledo");
        s.setYil(2014);

        Araba au =new Audi();
        au.setAgirlik(1600);
        au.setModel("A6");
        au.setRenk("Beyaz");
        au.setYil(2018);


        goster(f);
        goster(h);
        goster(s);
        goster(au);
    }
    public static void goster(Araba a){
        System.out.println("Ağırlık: "+a.getAgirlik());
        System.out.println("Model: "+a.getModel());
        System.out.println("Renk: "+a.getRenk());
        System.out.println("Benzin: "+a.saatteyaktigibenzinlitresi());//agirliga bağlı olarak farklı aracalara farklı değer hesaplayacaktır.
        System.out.println("Araç piyasa çıkış tarihi: "+a.getYil());


    }
}
