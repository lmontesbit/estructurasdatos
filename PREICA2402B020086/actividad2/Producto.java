package actividad2;

import java.util.Scanner;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor con parámetros Polimorfismo
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Constructor vacio Polimorfismo
    public Producto() {
        this.nombre = "";
        this.precio = 0.0;
        this.cantidad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digitar el nombre del producto");
        this.nombre = scanner.nextLine();
        System.out.println("Digite el precio del producto");
        this.precio = scanner.nextDouble();
        System.out.println("Digite la cantidad del producto");
        this.cantidad = scanner.nextInt();
    }

    public void printData() {
        System.out.println("--------------------------------");
        System.out.println("Nombre del producto " + this.nombre);
        System.out.println("Precio del producto " + this.precio);
        System.out.println("Cantidad del producto " + this.cantidad);
        System.out.println("--------------------------------");
    }

    @Override
    public String toString() {
        return "Producto: { nombre:" + nombre + ",precio:" + precio + " cantidad:" + cantidad + "}";
    }

}
