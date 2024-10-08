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
            NodoListaDoble nodoBuscado = buscaNodo(longitud()); // busco el ultimo elemento de la lista antes de agregar el nuevo ultimo
            nodoBuscado.setSiguiente(new NodoListaDoble(elemento)); // agrego ultimo elemento
            nodoBuscado.getSiguiente().setAnterior(nodoBuscado); // al ultimo elemento le seteo el nodo anterior al ultimo (viejo ultimo)
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
        if (posicionValida(posicionARecuperar)) {
            NodoListaDoble nodo = primerElemento;
            int posicionActual = 1;
            while (posicionActual != posicionARecuperar) {
                nodo = nodo.getSiguiente();
                posicionActual++;
            }
            return nodo;
        } else {
            return null;
        }
    }

    public int longitud() {
        return cantidadElementos;
    }

    public void eliminar(int posicion) {
        if (posicionValida(posicion)){
            if (posicion == 1){
                primerElemento = primerElemento.getSiguiente();
                primerElemento.setAnterior(null);
            } else {
                NodoListaDoble nodoAnterior = buscaNodo(posicion-1);
                NodoListaDoble nodoAEliminar = nodoAnterior.getSiguiente();
                nodoAnterior.setSiguiente(nodoAEliminar.getSiguiente());
                if (nodoAnterior.getSiguiente() != null) {
                    nodoAnterior.getSiguiente().setAnterior(nodoAnterior);
                }
            }
            cantidadElementos--;
        }
    }

    public void insertar(Object elementoAInsertar, int posicion) {
        if (posicionValida(posicion)){
            NodoListaDoble nodoAInsertar = new NodoListaDoble(elementoAInsertar);
            if (posicion == 1){
                primerElemento.setAnterior(nodoAInsertar);
                nodoAInsertar.setSiguiente(primerElemento);
                primerElemento = nodoAInsertar;
            } else {
                NodoListaDoble nodoAnteriorAlInsertado = buscaNodo(posicion-1);
                NodoListaDoble nodoSiguienteAlInsertado = nodoAnteriorAlInsertado.getSiguiente();
                nodoAnteriorAlInsertado.setSiguiente(nodoAInsertar);
                nodoSiguienteAlInsertado.setAnterior(nodoAInsertar);
                nodoAInsertar.setSiguiente(nodoSiguienteAlInsertado);
                nodoAInsertar.setAnterior(nodoAnteriorAlInsertado);
            }
            cantidadElementos++;
        }
    }


    public String toStringDelPrimerAlUltimoElemento(){
        String listadoDeElementos = "";
        NodoListaDoble nodo = this.primerElemento;
        while (nodo != null){
            listadoDeElementos += nodo.getElemento() + "\n";
            nodo = nodo.getSiguiente();
        }
        return listadoDeElementos;
    }

    public String toStringDelUltimoAlPrimerElemento() {
        String listadoDeElementos = "";
        NodoListaDoble nodo = buscaNodo(longitud());
        while (nodo != null) {
            listadoDeElementos += nodo.getElemento() + "\n";
            nodo = nodo.getAnterior();
        }
        return listadoDeElementos;
    }

}
