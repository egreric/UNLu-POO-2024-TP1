package ar.edu.unlu.poo.tp1.ej3;

public class Pila {
    private NodoPila tope = null;

    public void apilar(Object dato) {
        NodoPila nuevoTope = new NodoPila(dato);
        nuevoTope.setSiguiente(tope);
        tope = nuevoTope;
    }

    public void desapilar() {
        tope = tope.getSiguiente();
    }

    public Object recuperarTope() {
        return tope.getElemento();
    }


    public boolean esVacia() {
        return (tope == null);
    }
}
