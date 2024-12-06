package arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Primer elemento del array " + array[0]);
        System.out.println("Último elemento del array " + array[array.length - 1]);

        for (int valor : array) {
            System.out.println("Elemento " + valor);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento " + array[i] + " posición:[" + i + "]");
        }
        int suma = 0;
        for (int valores : array) {
            suma += valores;
        }
        System.out.println("La suma es:[" + suma + "]");

        int[] maximo = { 6, 19, 8, 1, 9, 2 };

        int valorMaximo = maximo[0];

        for (int i = 0; i < maximo.length; i++) {
            if (maximo[i] > valorMaximo) {
                valorMaximo = maximo[i];
            }
        }
        System.out.println("El valor máximo es " + valorMaximo);

        int []arreglo = new int[5];
        /*arreglo[0] = 10;
        arreglo[1] =20;
        arreglo[2] =30;
        arreglo[3] =40;
        arreglo[4] =50;*/
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = i*10+10;
        }
        int i=0;
        while(i<arreglo.length){
            arreglo[i] = i*10+10;
            i++;
        }
        for(int valor:arreglo){
            System.out.println(valor);
        }


    }

}
