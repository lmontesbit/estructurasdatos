package listas.simples;

public class ListaSimple {
    Nodo cabecera;

    public ListaSimple() {
        this.cabecera = null;
    }

    // Crear un nuevo nodo de la lista
    public void agregarNodo(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        // Si la lista esta vacía, el nuevo nodo sera la cabecera
        if (cabecera == null) {
            cabecera = nuevoNodo;
            // return;
        } else {
        //Si no es cabecera se crea un siguiente nodo y se integra al anterior
            Nodo actual = cabecera;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void mostrarListaSimple(){
        Nodo actual = cabecera;
            while (actual != null) {
                System.out.println("["+actual.dato+"]"); 
                actual = actual.siguiente;
            }
            
    }

}
