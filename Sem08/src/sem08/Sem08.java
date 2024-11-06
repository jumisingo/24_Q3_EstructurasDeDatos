
package sem08;

public class Sem08 {

    public static void main(String[] args) {
        //ejemplo 1 nodo
        ListaDobleCircular lista = new ListaDobleCircular();
        lista.insert(new Persona("Pedro1", 5));
        //lista.toString();
        System.out.println(lista.toString());
        
        //inserta a la izquierda
        lista.insert(new Persona("Pedro2", 1));
        System.out.println(lista.toString());

        //inserta a la derecha
        lista.insert(new Persona("Pedro3", 8));
        System.out.println(lista.toString());
        
        //inserta en el intermedio
        lista.insert(new Persona("Pedro4", 3));
        System.out.println(lista.toString());

        
        //lista.insert(new Persona("Pedro", 1));
        //lista.insert(new Persona("Pedro", 1));
        
    }
    
}
