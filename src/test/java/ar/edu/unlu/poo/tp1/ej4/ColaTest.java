package ar.edu.unlu.poo.tp1.ej4;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ColaTest {
    Cola cola;

    @BeforeEach
    void setUp(){
        cola = new Cola();
    }

    @Test
    public void probarQueElPrimeroDeLaColaEs1(){
        cola.encolar(1);
        cola.encolar(2);
        assertEquals(1, cola.recuperar());
    }

    @Test
    public void probarQueElPrimeroDeLaColaEs2(){
        cola.encolar(2);
        cola.encolar(3);
        assertEquals(2, cola.recuperar());
    }

    @Test
    public void probarQueElPrimeroDeLaColaEsHola(){
        cola.encolar("Hola");
        cola.encolar(20);
        assertEquals("Hola", cola.recuperar());
    }

    @Test
    public void probarQueElPrimeroDeLaColaLuegoDeDesencolarEsHola(){
        cola.encolar(20);
        cola.encolar("Hola");
        cola.encolar(false);
        cola.desencolar();
        assertEquals("Hola", cola.recuperar());
    }

    @Test
    public void probarQueAlDesapilarUnaColaYDejarlaSinElementosDevuelveVaciaTrue(){
        cola.encolar(2323);
        cola.encolar("asdsad");
        cola.encolar(true);
        cola.desencolar();
        cola.desencolar();
        cola.desencolar();
        cola.encolar(15);
        cola.desencolar();
        assertTrue(cola.esVacia());
    }

}
