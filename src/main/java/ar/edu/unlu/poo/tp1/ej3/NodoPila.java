package ar.edu.unlu.poo.tp1.ej3;

public class NodoPila {
    private Object dato;
    private NodoPila siguiente = null;

    public NodoPila(Object dato){
        this.dato = dato;
    }

    public Object getElemento(){
        return dato;
    }

    public NodoPila getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(NodoPila nodoSiguiente){
        this.siguiente = nodoSiguiente;

    }
}
