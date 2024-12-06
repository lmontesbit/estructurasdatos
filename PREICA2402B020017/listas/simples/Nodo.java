package listas.simples;

import arrayList.Estudiante;

public class Nodo {
    int dato;
    Estudiante estudiante;
    Nodo siguiente;

    //Constructor 
    public Nodo(int dato) {
        this.dato=dato;
        this.siguiente=null;
    }    
}
