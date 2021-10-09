package com.proyectocalidad.Model;

import java.util.Objects;

public class Plato {
    private String nombre;
    private String descripcion;
    private Double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plato plato = (Plato) o;
        return Objects.equals(nombre, plato.nombre) && Objects.equals(descripcion, plato.descripcion) && Objects.equals(precio, plato.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion, precio);
    }

    public Plato() {
    }

    public Plato(String nombre, String descripcion, Double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
}
