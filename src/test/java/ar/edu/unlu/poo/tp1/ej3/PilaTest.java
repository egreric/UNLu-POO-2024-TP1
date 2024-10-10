package ar.edu.unlu.poo.tp1.ej3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilaTest {
    Pila pila;

    @BeforeEach
    void setUp(){
        pila = new Pila();
    }

    @Test
    public void prueboQueTopeVale1(){
        pila.apilar(1);
        assertEquals(1,pila.recuperarTope());
    }
    @Test
    public void probarQueTopeVale20(){
        pila.apilar(20);
        assertEquals(20, pila.recuperarTope());
    }

    @Test
    public void prueboQueTopeValeHola(){
        pila.apilar("Hola");
        assertEquals("Hola",pila.recuperarTope());
    }

    @Test
    public void prueboQueDesapilandoUnElementoElTopeAhoraVale2(){
        pila.apilar(2);
        pila.apilar("Hola");
        pila.desapilar();
        assertEquals(2, pila.recuperarTope());

    }

    @Test
    public void prueboQuePilaSinELementosEsVacia(){
        pila = new Pila();
        assertTrue(pila.esVacia());
    }

}
