package com.arg;

import java.util.ArrayList;
import java.util.Collections;

public class Lig<T extends Takim> {

    private String LigAdi;
    private ArrayList<T> tumTakimlar=new ArrayList<>();

    public Lig(String ligAdi) {
        LigAdi = ligAdi;
    }
    public boolean takimEkle(T yeniTakim){
        if(tumTakimlar.contains(yeniTakim)){
            return false;
        }
        tumTakimlar.add(yeniTakim);
        return true;
    }
    public void puanTablosu(){
        Collections.sort(tumTakimlar,Collections.reverseOrder());
        for(T gecici:tumTakimlar){
            System.out.println(gecici.getTakimAdi()+" "+gecici.toplamPuan());
        }
    }
}
