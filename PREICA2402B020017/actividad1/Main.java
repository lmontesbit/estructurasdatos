package actividad1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Productos> listaProductos = new ArrayList<>();
        ArrayList<String> lista= new ArrayList<>();;
        int valor;
        do {

            System.out.println("Menú principal ");
            System.out.println("1.Crear un producto");
            System.out.println("2.Mostrar el producto");
            System.out.println("3.Salir del producto");
            valor = scanner.nextInt();

            switch (valor) {
                case 1:
                    Productos productos = new Productos();
                    productos.guardarProductos();
                    listaProductos.add(productos);
                    String nombre="Manzanas";
                    lista.add(nombre);
                    break;
                case 2:

                    if (listaProductos.isEmpty()) {
                        System.out.println("No hay datos para visualizar");
                    } else {

                        for (Productos producto : listaProductos) {
                            producto.mostrarProductos();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del menú de productos");
                    break;

                default:
                    System.out.println("La opción no es válida");
            }

        } while (valor!=3);

    }

}
