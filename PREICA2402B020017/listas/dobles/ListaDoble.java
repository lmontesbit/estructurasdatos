package listas.dobles;

public class ListaDoble {
    Nodo cabecera;
    Nodo cola;

    public ListaDoble(){
        this.cabecera = null;
        this.cola = null;
    }

    public void agregarNodoCola(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        // Si la lista esta vacía, el nuevo nodo sera la cabecera
        if (cabecera == null) {
            cabecera = nuevoNodo;
            cola=nuevoNodo;
        }else{
            //De lo contrario se añade el nuevo nodo al final de la lista
            cola.siguiente=nuevoNodo;
            nuevoNodo.anterior=cola;
            cola=nuevoNodo;

        }
    }
    public void agregarNodoCabecera(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        // Si la lista esta vacía, el nuevo nodo sera la cabecera
        if (cabecera == null) {
            cabecera = nuevoNodo;
            cola=nuevoNodo;
        }else{
            //De lo contrario se añade el nuevo nodo al inicio de la lista
            nuevoNodo.siguiente=cabecera;
            cabecera.anterior=nuevoNodo;
            cabecera=nuevoNodo;
           

        }
    }




    
}
