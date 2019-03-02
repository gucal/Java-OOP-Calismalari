package com.arg;


import java.util.Scanner;


public class Main {

    private static CepTelefonu cepTelefonu= new CepTelefonu("32");

    private static Scanner input= new Scanner(System.in);

    public static void main(String[] args) {


     telefonuBaslat(); //telefonu başlatan method.
     menuGoster();

     boolean cikis=false;
     while (!cikis){
         System.out.println("SEÇİMİNİZ (ÇIKIŞ İÇİN 0 SEÇİMİNİ YAPINIZ.");
         int secim=input.nextInt();

         switch (secim){
             case 0:
                 System.out.println("Çıkış yapılıyor....");
                 cikis=true;
                 break;
             case 1:
                 cepTelefonu.tumRehber();
                 break;
             case 2:
            yeniKisiEkleMethodo();
            break;
             case 3:
                 kisiSilMethodu();
                 break;
             case 4:
                 kisiGuncellemeMethodu();
                break;


             case 5:
                 kisisorgulamethodu();
                 break;
         }
     }
    }

    private static void kisiGuncellemeMethodu() {
        System.out.println("Güncellenecek kişinin adı: ");
        String isim=input.next();
        Kisi bulunanKisi =cepTelefonu.kisiSorgula(isim);
        if(bulunanKisi==null){
            System.out.println("Kayıt bulunamadı!");
            return;
        }
        System.out.println("Yeni isim değeri: ");
        String yenisim=input.next();
        System.out.println("Yeni telefon numarası");
        String telno=input.next();

        cepTelefonu.kisiGuncelle(bulunanKisi,Kisi.olustur(yenisim,telno));


    }

    private static void kisiSilMethodu() {
        System.out.println("Silinecek kişinin adı: ");
        String isim=input.next();
        Kisi bulunanKisi =cepTelefonu.kisiSorgula(isim);
        if(cepTelefonu.kisiSil(bulunanKisi)) {
            System.out.println("Silme işlemi yapıldı.");
        }
    }

    private static void kisisorgulamethodu() {
        System.out.println("Aranacak kişi adını giriniz:");
        String isim=input.next();

        Kisi bulunanKisi=cepTelefonu.kisiSorgula(isim);
        if(bulunanKisi==null){
            System.out.println(isim+" isminde bir kayıt bulunamadı!");
            return;
        }
        System.out.println("Bulunan kişi:"+bulunanKisi.getTelNo());
    }

    private static void yeniKisiEkleMethodo() {
        System.out.println("Yeni kişi adı: ");
        String isim=input.next();
        System.out.println("Yeni kişi numarası: ");
        String telefonNo=input.next();

        cepTelefonu.ekleYeniKisi(Kisi.olustur(isim,telefonNo));
    }

    private static void telefonuBaslat() {
        System.out.println("Telefon başlatılıyor...");
    }

    private static void menuGoster() {
        System.out.println("******MENU******");
        System.out.println("0. Çıkış");
        System.out.println("1. Kişileri listele");
        System.out.println("2. Yeni kişi ekle");
        System.out.println("3. Kişi sil");
        System.out.println("4. Kişi güncelle");
        System.out.println("5. Kişi sorgula");


    }

}