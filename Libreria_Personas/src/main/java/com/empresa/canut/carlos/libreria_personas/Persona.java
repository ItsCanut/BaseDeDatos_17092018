package com.empresa.canut.carlos.libreria_personas;


import java.util.ArrayList;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private ArrayList<Telefono> telefonos = new ArrayList<>();
    private int edad;
    private String sexo;



    public Persona(int dni,String Nombre, String Apellido){
        this.dni = dni;
        this.nombre = Nombre;
        this.apellido = Apellido;
    }


    public void anyadir(Telefono P1) {
        this.telefonos.add(P1);
    }


    public void mostrarTelefonos(){
        for(int i = 0; i<this.telefonos.size();i++){
            System.out.println(this.telefonos.get(i));
        }
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


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

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }



}
