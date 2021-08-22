package org.example.myclasses;


import lombok.Getter;
import lombok.Setter;

public class Persona {

    @Setter
    @Getter

    // Atributos
    private String nombre;
    private String apellido;
    private int edad;


    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " " + apellido + " y tengo " + edad + " anios");
    }
}

