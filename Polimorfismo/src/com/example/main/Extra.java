package com.example.main;

import java.util.ArrayList;

public class Extra {

    ArrayList<SerVivo> lista = new ArrayList<>();

    public Extra ()
    {
        lista.add(new Animal("Felino."));
        lista.add(new Animal("Pez."));
        lista.add(new Animal("Reptil."));
        lista.add(new Humano("Masculino."));
        lista.add(new Humano("Femenina."));
        lista.add(new Planta("Cactus."));
        lista.add(new Planta("Carnivora."));
        lista.add(new Planta("Helecho."));
    }

    public void invocar()
    {
        for (SerVivo sb:lista
             ) {
            sb.alimentarse();
        }



    }

}
