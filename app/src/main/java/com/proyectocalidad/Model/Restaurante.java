package com.proyectocalidad.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Restaurante {
    private String nombre;
    private int estrellas;
    private String correo;
    private List<Plato> menu;

    public void agregarPlato(Plato plato){
        menu.add(plato);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Plato> getMenu() {
        return menu;
    }

    public void setMenu(List<Plato> menu) {
        this.menu = menu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurante that = (Restaurante) o;
        return estrellas == that.estrellas && Objects.equals(nombre, that.nombre) && Objects.equals(correo, that.correo) && Objects.equals(menu, that.menu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, estrellas, correo, menu);
    }

    public Restaurante() {
    }

    public Restaurante(String nombre, int estrellas, String correo) {
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.correo = correo;
        this.menu = new ArrayList<>();
    }

    public Restaurante(String nombre, int estrellas, String correo, List<Plato> menu) {
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.correo = correo;
        this.menu = menu;
    }
}
