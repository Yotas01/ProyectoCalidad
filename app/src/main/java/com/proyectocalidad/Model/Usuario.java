package com.proyectocalidad.Model;

import java.util.Objects;

public class Usuario {
    private String nombre;
    private String correo;
    private int celular;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return celular == usuario.celular && Objects.equals(nombre, usuario.nombre) && Objects.equals(correo, usuario.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, correo, celular);
    }

    public Usuario() {
    }

    public Usuario(String nombre, String correo, int celular) {
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
    }
}
