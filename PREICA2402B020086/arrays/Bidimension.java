package arrays;
import javax.swing.JOptionPane;
public class Bidimension {

    public static void main(String[] args) {
        // int[][] matriz=new int[2][2];
        // 3*3
        int[][] matriz = { { 1, 2, 3 },
                           { 4, 5, 6 },
                           { 7, 8, 9 } };
        System.out.println(matriz[1][2]);
        System.out.println();
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                System.out.println(matriz[filas][columnas]);
            }
        }
        System.out.println();
        for(int[]fila:matriz){
            for(int valor:fila){
                System.out.println(valor);
            }
        }
      
        int filas=3;
        int columnas=3;
        int [][] array=new int[filas][columnas];

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                String entrada=JOptionPane.showInputDialog(
                    null,"Valor de la posicion["+i+"]["+j+"]:");
                array[i][j]=Integer.parseInt(entrada);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]+" ");
            }
        }




    }

}
