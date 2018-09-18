package com.empresa.canut.carlos.libreria_personas;

import java.util.ArrayList;

public class Principal {
    public static void main (String args[]) {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        Persona yo = new Persona(21005748,"Carlos","Canut");
        personas.add(yo);

        yo.anyadir(new Telefono(21005748, 684521457, "Movil"));
        yo.anyadir(new Telefono(21005748, 963254512,"Trabajo"));

        //buscar una persona dado un nombre
        Persona p = buscar(personas,"Carlos");
        //Mostrar todos los telefonos de una persona
        p.mostrarTelefonos();
    }

    public static Persona buscar(ArrayList<Persona> personas, String nombre){
        for(int i = 0; i<personas.size(); i++){
            if(nombre == personas.get(i).getNombre()){
                return personas.get(i);
            }
        }
        return null;
    }
}
