package actividad2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar cantidad de productos");
        int cantidadProductos=scanner.nextInt();
        Producto[] productos = new Producto[cantidadProductos];

        for (int i=0; i<cantidadProductos; i++){
            System.out.println("Digitar el nombre del producto");
            String nombre = scanner.nextLine();
            System.out.println("Digite el precio del producto");
            double precio = scanner.nextDouble();
            System.out.println("Digite la cantidad del producto");
            int cantidad = scanner.nextInt();
            productos[i]=new Producto(nombre, precio, cantidad);
        }


    }
    
}
