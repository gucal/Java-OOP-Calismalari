package com.arg;

public class Main {

    public static void main(String[] args) {

        FutbolOyuncu f1=new FutbolOyuncu("Alirıza");
        FutbolOyuncu f2= new FutbolOyuncu("Mehmet");
        FutbolOyuncu f3= new FutbolOyuncu("Abdullah");

        BasketbolOyuncu b1= new BasketbolOyuncu("Uğur");
        BasketbolOyuncu b2= new BasketbolOyuncu("Berkay");
        BasketbolOyuncu b3= new BasketbolOyuncu("Rıza");

        Takim<FutbolOyuncu> gs=new Takim("Galatasaray");
        Takim<FutbolOyuncu> fb=new Takim("Fenerbahçe");
        Takim<FutbolOyuncu> bjk=new Takim("Beşiktaş");
        Takim<FutbolOyuncu> ts=new Takim("Trabzonspor");

        Takim<BasketbolOyuncu> ae=new Takim("Anadolu Efes");
        Takim<BasketbolOyuncu> pk=new Takim<>("Pınar Karşıyaka");

        gs.oyuncuEkle(f1);
        gs.oyuncuEkle(f2);
        fb.oyuncuEkle(f3);
        ae.oyuncuEkle(b1);
        pk.oyuncuEkle(b2);
        pk.oyuncuEkle(b3);

        gs.macYap(fb,4,1);
        fb.macYap(bjk,3,3);
        bjk.macYap(ts,1,2);
        ts.macYap(gs,1,2);

        ae.macYap(pk,2,1);

        System.out.println("GS Toplam Puan: "+gs.toplamPuan());
        System.out.println("FB Toplam Puan: "+fb.toplamPuan());
        System.out.println("BJK Toplam Puan: "+bjk.toplamPuan());
        System.out.println("TS Toplam Puan: "+ts.toplamPuan());

        Lig <Takim<FutbolOyuncu>> futbolLigi=new Lig<>("Süper Lig");

        futbolLigi.takimEkle(gs);
        futbolLigi.takimEkle(fb);
        futbolLigi.takimEkle(bjk);
        futbolLigi.takimEkle(ts);
        System.out.println("Futbol Ligi Puan Tablosu Aşağıdaki Gibidir: ");
        futbolLigi.puanTablosu();

        Lig<Takim<BasketbolOyuncu>> basketbolLig=new Lig<>("Basketbol Lig");

        basketbolLig.takimEkle(pk);
        basketbolLig.takimEkle(ae);
        System.out.println("Basketbol Ligi Puan Tablosu Aşağıdaki Gibidir: ");
        basketbolLig.puanTablosu();






    }
}
