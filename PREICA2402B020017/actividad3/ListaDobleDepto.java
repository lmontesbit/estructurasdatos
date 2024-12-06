package actividad3;

public class ListaDobleDepto {
    Nodo cabecera=null;
    Nodo cola=null;

    public void crearDpto(Departamento departamento){
        Nodo nuevoNodo=new Nodo(departamento);
        if(cabecera==null){
            cabecera=nuevoNodo;
            cola=nuevoNodo;
        }else{
            cola.siguiente=nuevoNodo;
            nuevoNodo.anterior=cola;
            cola=nuevoNodo;
        }
    }
    public void mostrarDpto(){
        Nodo actual=cabecera;
        while(actual!=null){
            System.out.println(actual.departamento);
            actual=actual.siguiente;
        }
    }


    public Departamento mayorExtension(){
        Nodo actual=cabecera;
        Departamento deptoMayor=cabecera.departamento;
        while(actual!=null){
            if(actual.departamento.extension>deptoMayor.extension){
                deptoMayor=actual.departamento;
            }            
            actual=actual.siguiente;
        }
        return deptoMayor;
    }




    
}
