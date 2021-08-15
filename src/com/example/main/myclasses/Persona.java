package com.example.main.myclasses;

public class Persona {
    //Atributos

    private String nombre;
    private String apellido;
    private int edad;

    //Metodo constructor


    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Metodo

    public void saludar(){
        System.out.println("Buen dia, mi nombre es " + nombre + " " + apellido + " y tengo " + edad + " anios.");
    }
}
