package ar.edu.unlu.poo.tp1.ej2;

public class NodoListaDoble {
    private Object dato;
    private NodoListaDoble siguiente;

    public NodoListaDoble(Object dato) {
        this.dato = dato;
    }
    public Object getElemento() {
        return dato;

    }
    public NodoListaDoble getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoListaDoble nodoSiguiente) {
        siguiente = nodoSiguiente;
    }
}
