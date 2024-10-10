package ar.edu.unlu.poo.tp1.ej4;

public class Cola {
    private int dato;
    private NodoCola primerElemento = null;
    private NodoCola ultimoElemento = null;

    public void encolar(Object dato) {
        NodoCola nuevoNodo = new NodoCola(dato);
        if(esVacia()){
            primerElemento = nuevoNodo;
        } else {
            ultimoElemento.setSiguiente(nuevoNodo);
        }
        ultimoElemento = nuevoNodo;
    }

    public boolean esVacia() {
        return (primerElemento == null);
    }

    public Object recuperar() {
        return primerElemento.getElemento();
    }

    public void desencolar() {
        if (!esVacia()){
            primerElemento = primerElemento.getSiguiente();
        }
    }
}
