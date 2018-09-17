package com.empresa.canut.carlos.libreria_personas;

import java.util.ArrayList;

public class Principal {
    pulic static void main (String args[]) {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        Persona yo = new Persona(21005748,"Carlos","Canut");
        personas.add(yo);

        yo.anyadir(new Telefono("Movil", 684521457));
        yo.anyadir(new Telefono("Trabajo", 963254512));

        //buscar una persona dado un nombre
        Persona p = buscar(personas,"Carlos");
        //Mostrar todos los telefonos de una persona
        p.mostrarTelefonos();
    }

    public static Persona buscar(ArrayList<Persona> personas, String nombre){

    }
}
