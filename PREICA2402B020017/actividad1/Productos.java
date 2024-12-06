package actividad1;

import java.util.Scanner;

public class Productos {

    private String nombre;
    private double precio;
    private int cantidad;

    // Polimorfismo
    public Productos() {
        this.nombre = "";
        this.precio = 0.0;
        this.cantidad = 0;
    }

    // Polimorfismo
    public Productos(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
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

    public void guardarProductos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------CREAR PRODUCTO-----");
        System.out.println("Ingresar el nombre del producto");
        this.nombre = scanner.nextLine();
        System.out.println("Ingresar el precio del producto");
        this.precio = scanner.nextDouble();
        System.out.println("Ingresar la cantidad de productos");
        this.cantidad = scanner.nextInt();
        System.out.println("-------------------------------");
    }

    public void mostrarProductos() {
        System.out.println("-----------LISTAR PRODUCTO-----");
        System.out.println("Nombre del producto " + this.nombre);
        System.out.println("Precio del producto " + this.precio);
        System.out.println("Cantidad del producto " + this.cantidad);
        System.out.println("-------------------------------");
    }

}
