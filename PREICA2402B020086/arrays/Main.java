package arrays;

import java.util.ArrayList;
import java.util.List;

import actividad1.Producto;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Primer elemento del array " + array[0]);
        System.out.println("Último elemento del array " + array[array.length - 1]);
        for (int valor : array) {
            System.out.println("Elemento " + valor);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento " + array[i] + "-posición [" + i + "] ");
        }

        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Pera", 1000, 5));
        listaProductos.add(new Producto("Manzana", 1200, 5));

        for (Producto product : listaProductos) {
            System.out.print(product.toString());
        }
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println("Elementos de la lista" + listaProductos.get(i).toString());
            System.out.println("Nombre " + listaProductos.get(i).getNombre());
        }

        int[] sumaElementos = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int suma = 0;
        for (int valor : sumaElementos) {
            // suma=suma+valor;
            suma += valor;
        }
        System.out.println("La suma de los elementos es:" + suma);

        int[] arrayMayor = { 5, 3, 8, 1, 9, 2, 15 };
        int valorMaximo = arrayMayor[0];

        for (int i = 0; i < arrayMayor.length; i++) {
            if (arrayMayor[i] > valorMaximo) {
                valorMaximo = arrayMayor[i];
            }
        }
        System.out.println("El valor maximo: " + valorMaximo);

        int[] valores = new int[5];
        /*
         * valores[0]=10;
         * valores[1]=20;
         * valores[2]=30;
         * valores[3]=40;
         * valores[4]=50;
         */
        for (int i = 0; i < valores.length; i++) {
            valores[i] = i * 10 + 10;
        }
        for (int valor : valores) {
            System.out.println(valor);
        }
        int i = 0;
        while (i < valores.length) {
            valores[i] = i * 10 + 10;
            i++;
        }
        do{
            valores[i] = i * 10 + 10;
            i++;
        }while (i < valores.length);

    }
}
