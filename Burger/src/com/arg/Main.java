package com.arg;

public class Main {

    public static void main(String[] args) {
        //SADE BURGER
        Hamburger h1= new Hamburger("Sade","Beyaz Ekmek","Kırmızı Et",8.90);
        h1.ekleIlaveUrun1("Patates Kızartması",2.50);
        h1.ekleIlaveUrun2("Soğan Halkası",4);
        h1.ekleIlaveUrun3("Domates",3);
        h1.ekleIlaveUrun4("Kola",2);
        System.out.println("Toplam tutar= "+h1.hamburgerBilgileri());
        System.out.println("------------------------------------------");

        //SAĞLIKLI BURGER
        SaglikliBurger sb = new SaglikliBurger("Kırmızı Et",6);
        sb.ekleIlaveUrun1("Patates Kızartması",2);
        sb.ekleIlaveUrun2("Soğan Halkası",4);
        sb.ekleIlaveUrun3("Domates",3);
        sb.ekleIlaveUrun4("Kola",2);
        sb.ekleSaglikliUrun1("Maydanoz",2);
        sb.ekleSaglikliUrun2("Fesleğen",3);
        System.out.println("Toplam tutar= "+sb.hamburgerBilgileri());
        System.out.println("------------------------------------------");

        //BABA BURGER
        BabaBurger bb = new BabaBurger("Beyaz Ekmek","Kırmızı Et",6);
        bb.ekleIlaveUrun1("Ürün1",0);
        bb.ekleIlaveUrun2("Ürün2",0);
        System.out.println("Toplam tutar= "+bb.hamburgerBilgileri());
    }
}
