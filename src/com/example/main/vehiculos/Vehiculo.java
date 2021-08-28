package com.example.main.vehiculos;


//SUPERCLASE - COMPARTE CARACTERISTICAS

public class Vehiculo {

    private int velocidadMaxima;
    private String nombre;
    private int anio;
    private String tipo;

    //Getters & Setters
    public void mostrarMensaje(){
        System.out.println("CARACTERISTICAS DEL VEHICULO");
    }

    public void setVelocidadMaxima(int v) {
        velocidadMaxima = v;
    }

    public int getVelocidad(){
        return velocidadMaxima;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre(){
        return nombre;
    }

    public void setAnio(int yr){
        anio = yr;
    }

    public int getAnio() {
        return anio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

