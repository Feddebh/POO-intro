package com.example.main;

import com.example.main.vehiculos.Auto;
import com.example.main.vehiculos.Camion;
import com.example.main.vehiculos.Moto;

public class MainClass {
    public static void main(String[] args) {

        //OBJETO AUTO
        Auto bora = new Auto();
        bora.setMarcaMotor("Audi");
        bora.setVelocidadMaxima(180);
        bora.setNombre("Volkswagen Bora");
        bora.setAnio(2014);
        bora.setTipo("Automovil.");

        bora.mostrarMensaje();
        System.out.println("Categoria: " + bora.getTipo());
        System.out.println("Nombre: " + bora.getNombre());
        System.out.println("Modelo: " + bora.getAnio() );
        System.out.println("Marca del motor: " + bora.getMarcaMotor());
        System.out.println("Velocidad Maxima: " +bora.getVelocidad());

        //Separador (esto lo busque en google para que quede estetico nomas)
        String newLine = System.getProperty("line.separator");
        System.out.println(newLine);

        //OBJETO MOTO
        Moto ybr = new Moto();
        ybr.setNombre("Yamaha YBR.");
        ybr.setAnio(2017);
        ybr.setCilindrada("250 cc");
        ybr.setTipo("Motocicleta");
        ybr.setVelocidadMaxima(120);

        ybr.mostrarMensaje();
        System.out.println("Categoria: " + ybr.getTipo());
        System.out.println("Nombre: " + ybr.getNombre());
        System.out.println("Modelo: " + ybr.getAnio());
        System.out.println("Cilindrada: " + ybr.getCilindrada());
        System.out.println("Velocidad Maxima: " + ybr.getVelocidad());

                System.out.println(newLine);

        //OBJETO CAMION

        Camion iveco = new Camion();
        iveco.setNombre("Iveco Tector.");
        iveco.setAnio(2010);
        iveco.setTara("2500 kg");
        iveco.setVelocidadMaxima(90);
        iveco.setTipo("Camion.");

        iveco.mostrarMensaje();
        System.out.println("Categoria: " + iveco.getTipo());
        System.out.println("Nombre: " + iveco.getNombre());
        System.out.println("Modelo: " + iveco.getAnio());
        System.out.println("Tara: " + iveco.getTara());
        System.out.println("Velocidad Maxima: " + iveco.getVelocidad());


    }
}
