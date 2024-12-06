package listas.doble;

public class ListaDoble {
    Nodo cabecera;
    Nodo cola;

    public ListaDoble() {
        this.cabecera = null;
        this.cola = null;
    }
    public void crearNodoFinal(int dato) {
        // Crear nuevo nodo
        Nodo nuevoNodo = new Nodo(dato);
        //La lista esta vacia , el nuevo nodo será cabecera y cola
        if(cabecera == null){
            cabecera = nuevoNodo;
            cola=nuevoNodo;
        }else{
            //De lo contrario, se añade el nuevo nodo al final de la lista
            cola.siguiente=nuevoNodo;
            nuevoNodo.siguiente=cola;
            cola=nuevoNodo;
        }    
    }
    public void crearNodoInicio(int dato) {
        // Crear nuevo nodo
        Nodo nuevoNodo = new Nodo(dato);
        //La lista esta vacia , el nuevo nodo será cabecera y cola
        if(cabecera == null){
            cabecera = nuevoNodo;
            cola=nuevoNodo;
        }else{
            //De lo contrario, se añade el nuevo nodo al inicio de la lista
            nuevoNodo.siguiente = cabecera;
            cabecera.anterior = nuevoNodo;
            cabecera=nuevoNodo;

           
        }    
    }



    
}
