package pila.lifo;

public class Pila<T> {
    Nodo<T> cima;

    public Pila() {
        cima = null;
    }

    public void push(T dato) {
        Nodo<T> nuevoNodo = new Nodo<T>(dato);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;

    }
    public T pop(){
        if(cima==null){
            System.out.println("La pila está vacía");
           throw new RuntimeException("La pila está vacía");
        }
        T dato=cima.dato;
        cima=cima.siguiente;
        return dato;
    }
    public T peek(){
        if(cima==null){
            System.out.println("La pila está vacía");
           throw new RuntimeException("La pila está vacía");
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
