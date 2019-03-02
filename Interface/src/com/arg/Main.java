package com.arg;

public class Main {

    public static void main(String[] args) {

        Kare k1= new Kare(10); //Kare sınıfı oluşturuldu ve değerler atandı//
        Kare k2=new Kare (2);
        Personel p1= new Personel(25);//Personel sınıfı oluşturuldu ve değerler atandı//
        Personel p2=new Personel(25);
        Araba a1= new Araba(2004);
        Araba a2= new Araba(2012);

        System.out.println("Kare alan karşılaştırması aşağıdaki gibidir: " + k1.karsilastir(k2));//k1 nesnesi içine k2 nesnesi parametre olarak atandı.
        System.out.println("Personellerin yaş karşılaştırması aşağıdaki gibidir: "+p1.karsilastir(p2));//p1 nesnesi içine p2 nesnesi parametre olarak atandı.
        System.out.println("Araçların model karşılaştırması aşağıdaki gibidir: "+a1.karsilastir(a2));//a1 nesnesi icine a2 nesnesi parametre olarak atandı.


        nesneKarsilastir(k1,k2); //alttaki nesneKarsilastir methoduna parametre olarak gönderiliyorlar
        nesneKarsilastir(p1,p2); //alttaki nesneKarsilastir methoduna parametre olarak gönderiliyorlar
        nesneKarsilastir(a1,a2);
    }

    public static void nesneKarsilastir(Karsilastir z1, Karsilastir z2){

        System.out.println("Karşılaştırma: "+ z1.karsilastir(z2));
    }
}
