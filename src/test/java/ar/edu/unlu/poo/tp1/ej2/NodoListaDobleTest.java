package ar.edu.unlu.poo.tp1.ej2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NodoListaDobleTest {
    NodoListaDoble nodoLista;

    @Test
    public void probarQueAlCrearNodoElElementoVale10(){
        nodoLista = new NodoListaDoble(10);
        assertEquals(10, nodoLista.getElemento());
    }

    @Test
    public void probarQueAlCrearNodoElElementoValeHola(){
        nodoLista = new NodoListaDoble("Hola");
        assertEquals("Hola",nodoLista.getElemento());
    }

    @Test
    public void probarQueSiNodoNoTieneSiguienteAsignadoEsNulo(){
        nodoLista = new NodoListaDoble(true);
        assertNull(nodoLista.getSiguiente());
    }

    @Test
    public void probarQueSiNodoTieneSiguienteVale10(){
        nodoLista = new NodoListaDoble("Diez");
        nodoLista.setSiguiente(new NodoListaDoble(10));
        assertEquals(10,nodoLista.getSiguiente().getElemento());
    }

    @Test
    public void probarQueSiNodoTieneSiguienteValeHola(){
        nodoLista = new NodoListaDoble("Diez");
        nodoLista.setSiguiente(new NodoListaDoble("Hola"));
        assertEquals("Hola",nodoLista.getSiguiente().getElemento());
    }

    @Test
    public void probarQueSiNodoTieneSiguienteAsignadoEsOtroNodo(){
        nodoLista = new NodoListaDoble(1);
        nodoLista.setSiguiente(new NodoListaDoble(2));
        assertInstanceOf(NodoListaDoble.class,nodoLista.getSiguiente());
    }

}
