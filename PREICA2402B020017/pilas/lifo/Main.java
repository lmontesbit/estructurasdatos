package pilas.lifo;

import actividad1.Productos;

public class Main {

    public static void main(String[] args) {
        Pilas<String> pila = new Pilas<String>();
        pila.push("Dato 1");
        pila.push("Dato 2");

        System.out.println(pila.peek());//"Dato 2"
        System.out.println(pila.pop());//"Dato 2"
        System.out.println(pila.pop());//"Dato 1"

    }

}
