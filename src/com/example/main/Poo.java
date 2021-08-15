package com.example.main;

import com.example.main.myclasses.Auto;
import com.example.main.myclasses.Persona;

public class Poo {
    public static void main(String[] args) {

        // Crear dos personas que saluden
        Persona facu = new Persona("Facundo", "Bohle", 25);

        Persona fede = new Persona("Federico", "Bohle", 29);

        facu.saludar();
        fede.saludar();


        // Crear dos autos que arranquen

        Auto nissan = new Auto("Nissan", "Sentra", 2015);
        nissan.arrancar();

        Auto mercedes = new Auto("Mercedes Benz", "q7", 2019);
        mercedes.arrancar();

    }
}
