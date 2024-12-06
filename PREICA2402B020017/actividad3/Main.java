package actividad3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaDobleDepto lista=new ListaDobleDepto();
        List<Departamento> deptos=new ArrayList();

        System.out.println("Ingrse la cantidad de departamento");
        int numdeptos=0;
        for(int i=0; i<numdeptos; i++) {
            System.out.println("Ingres los nombre");
            String nombre;

            Departamento deDepartamento =new Departamento(nombre, i, i, i, numdeptos, i);
            deptos.add(deDepartamento);
            lista.crearDpto(deDepartamento);

        }
    }
    
}
