package pila.lifo;

public class Main {
    public static void main(String[] args) {
        Pila<String> pila=new Pila<>();
        pila.push("Dato 1");
        pila.push("Dato 2");

        System.out.println(pila.peek());//"Dato 2"
        System.out.println(pila.pop());//"Dato 2"
        System.out.println(pila.pop());//"Dato 1"


    }
    
}
