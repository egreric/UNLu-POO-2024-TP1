package ar.edu.unlu.poo.tp1.ej2;

public class MainEj2 {

    public static void main(String[] args) throws Exception {
        ListaEnlazadaDoble lista = new ListaEnlazadaDoble();
        System.out.println("---------- LISTA CREADA SIN ELEMENTOS ---------");
        if (lista.esVacia()) {
            System.out.println("La lista esta vacia");
        }
        System.out.println("Cantidad de elementos de la lista: " + lista.longitud());
        System.out.println(lista.toStringDelPrimerAlUltimoElemento() + "\n");

        System.out.println("---------- PRIMER LISTADO ----------");
        lista.agregar("Primer Elemento");
        lista.agregar("Segundo Elemento");
        lista.insertar("Elemento insertado",2);
        System.out.println(lista.toStringDelPrimerAlUltimoElemento());
        System.out.println("---------- listado al reves ----------");
        System.out.println(lista.toStringDelUltimoAlPrimerElemento() + "\n");

        System.out.println("---------- ELIMINAMOS ELEMENTO DE LA POSICION 2: ----------");
        lista.eliminar(2);
        System.out.println(lista.toStringDelPrimerAlUltimoElemento());
        System.out.println("---------- listado al reves ----------");
        System.out.println(lista.toStringDelUltimoAlPrimerElemento() + "\n");

        System.out.println("---------- INSERTAMOS ELEMENTO EN POSICION 1(4): ----------");
        lista.insertar(4,1);
        System.out.println(lista.toStringDelPrimerAlUltimoElemento());
        System.out.println("---------- listado al reves ----------");
        System.out.println(lista.toStringDelUltimoAlPrimerElemento() + "\n");

        System.out.println("Cantidad de elementos de la lista: " + lista.longitud());
        System.out.println("El primer elemento de la lista es: " + lista.recuperar(1));
        System.out.println("El segundo elemento de la lista es: " + lista.recuperar(2));
        System.out.println("El tercer elemento de la lista es: " + lista.recuperar(3));
        if (!lista.esVacia()){
            System.out.println("La lista no esta vacia");
        }

    }
}
