package com.arg;

public class SaglikliBurger extends Hamburger {

    private String ilaveSaglikliUrunAdi1;
    private double ilaveSaglikUrunUcreti1;

    private String ilaveSaglikliUrunAdi2;
    private double ilaveSaglikUrunUcreti2;

    public SaglikliBurger(String etCesidi, double ucreti) {
        super("Sağlıklı Burger", "Kepekli Ekmek", etCesidi, ucreti);
    }

    public void ekleSaglikliUrun1(String ad, double fiyat){
        this.ilaveSaglikliUrunAdi1=ad;
        this.ilaveSaglikUrunUcreti1 =fiyat;
    }
    public void ekleSaglikliUrun2(String ad, double fiyat){
        this.ilaveSaglikliUrunAdi2=ad;
        this.ilaveSaglikUrunUcreti2 =fiyat;
    }

    @Override
    public double hamburgerBilgileri() {
        double toplamUcret = super.hamburgerBilgileri();

        if(this.ilaveSaglikliUrunAdi1 != null){
            toplamUcret+=ilaveSaglikUrunUcreti1;
            System.out.println("İlave sağlıklı burger ürünü: "+ilaveSaglikliUrunAdi1+" İlave sağlıklı burger ücreti: "+ilaveSaglikUrunUcreti1);
        }
        if(this.ilaveSaglikliUrunAdi2 != null){
            toplamUcret+=ilaveSaglikUrunUcreti2;
            System.out.println("İlave sağlık burger ürünü: "+ilaveSaglikliUrunAdi2+" İlave sağlıklı burger ücreti: "+ilaveSaglikUrunUcreti2);
        }
        return toplamUcret;
    }
}
