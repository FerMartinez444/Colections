package org.example.entities;

public class Alumno {
    private String nombre;
    private int nota;

    //Constructor
    public Alumno(String nombre, int nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}