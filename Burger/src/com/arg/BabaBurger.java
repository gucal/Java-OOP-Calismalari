package com.arg;

public class BabaBurger extends Hamburger {

    public BabaBurger( String ekmekCesidi, String etCesidi, double ucreti) {
         super("Baba Burger", ekmekCesidi, etCesidi, ucreti);
        }
    @Override
    public void ekleIlaveUrun1(String ad, double ucret) {
       super.ekleIlaveUrun1("Patates Kızartması (Zorunlu!)", 2);
         }
    @Override
    public void ekleIlaveUrun2(String ad, double ucret) {
        super.ekleIlaveUrun2("Kola (Zorunlu!)", 2);
           }
}