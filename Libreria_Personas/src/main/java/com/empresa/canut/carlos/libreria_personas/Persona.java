package com.empresa.canut.carlos.libreria_personas;


import java.util.ArrayList;

public class Persona {
    private String dni;
    private String nombre;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    private int edad;
    private String sexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public ArrayList<telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<telefono> telefonos) {
        this.telefonos = telefonos;
    }

    private String nacionalidad;
    private ArrayList<telefono> telefonos = new ArrayList<>();

}
