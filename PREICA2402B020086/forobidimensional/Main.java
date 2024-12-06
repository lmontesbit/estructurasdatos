import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*
         * double[][] notas = {
         * { 4.0, 1.0, 2.0, 3.0 },
         * { 3.5, 3.8, 4.1, 4.0 },
         * { 5.0, 2.9, 3.8, 4.3 },
         * { 4.3, 4.1, 3.7, 3.9 },
         * { 5.0, 1.0, 1.9, 3.0 },
         * { 4.6, 4.8, 1.2, 2.1 } };
         */

        double[][] notas = new double[6][4];
        Random random = new Random();

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j]=Math.round(random.nextDouble()*5*10)/10;         
            }
        }


        double sumaGrupal = 0.0;
        int cantidadNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                sumaGrupal += notas[i][j];
                cantidadNotas++;
            }
        }
        double promedioGrupal = sumaGrupal / cantidadNotas;
        System.out.println("El promedio del grupo es " + promedioGrupal);
        int estudianteSobrePromedio = 0;
        for (int i = 0; i < notas.length; i++) {
            double sumaEstudiante = 0.0;
            for (int j = 0; j < notas[i].length; j++) {
                sumaEstudiante += notas[i][j];
            }
            double promedioEstudiante = sumaEstudiante / notas[i].length;

            if (promedioEstudiante > promedioGrupal) {
                estudianteSobrePromedio++;
            }
        }
        System.out.println("Estudiantes con promedio superior al promedio general son:" + estudianteSobrePromedio);

    }

}
