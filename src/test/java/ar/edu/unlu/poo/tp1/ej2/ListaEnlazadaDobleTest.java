package ar.edu.unlu.poo.tp1.ej2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListaEnlazadaDobleTest {
    ListaEnlazadaDoble lista;

    @BeforeEach
    void setUp() {
        lista = new ListaEnlazadaDoble();
    }

    @Test
    public void probarQueListaSinElementosEsVacia(){
        assertTrue(lista.esVacia());
    }

    @Test
    public void probarQueListaConUnElementoNoEsVacia(){
        String elemento = "Hola";
        lista.agregar(elemento);
        assertFalse(lista.esVacia());
    }

    @Test
    public void probarQueListaConUnElementoElPrimeroEsUno() throws Exception {
        lista.agregar(1);
        assertEquals(1,lista.recuperar(1));
    }

    @Test
    public void probarQueListaConDosElementosElPrimeroEsUnoYElSegundoEsTrue() throws Exception {
        lista.agregar(1);
        lista.agregar(true);
        assertEquals(1,lista.recuperar(1));
        assertEquals(true,lista.recuperar(2));
    }

    @Test
    public void probarQueRecuperarElementoFueraDeLongitudDeListaDaError(){
        lista.agregar(1);
        assertThrows(Exception.class, () -> lista.recuperar(3));
    }

    @Test
    public void probarQueListaSinElementosDevuelveLongitudCero(){
        assertEquals(0,lista.longitud());
    }

    @Test
    public void probarQueListaConUnElementoDevuelveLongitudUno(){
        lista.agregar(1);
        assertEquals(1,lista.longitud());
    }

    @Test
    public void probarQueListaConDosElementosDevuelveLongitudDos(){
        lista.agregar(1);
        lista.agregar(2);
        assertEquals(2,lista.longitud());
    }

    @Test
    public void probarQueAgregarElementoLoHaceAlFinalDeLaLista() throws Exception {
        lista.agregar(1);
        lista.agregar(true);
        lista.agregar("Hola");
        assertEquals("Hola",lista.recuperar(3));
    }

    @Test
    public void probarQueEliminarSegundoElementoDeLaListaMeDevuelveTresEnLaSegundaPosicion() throws Exception{
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.eliminar(2);
        assertEquals(3,lista.recuperar(2));
    }

    @Test
    public void probarQueEliminarUnElementoDeUnaListaDeTresElementosDaDos(){
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.eliminar(3);
        assertEquals(2,lista.longitud());
    }

    @Test
    public void probarQueInsertarUnElementoEnLaSegundaPosicionDaTres() throws Exception {
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.insertar("Elemento Insertado",2);
        assertEquals(1,lista.recuperar(1));
        assertEquals("Elemento Insertado",lista.recuperar(2));
        assertEquals(2,lista.recuperar(3));
        assertEquals(3,lista.recuperar(4));
    }

}
