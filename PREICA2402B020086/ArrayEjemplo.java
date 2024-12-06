public class ArrayEjemplo{

    public static void main(String[] args) {

        int[]  numeros=new int[5];

        numeros[0] =10;
        numeros[1] =20;
        numeros[2] =30;
        numeros[3] =40;
        numeros[4] =50;
        for (int i=0; i<numeros.length; i++){
            System.out.println("La posicion es :"+i+" :"+numeros[i]);
        } 

        String[] nombres= {"Juan","Pedro","Pacho","Julio","Carmen"};

        for (int i=0; i<nombres.length; i++){
            System.out.println("La posicion es :"+i+" :"+nombres[i]);
        } 
        
        
    }
  

}