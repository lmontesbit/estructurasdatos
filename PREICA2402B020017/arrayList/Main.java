package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> listaEstudiante = new ArrayList<>();

        listaEstudiante.add(new Estudiante("Pedro", 20, 4.5));
        listaEstudiante.add(new Estudiante("Luis", 23, 3.5));
        listaEstudiante.add(new Estudiante("Wilmar", 29, 4.5));
        System.out.println("Estudiantes");
        for (Estudiante estudiante : listaEstudiante) {
            System.out.println(estudiante);

        }

    }

}
