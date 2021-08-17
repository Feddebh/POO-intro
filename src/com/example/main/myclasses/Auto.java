package com.example.main.myclasses;

public class Auto {

    //Atributos
    private String marca;
    private String modelo;
    private int anio;

    //Constructor

    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }


    //Metodo

    public void arrancar(){
        System.out.println("El auto marca " +  marca + " " + modelo + " anio " + anio + " esta arrancando.");
    }

    //getters


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio(){
        return anio;
    }

    //setters
    public void setMarca(String marcaNueva) {marca = marcaNueva;}

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
