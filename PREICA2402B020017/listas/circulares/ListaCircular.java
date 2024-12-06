package listas.circulares;

public class ListaCircular {
    Nodo cabecera = null;
    Nodo cola = null;

    public void agregarNodoCola(int dato){
        Nodo nuevoNodo = new Nodo(dato); 
        if(cabecera == null){
            cabecera = nuevoNodo;
            cola=nuevoNodo;
            nuevoNodo.siguiente =cabecera;//El siguiente del nuevo nodo referencia al primer nodo
            nuevoNodo.anterior=cola;//El anterior del nuevo nodo referencia al último nodo
        }else{
            cola.siguiente = nuevoNodo;//El siguiente del último nodo actual referencia al nuevo nodo
            nuevoNodo.anterior=cola;//El anterior del nuevo nodo referencia al último nodo
            cola=nuevoNodo;//El nuevo nodo se convierte en el último nodo
            cola.siguiente=cabecera;//El siguiente del nuevo nodo referencia al primero nodo, generando el ciclo
            cabecera.anterior=cola;//El anterior del primero nodo referencia al nuevo nodo
        }
    }
    public void listarNodo(){

        if(cabecera!=null){
            Nodo actual=cabecera;

            do{
                System.out.println(actual.dato+" ");
                actual=actual.siguiente;
            }while(actual!=cabecera);
        }
       
    }

}
