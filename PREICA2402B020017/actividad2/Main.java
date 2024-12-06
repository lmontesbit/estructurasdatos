package actividad2;

import java.util.Scanner;

import actividad1.Productos;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de productos");
        int numProductos = scanner.nextInt();
        Productos[] productos = new Productos[numProductos];

        for (int i = 0; i < numProductos; i++) {
            Productos product = new Productos();
            product.guardarProductos();
            productos[i] = product;
        }

        Productos productoMenor = productos[0];

        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getPrecio() > productoMenor.getPrecio()) {
                productoMenor = productos[i];
            }
        }

        for (Productos producto : productos) {
            if (producto.getPrecio() > productoMenor.getPrecio()) {
                productoMenor = producto;
            }

        }

    }

}
