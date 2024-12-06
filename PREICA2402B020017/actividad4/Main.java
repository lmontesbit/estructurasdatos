package actividad4;

public class Main {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        int[] valores = { 120, 75, 200, 50, 80, 60, 90, 250, 180, 110, 85 };
        for (int valor : valores) {
            arbol.insertar(valor);
        }
        arbol.preOrden();
        arbol.postOrden();
        arbol.inOrden();

    }

}
