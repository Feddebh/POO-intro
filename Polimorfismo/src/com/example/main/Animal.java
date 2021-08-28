package com.example.main;

public class Animal extends SerVivo {

    String tipo;
    public Animal (String ti)
    {
     tipo = ti;
    }
    public void alimentarse()
    {
        System.out.println("Soy un animal, me estoy alimentando. Soy un/a " + tipo);
    }
}
