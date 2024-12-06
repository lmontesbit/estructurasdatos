package arrays;

import javax.swing.JOptionPane;

public class SumaBidimensional {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String entrada = JOptionPane.showInputDialog(null,
                        "Ingrese el valor de la posición [" + i + "][" + j + "] del primer arreglo");
                matriz1[i][j] = Integer.parseInt(entrada);
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String entrada = JOptionPane.showInputDialog(null,
                        "Ingrese el valor de la posición [" + i + "][" + j + "] del segundo arreglo");
                matriz2[i][j] = Integer.parseInt(entrada);
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println(resultado[i][j]);

            }
        }

    }

}
