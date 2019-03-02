package com.arg;

public class Personel implements Karsilastir {

    private int yas;

    public Personel(){
        yas=0;
    }
    public Personel(int yas){
        this.yas=yas;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String karsilastir(Object Nesne) {

        Personel p2 = (Personel) Nesne; //Hata veriyor. Nedeni int 4= float 4 eşlemesindeki hatayla aynıdır. Başına veritipini belirtirken yapıldıgı gibi
                                        //Nesne adı başa belirtilerek hata giderilir.
        if(this.yas > p2.yas){
            return "Asıl nesne personelinin yaşı paremetredeki personelin yaşından büyüktür.";
        }else if(this.yas < p2.yas){
            return "Asıl nesne personelinin yaşı paremetredeki personelin yaşından büyüktür.";
        }else {
            return "İki personelin yaşı birbirine eşittir.";
        }
    }
}
