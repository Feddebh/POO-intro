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

    // Setter
    public void setEdad(int edadNueva) {
        edad = edadNueva;
    }

    public void setApellido(String apellidoNuevo){
        apellido = apellidoNuevo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters
    public int getEdad() {
        return edad;
    }

    public String getApellido(){
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }
}
