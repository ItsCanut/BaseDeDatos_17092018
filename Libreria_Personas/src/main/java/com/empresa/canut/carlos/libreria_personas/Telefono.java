package com.empresa.canut.carlos.libreria_personas;

public class Telefono {
    private int dni;
    private int numero;
    private String descripcion;

    public Telefono(int dni,int numero, String descripcion){
        this.dni = dni;
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
