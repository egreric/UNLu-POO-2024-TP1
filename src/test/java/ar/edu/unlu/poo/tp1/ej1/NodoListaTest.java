package ar.edu.unlu.poo.tp1.ej1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NodoListaTest {
    NodoLista nodoLista;

    @Test
    public void probarQueAlCrearNodoElElementoVale10(){
        nodoLista = new NodoLista(10);
        assertEquals(10, nodoLista.getElemento());
    }

    @Test
    public void probarQueAlCrearNodoElElementoValeHola(){
        nodoLista = new NodoLista("Hola");
        assertEquals("Hola",nodoLista.getElemento());
    }

    @Test
    public void probarQueSiNodoNoTieneSiguienteAsignadoEsNulo(){
        nodoLista = new NodoLista(true);
        assertNull(nodoLista.getSiguiente());
    }

    @Test
    public void probarQueSiNodoTieneSiguienteVale10(){
        nodoLista = new NodoLista("Diez");
        nodoLista.setSiguiente(new NodoLista(10));
        assertEquals(10,nodoLista.getSiguiente().getElemento());
    }

    @Test
    public void probarQueSiNodoTieneSiguienteValeHola(){
        nodoLista = new NodoLista("Diez");
        nodoLista.setSiguiente(new NodoLista("Hola"));
        assertEquals("Hola",nodoLista.getSiguiente().getElemento());
    }

    @Test
    public void probarQueSiNodoTieneSiguienteAsignadoEsOtroNodo(){
        nodoLista = new NodoLista(1);
        nodoLista.setSiguiente(new NodoLista(2));
        assertInstanceOf(NodoLista.class,nodoLista.getSiguiente());
    }

}
