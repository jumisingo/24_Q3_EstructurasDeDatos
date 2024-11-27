
package sem11;

public class Sem11 {

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.inserta(10);
        
        //imprimimos
        arbol.inorden();
        
        arbol.inserta(20);
        arbol.inserta(13);
        arbol.inserta(50);
        arbol.inserta(5);
        arbol.inserta(35);
        arbol.inserta(48);
        
        //imprimimos
        System.out.println("Impresion inorden: ");
        arbol.inorden();
        
        
        //impresion preorden
        System.out.println("Impresion preorden: ");
        arbol.preorden();
        
        
        //impresion preorden
        System.out.println("Impresion postorden: ");
        arbol.postorden();
    }
    
}
