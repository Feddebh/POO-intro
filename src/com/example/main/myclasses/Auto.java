package com.example.main.myclasses;

public class Auto {

    //Atributos
    private String marca;
    private String modelo;
    private int anio;

    //Constructor

    public Auto(String marca, String modelo, int anio) {
        marca = marca;
        modelo = modelo;
        anio = anio;
    }

    //Metodo

    public void arrancar(){
        System.out.println("El auto marca " +  marca + " " + modelo + " anio " + anio + " esta arrancando.");
    }

}
