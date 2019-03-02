package com.arg;

public class Araba implements Karsilastir{

    private  int model;
    public Araba(){
        model=0;
    }
    public Araba(int model){
        this.model=model;
    }
    public int getModel() {
        return model;
    }//get model
    public void setModel(int model) {
        this.model = model;
    }//set model
    @Override
    public String karsilastir(Object Nesne) {
        Araba a2 = (Araba) Nesne;
        if(this.model>a2.model){
            return "Asıl nesne modeli yüksektir.";
        }else if(this.model<a2.model){
            return "Asıl nesne modeli düşüktür.";
        }
        else{
            return "İki aracında modeli ayndıır.";
        }
    }
}
