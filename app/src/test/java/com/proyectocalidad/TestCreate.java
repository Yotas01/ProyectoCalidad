package com.proyectocalidad;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import com.proyectocalidad.Model.Plato;
import com.proyectocalidad.Model.Restaurante;
import com.proyectocalidad.Model.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TestCreate {
    @Test
    public void should_create_usuario(){
        Usuario user = new Usuario("Daniel","dani.monsalveg@gmail.com",300000000);
        Usuario userTest = new Usuario();
        userTest.setNombre("Daniel");
        userTest.setCorreo("dani.monsalveg@gmail.com");
        userTest.setCelular(300000000);
        Assert.assertEquals(user,userTest);
    }
    @Test
    public void add_plato(){
        Restaurante base = new Restaurante("Spoleto",4,"spoleto@gmail.com");
        base.agregarPlato(new Plato("Pasta","pasta muy rica",18.000));
        base.agregarPlato(new Plato("Ravioli","Con carne",15.000));
        List<Plato> platos = new ArrayList<>();
        platos.add(new Plato("Pasta","pasta muy rica",18.000));
        platos.add(new Plato("Ravioli","Con carne",15.000));
        Restaurante actual = new Restaurante("Spoleto",4,"spoleto@gmail.com",platos);
        Assert.assertEquals(base,actual);
    }
}