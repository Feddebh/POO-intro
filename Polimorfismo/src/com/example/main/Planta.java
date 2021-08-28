package com.example.main;

public class Planta extends SerVivo {

    String tipo;

    public Planta(String ti) {
        tipo=ti;
    }

 public void alimentarse(){

        System.out.println("Soy una planta, me estoy alimentando. " + "Soy una planta del tipo " + tipo);

 };
}
