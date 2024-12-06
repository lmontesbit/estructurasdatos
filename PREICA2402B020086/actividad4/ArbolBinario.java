package actividad4;

public class ArbolBinario {

    private Nodo raiz;

    public void insertar(int valor) {
        raiz=insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, valor);
        }else if(valor>nodo.valor){
            nodo.derecho = insertarRecursivo(nodo.derecho,valor);
        }

        return nodo;
    }
    public void preOrden(){
        System.out.println("Preorden: ");
        preOrdenRecursivo(raiz);

    }
    private void preOrdenRecursivo(Nodo nodo){
        if(nodo!=null){
            System.out.println(nodo.valor+" ");
            preOrdenRecursivo(nodo.izquierdo);
            preOrdenRecursivo(nodo.derecho);
        }
    }

    public void postOrden(){
        System.out.println("Postorden: ");
        postOrdenRecursivo(raiz);

    }
    private void postOrdenRecursivo(Nodo nodo){
        if(nodo!=null){
            preOrdenRecursivo(nodo.izquierdo);
            preOrdenRecursivo(nodo.derecho);
            System.out.println(nodo.valor+" ");
        }
    }

    public void inOrden(){
        System.out.println("Inorden: ");
        inOrdenRecursivo(raiz);

    }
    private void inOrdenRecursivo(Nodo nodo){
        if(nodo!=null){
            preOrdenRecursivo(nodo.izquierdo);
            System.out.println(nodo.valor+" ");
            preOrdenRecursivo(nodo.derecho);
            
        }
    }

}
