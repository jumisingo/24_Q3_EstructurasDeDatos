
package sem04;

public class Sem04 {

    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.encolar("prueba1");
        
        String datoCola = cola.getFrente().toString();
        System.out.println(datoCola);
        
        System.out.println(cola.getUltimo().toString());
        
        //agregamos 2do nodo a la cola
        cola.encolar("prueba2");
        
        
        System.out.println("\n"+cola.getFrente().toString());
        System.out.println(cola.getUltimo().toString());
        
        
        cola.encolar("prueba3");
        cola.encolar("prueba4");
        cola.encolar("prueba5");
        cola.encolar("prueba6");
        cola.encolar("prueba7");
        
        System.out.println("Ejecutando metodo Atender.");
        NodoC nodoAtendido = cola.atender();
        System.out.println(nodoAtendido.toString());
        //verificamos el ultimo
        System.out.println("Nodo ultimo:");
        System.out.println(cola.getUltimo().toString());
        //verificamos el frente 
        System.out.println("Nodo frente:");
        System.out.println(cola.getFrente().toString());
        
        System.out.println("\n\n\n\n\n\n\n");
        // funciones adicionales de Colas
        Rutinas rutinas = new Rutinas(cola);
        
        Boolean resultadoBusqueda1 = rutinas.Encuentra("prueba6"); //devuelve verdaderio
        System.out.println("El resultado de busqueda 'prueba6' es: "+resultadoBusqueda1);
        
        Boolean resultadoBusqueda2 = rutinas.Encuentra("tareapractica1"); // devuelve falso
        System.out.println("El resultado de busqueda 'tareapractica1' es: "+resultadoBusqueda2);
    }
    
}
