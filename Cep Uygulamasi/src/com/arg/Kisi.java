package com.arg;

public class Kisi {


    private String isim;
    private String telNo;

    public Kisi(String isim, String telNo) {
        this.isim = isim;
        this.telNo = telNo;
    }

    public String getIsim() {
        return isim;
    }

    public String getTelNo() {
        return telNo;
    }
    public static Kisi olustur(String isim, String telNo){
        return new Kisi(isim, telNo);
    }
}
