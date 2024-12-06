package forobidimensional;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double[][] notas = new double[6][4];
        Random random = new Random();
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = Math.round(random.nextDouble()*5*10)/10;
              
            }
        }

        double sumaGrupo = 0.0;
        int cantidadNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                sumaGrupo += notas[i][j];
                cantidadNotas++;
            }
        }
        double promedioGrupo = sumaGrupo / cantidadNotas;
        System.out.println("El promedio general del grupo de estudiantes es: " + promedioGrupo);
        int estudianteEncimaPromedio = 0;
        for (int i = 0; i < notas.length; i++) {
            double sumaEstudiante = 0.0;
            for (int j = 0; j < notas[i].length; j++) {
                sumaEstudiante += notas[i][j];
            }
            double promedioEstudiante = sumaEstudiante / notas[i].length;
            if (promedioEstudiante > promedioGrupo) {
                estudianteEncimaPromedio++;
            }
        }
        System.out
                .println("El número de estudfiantes con promedio superiror al grupal es: " + estudianteEncimaPromedio);

    }

}
