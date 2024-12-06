package pilas.lifo;

public class Pilas<T> {
    Nodo<T> cima=null;

    public void push(T dato){
        Nodo<T> nuevoNodo=new Nodo<T>(dato);
        nuevoNodo.siguiente=cima;
        cima=nuevoNodo;
    }
    public T pop(){
        if(cima==null){
            System.out.println("La pila está vacia");
            throw new RuntimeException("La pila está vacia");
        }
        //else{
        T dato=cima.dato;
        cima=cima.siguiente;
        //}
        return dato;
    }
    public T peek(){
        if(cima==null){
            System.out.println("La pila está vacia");
            throw new RuntimeException("La pila está vacia");
        }
        return cima.dato;
    }

    public boolean isEmpty(){
        //return cima==null;

        if(cima==null){
            return true;
        }else{
            return false;
        }
    }


    
}
