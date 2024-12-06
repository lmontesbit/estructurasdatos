public class ArrayEjemplo {

    public static void main(String[] args) {
        // Realizar un array de tipo int
        int[] numero = new int[5];
        numero[0] = 10;
        numero[1] = 20;
        numero[2] = 30;
        numero[3] = 40;
        numero[4] = 50;

        for (int i = 0; i < numero.length; i++) {
            System.out.println("La posición es " + i + " : " + numero[i]);
        }

        String[] nombres = { "Juan", "Pedro", "Matias", "Ximena" };
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("La posición es " + i + " : " + nombres[i]);
        }

        double[] notas = { 2.5, 3, 4, 3.7 };

        for (int i = 0; i < notas.length; i++) {
            System.out.println("La posición es " + i + " : " + notas[i]);
        }

    }

}