package com.arg;

import java.util.ArrayList;

public class CepTelefonu {

    private ArrayList<Kisi> rehber; //rehber adında bir arraylist actık
    private String kendiNumaram;

    public CepTelefonu(String kendiNumaram){
        this.kendiNumaram = kendiNumaram;
       this.rehber=new ArrayList<Kisi>(); // rehberi arrayliste atadık

    }
    public boolean ekleYeniKisi(Kisi yenikisi){
        if(kisiBul(yenikisi.getIsim())>=0) {
            System.out.println(yenikisi.getIsim()+"İsimli kişi rehberde zaten kayıtlı. Yeni kişi eklenemedi!");
            return false;
        }
        rehber.add(yenikisi);
        return true;
    }

    public int kisiBul(Kisi aranacakKisi){

    return this.rehber.indexOf(aranacakKisi);
    }
    public int kisiBul(String isim){
        for(int i=0;i<this.rehber.size();i++){
            Kisi onAnKiKisiNesnesi=this.rehber.get(i);

            if(onAnKiKisiNesnesi.getIsim().equals(isim)){
                return i;
            }
        }
        return -1;

    }
    public Kisi kisiSorgula(String isim){
    int position=kisiBul(isim);
    if(position>=0){
        return rehber.get(position);
    }
        return null;


    }
    public boolean kisiSil(Kisi silinecekkisi){
        int position = kisiBul(silinecekkisi);
        if(position<0) {
            System.out.println("Böyle bir kişi yok");
            return false;
        }
        this.rehber.remove(silinecekkisi);
        return true;

    }
    public boolean kisiGuncelle(Kisi eskiKisi, Kisi yenikisi){
        int bulunanPosition=kisiBul(eskiKisi);
        if(bulunanPosition<0){
            System.out.println("Böyle bir kayıt yok");
            return false;
        }
        rehber.set(bulunanPosition,yenikisi);
        System.out.println(eskiKisi.getIsim()+ " değeri "+yenikisi.getIsim()+" ile güncellendi");
        return true;
    }
    public void tumRehber(){
        System.out.println("\n***Tüm Rehber***");
        if(rehber.size()==0){
            System.out.println("Kayıtlı kişi yok.");
            return;
        }
        for(int i=0; i<this.rehber.size();i++){
            System.out.println((i+1)+"- "+rehber.get(i).getIsim()+" ->  "+rehber.get(i).getTelNo() );
        }
    }


}
