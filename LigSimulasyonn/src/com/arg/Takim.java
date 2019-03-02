package com.arg;

import java.util.ArrayList;

public class Takim<T extends Oyuncu> implements Comparable<Takim<T>> {

    private String takimAdi;
    int oynadigiMacSayisi=0;
    int kazandigiMacSayisi=0;
    int kaybettigiMacSayisi=0;
    int beraberlikMacSayisi=0;

    private ArrayList<T> oyuncular = new ArrayList<>();

    public Takim(String takimAdi) {
        this.takimAdi = takimAdi;
    }

    public String getTakimAdi() {
        return takimAdi;
    }
    public boolean oyuncuEkle(T yeniOyuncu){
        if(oyuncular.contains(yeniOyuncu)){
            System.out.println(yeniOyuncu.getOyuncuismi()+" isimli oyuncu zaten takımda.");
            return false;
        }else{
            System.out.println(yeniOyuncu.getOyuncuismi()+ " isimli oyuncu takıma eklendi.");
            oyuncular.add(yeniOyuncu);
            return true;
        }

    }
    public void macYap(Takim<T> rakipTakim,int evsahibiskor,int deplasmanskor){
        String mesaj ="";
        if (evsahibiskor>deplasmanskor){
            mesaj=" kazandi ";
            kazandigiMacSayisi++;
        }else if(evsahibiskor<deplasmanskor){
            mesaj=" kaybetti ";
            kaybettigiMacSayisi++;
        }else{
            mesaj=" berabere kaldı ";
            beraberlikMacSayisi++;
        }oynadigiMacSayisi++;

        if(rakipTakim != null){
            System.out.println(this.getTakimAdi()+mesaj+rakipTakim.getTakimAdi());
            rakipTakim.macYap(null,deplasmanskor,evsahibiskor);
        }
    }
    public int toplamPuan(){
        return (kazandigiMacSayisi*3)+beraberlikMacSayisi;
    }

    @Override
    public int compareTo(Takim<T> o) {
        if(this.toplamPuan()>o.toplamPuan()){
            return 1;
        }
        else if(this.toplamPuan()<o.toplamPuan()){
            return -1;
        }else{ return 0;}
    }
}
