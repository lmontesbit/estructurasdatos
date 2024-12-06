package listas.circulares;

public class ListaCircular {
    Nodo cabecera = null;
    Nodo cola = null;

    public void agregarNodoCola(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        //La lista esta vacia , el nuevo nodo será cabecera y cola, además apunta al primer y último nodo 
        if(cabecera == null){
            cabecera = nuevoNodo;
            cola=nuevoNodo;
            nuevoNodo.siguiente = cabecera;
            nuevoNodo.anterior=cola;
        }else{
            cola.siguiente=nuevoNodo;//El siguiente del nodo (0) se referencia al nuevo nodo
            nuevoNodo.anterior=cola;//El anterior del nuevo nodo genera la referencia al nodo(0)
            cola=nuevoNodo;//El nuevo nodo se convierte en el último nodo o nodo(1)
            cola.siguiente=cabecera;//El siguiente del nuevo nodo (1) referencia al primer nodo, generando la lista circular
            cabecera.anterior=cola;//El anterior del primer nodo(0) genera referencia al nuevo nodo(1)
        }
    }

    public void imprimirListasCirculares(){

        if(cabecera!=null){
            Nodo actual = cabecera;
            do{
                System.out.println("["+actual.dato+"]->");
                actual = actual.siguiente;
            } while (actual != cabecera);

        }
       
        
    }
}
