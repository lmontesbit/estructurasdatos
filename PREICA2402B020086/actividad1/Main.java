package actividad1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> listaProductos = new ArrayList<>();
        int seleccion;
        do {
            System.out.println("Menú de Productos");
            System.out.println("1. Crear el producto");
            System.out.println("2. Visualizar el producto");
            System.out.println("3. Salir del Menú de Productos");
            seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                    Producto producto = new Producto();
                    producto.getData();
                    listaProductos.add(producto);
                    break;
                case 2:
                    if (listaProductos.isEmpty()) {
                        System.out.println("No hay productos");
                    } else {
                        for (Producto visualizar : listaProductos) {
                            visualizar.printData();
                        }
                    }
                    break;
                    case 3:
                    System.out.println("Saliendo del Menú");
                    break;

                default:
                System.out.println("La opción seleccionada no es válida");
                    
            }

        } while (seleccion!=3);

    }
}
