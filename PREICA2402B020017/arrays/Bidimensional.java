package arrays;

public class Bidimensional {

    public static void main(String[] args) {
        int[][] matriz={  {1,2,3} ,
                          {4,5,6},
                          {7,8,9}    };

     System.out.println(matriz[2][0]);  

     for(int filas=0; filas<matriz.length; filas++) {
        for(int columnas=0;columnas<matriz[filas].length; columnas++){
            System.out.println(matriz[filas][columnas]);
        }
    }
    int suma=0;
    for(int filas=0; filas<matriz.length; filas++) {
        for(int columnas=0;columnas<matriz[filas].length; columnas++){
           suma+= matriz[filas][columnas];
        }
    }
    System.out.println("La suma total de los valores es "+suma);

    }


    
}
