package listas.simples;

public class ListaSimple {
    Nodo cabecera;

    public ListaSimple() {
        this.cabecera = null;
    }

    public void crearNodo(int dato) {
        // Crear nuevo nodo
        Nodo nuevoNodo = new Nodo(dato);

        // Si la lista está vacia, el nuevo nodo será la cabecera
        if (cabecera == null) {
            cabecera = nuevoNodo;
            // return;
        } else {
            Nodo actual = cabecera;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }

    }

    public void visualizarNodo(){
        Nodo actual = cabecera;
        while (actual != null) {
            System.out.println("["+actual.dato+"]->");
            actual = actual.siguiente;
        }
    }

}
