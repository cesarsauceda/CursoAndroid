package com.example.sauceda.cursoandroid.modelos;

/**
 * Created by sauceda on 6/02/18.
 */

public class Materia {

    private String clave;
    private String nombre;
    private String horario;
    private int creditos;
    private int imagen;

    public Materia(String clave, String nombre, String horario, int creditos,int imagen) {
        this.clave = clave;
        this.nombre = nombre;
        this.horario = horario;
        this.creditos = creditos;
        this.imagen=imagen;
    }

    public Materia() {
        this.clave = "";
        this.nombre = "";
        this.horario = "";
        this.creditos = -1;
        this.imagen=-1;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
