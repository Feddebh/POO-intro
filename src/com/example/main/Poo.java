package com.example.main;

import com.example.main.myclasses.Auto;
import com.example.main.myclasses.Persona;

public class Poo {
    public static void main(String[] args) {

        // Crear dos personas que saluden
        Persona facu = new Persona("Facundo", "Bohle", 25);
        facu.saludar();
        // Setter edad (Yo le paso informacion al objeto facu)
        facu.setEdad(26);
        facu.saludar();
        //  Getter edad (Yo quiero extraer informacion del objeto facu)
        System.out.println("La edad de facu es "+facu.getEdad());

        // Setter apellido (Yo le cambio el nombre a facu, le pongo Bohler)
        facu.setApellido("Bohler");


        // Getter apellido (Quiero conocer que apellido tiene facu(

        System.out.println("El apellido de facu es " + facu.getApellido() + " .");

        Persona fede = new Persona("Federico", "Bohle", 29);
        fede.saludar();


        // Crear dos autos que arranquen
        Auto nissan = new Auto("Nissan", "Sentra", 2015);
        nissan.arrancar();
        nissan.setModelo("Vectra");
        System.out.println("El modelo del auto es " + nissan.getModelo());


        Auto mercedes = new Auto("Mercedes Benz", "q7", 2019);
        mercedes.arrancar();
        mercedes.setMarca("Mercedes.");
        System.out.println("La marca del auto es " + mercedes.getMarca());

    }
}
