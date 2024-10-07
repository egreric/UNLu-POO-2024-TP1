package ar.edu.unlu.poo.tp1.ej1;

public class ListaEnlazadaSimple {
    private NodoLista primerElemento = null;
    private int cantidadElementos = 0;
    public boolean esVacia() {
        return cantidadElementos == 0;
    }

    public void agregar(Object elemento) {
        if (esVacia()) {
            primerElemento = new NodoLista(elemento);
        } else {
            buscaNodo(longitud()).setSiguiente(new NodoLista(elemento));
        }
        cantidadElementos++;

    }

    public Object recuperar(int posicionARecuperar) throws Exception {
        if (posicionValida(posicionARecuperar)){
           return buscaNodo(posicionARecuperar).getElemento();
        } else {
            throw new Exception("Posicion fuera de rango..");
        }

    }

    private boolean posicionValida(int posicion){
        return (posicion > 0) && (posicion <= cantidadElementos);
    }

    private NodoLista buscaNodo(int posicionARecuperar) {
        NodoLista nodo = primerElemento;
        int posicionActual = 1;
        while (posicionActual != posicionARecuperar) {
            nodo = nodo.getSiguiente();
            posicionActual++;
        }
        return nodo;
    }

    public int longitud() {
        return cantidadElementos;
    }

    public void eliminar(int posicion) {
        if (posicionValida(posicion)){
            if (posicion == 1){
                primerElemento = primerElemento.getSiguiente();
            } else {
                NodoLista nodoAnterior = buscaNodo(posicion-1);
                NodoLista nodoAEliminar = nodoAnterior.getSiguiente();
                nodoAnterior.setSiguiente(nodoAEliminar.getSiguiente());
            }
            cantidadElementos--;
        }
    }

    public void insertar(Object elementoAInsertar, int posicion) {
        if (posicionValida(posicion)){
            NodoLista nodoAInsertar = new NodoLista(elementoAInsertar);
            if (posicion == 1){
                nodoAInsertar.setSiguiente(primerElemento);
                primerElemento = nodoAInsertar;
            } else {
                NodoLista nodoAnteriorAlInsertado = buscaNodo(posicion-1);
                NodoLista nodoSiguienteAlInsertado = nodoAnteriorAlInsertado.getSiguiente();
                nodoAnteriorAlInsertado.setSiguiente(nodoAInsertar);
                nodoAInsertar.setSiguiente(nodoSiguienteAlInsertado);
            }
            cantidadElementos++;
        }
    }


    public String toString(){
        String listadoDeElementos = "";
        NodoLista nodo = this.primerElemento;
        while (nodo != null){
            listadoDeElementos += nodo.getElemento() + "\n";
            nodo = nodo.getSiguiente();
        }
        return listadoDeElementos;
    }

}
