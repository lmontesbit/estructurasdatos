package actividad3;

public class Nodo {
    Nodo siguiente;
    Nodo anterior;
    Departamento departamento;

    public Nodo(Departamento departamento) {
        this.siguiente = null;
        this.anterior = null;
        this.departamento = departamento;
    }    
    
}
