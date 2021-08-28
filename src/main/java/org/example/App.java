package org.example;

import org.example.myclasses.Persona;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Persona fede = new Persona();
        fede.setNombre("Federico");
        fede.setApellido("Bohle");
        fede.setEdad(29);

        fede.saludar();

    }
}
