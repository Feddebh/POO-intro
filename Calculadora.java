package com.example.classes;

public class Calculadora {
    public static void main(String[] args) {
        Calculos miCalculadora = new Calculos(12, 5);
        System.out.println("La suma es: " + miCalculadora.sumar());
        System.out.println("La resta es: " + miCalculadora.restar());
        System.out.println("La multiplicacion es: " + miCalculadora.multiplicar());
        System.out.println("La division es: " + miCalculadora.dividir());
    }
}
