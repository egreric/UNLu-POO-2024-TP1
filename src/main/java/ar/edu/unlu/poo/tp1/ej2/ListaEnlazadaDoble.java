package ar.edu.unlu.poo.tp1.ej2;
public class ListaEnlazadaDoble {
    private NodoListaDoble primerElemento = null;
    private int cantidadElementos = 0;
    public boolean esVacia() {
        return cantidadElementos == 0;
    }

    public void agregar(Object elemento) {
        if (esVacia()) {
            primerElemento = new NodoListaDoble(elemento);
        } else {
            buscaNodo(longitud()).setSiguiente(new NodoListaDoble(elemento));
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

    private NodoListaDoble buscaNodo(int posicionARecuperar) {
        NodoListaDoble nodo = primerElemento;
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
                NodoListaDoble nodoAnterior = buscaNodo(posicion-1);
                NodoListaDoble nodoAEliminar = nodoAnterior.getSiguiente();
                nodoAnterior.setSiguiente(nodoAEliminar.getSiguiente());
            }
            cantidadElementos--;
        }
    }

    public void insertar(Object elementoAInsertar, int posicion) {
        if (posicionValida(posicion)){
            NodoListaDoble nodoAInsertar = new NodoListaDoble(elementoAInsertar);
            if (posicion == 1){
                nodoAInsertar.setSiguiente(primerElemento);
                primerElemento = nodoAInsertar;
            } else {
                NodoListaDoble nodoAnteriorAlInsertado = buscaNodo(posicion-1);
                NodoListaDoble nodoSiguienteAlInsertado = nodoAnteriorAlInsertado.getSiguiente();
                nodoAnteriorAlInsertado.setSiguiente(nodoAInsertar);
                nodoAInsertar.setSiguiente(nodoSiguienteAlInsertado);
            }
            cantidadElementos++;
        }
    }


    public String toString(){
        String listadoDeElementos = "";
        NodoListaDoble nodo = this.primerElemento;
        while (nodo != null){
            listadoDeElementos += nodo.getElemento() + "\n";
            nodo = nodo.getSiguiente();
        }
        return listadoDeElementos;
    }

}
