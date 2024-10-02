package sem03;

public class Sem03 {
    public static void main(String[] args) {
        Pila pila = new Pila();
        
        //variable para controlar el ciclo 
        //para apilar de nodos
        int i =0;
        while(i<10){
            //agregar este nodo a la Pila
            pila.apilar("nombre"+i);
            i++;//aumenta en 1 la variable i
        }
        pila.imprimirPila();
        
        System.out.println("\n\n");
        //eliminamos el ultimo elemento, el que esta en la cima
        pila.desapilar();
        pila.imprimirPila();
    }
    
}
