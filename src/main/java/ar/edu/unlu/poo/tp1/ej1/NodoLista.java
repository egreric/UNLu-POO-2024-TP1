package ar.edu.unlu.poo.tp1.ej1;

public class NodoLista {
    private Object dato;
    private NodoLista siguiente;

    public NodoLista(Object dato) {
        this.dato = dato;
    }
    public Object getElemento() {
        return dato;

    }
    public NodoLista getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoLista nodoSiguiente) {
        siguiente = nodoSiguiente;
    }
}
