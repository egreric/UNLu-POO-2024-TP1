package ar.edu.unlu.poo.tp1.ej4;

public class NodoCola {
    private Object dato;
    private NodoCola siguiente = null;

    public NodoCola(Object dato) {
        this.dato = dato;
    }

    public Object getElemento(){
        return dato;
    }

    public void setSiguiente(NodoCola nodoCola) {
        siguiente = nodoCola;
    }

    public NodoCola getSiguiente(){
        return siguiente;
    }
}
