package listas.simples;

import actividad1.Producto;

public class Nodo {
    int dato;
    Producto producto;
    Nodo siguiente;
    //Constructor

    public Nodo(int dato) {
        this.dato=dato;
        this.siguiente=null;
    }
}
