package com.empresa.canut.carlos.libreria_personas;

import java.util.ArrayList;

public class Principal {
    pulic static void main (String args[]) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona(29180796, "Andres", "Tomas"));

        personas.get(0).anyadir(new Telefono("Movil",625969943));
        personas.get(0).anyadir(new Telefono("Trabajo", 963782039));

        Persona p = buscar(personas,"Andres");
        p.mostrarTelefonos();
    }

    public static Persona buscar(ArrayList<Persona> personas, String nombre){

    }
}
