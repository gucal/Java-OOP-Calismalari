package com.arg;

public class Main3 {
    public static void main(String[] args){

        GeometrikSek gs1 = new GeometrikSek();
        Kare k1 = new Kare(7);
        Dikdortgen d1 = new Dikdortgen(7,13);

        GeometrikSek gs2 = new GeometrikSek();
        Kare k2 = new Kare(11);
        Dikdortgen d2 = new Dikdortgen(14,13);

        Daire da1 = new Daire(3);
        Daire da2 = new Daire(9);


        GeometrikSek[] sekillerDizisi =new GeometrikSek[8];
        sekillerDizisi[0] = gs1;
        sekillerDizisi[1] = k1;
        sekillerDizisi[2] = d1;
        sekillerDizisi[3] = gs2;
        sekillerDizisi[4] = k2;
        sekillerDizisi[5] = d2;
        sekillerDizisi[6] = da1;
        sekillerDizisi[7] = da2;
        sekilAlanHesaplaMethodu(sekillerDizisi);




    }


    public static void sekilAlanHesaplaMethodu(GeometrikSek[] sekiller ){

        for(GeometrikSek geciciNesne : sekiller){
            System.out.println("Şeklin alanı: "+geciciNesne.alanHesapla());
        }


    }
}
