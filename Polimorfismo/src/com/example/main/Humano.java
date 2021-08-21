package com.example.main;

public class Humano extends SerVivo {

    String genero;

    public Humano(String ge)
    {
        genero = ge;
    }

    public void alimentarse()
    {
        System.out.println("Soy un ser humano, me estoy alimentando. Soy " + genero);
    }
}
