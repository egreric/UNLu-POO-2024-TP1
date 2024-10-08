package ar.edu.unlu.poo.tp1.ej2;

public class NodoListaDoble {
    private Object dato;
    private NodoListaDoble siguiente;
    private NodoListaDoble anterior;

    public NodoListaDoble(Object dato) {
        this.dato = dato;
    }

    public Object getElemento() {
        return dato;

    }

    public void setSiguiente(NodoListaDoble nodoSiguiente) {
        siguiente = nodoSiguiente;
    }

    public NodoListaDoble getSiguiente() {
        return siguiente;
    }

    public void setAnterior(NodoListaDoble nodoAnterior) { anterior = nodoAnterior;
    }

    public NodoListaDoble getAnterior() { return anterior;
    }
}
