package actividad3;

public class ListaDobleDepto {
    Nodo cabeza;
    Nodo cola;

    public ListaDobleDepto() {
        this.cabeza = null;
        this.cola = null;
    }

    public void guardarDepto(Departamento depto) {
        Nodo nuevoNodo = new Nodo(depto);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.siguiente = cola;
            cola = nuevoNodo;
        }

    }

    public void mostrarDpto() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.departamento);
            actual = actual.siguiente;
        }

    }

    public Departamento mayorExtension(){
        Nodo actual = cabeza;
        Departamento mayorExtension=cabeza.departamento;
        while (actual != null) {

            if(actual.departamento.extension>mayorExtension.extension) {
                mayorExtension=actual.departamento;

            }
            actual = actual.siguiente;
        }
        return mayorExtension;

    }

}
