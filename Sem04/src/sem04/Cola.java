
package sem04;

public class Cola {
    private NodoC frente;
    private NodoC ultimo;

    public NodoC getFrente() {
        return frente;
    }

    public void setFrente(NodoC frente) {
        this.frente = frente;
    }

    public NodoC getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoC ultimo) {
        this.ultimo = ultimo;
    }
    
    public void encolar(String dato){
        //Creamos el nuevo nodo con el dato
        NodoC nuevoNodo = new NodoC(dato);
        
        //la Cola esta vacia
        if(this.frente == null){
            //definimos el frente y el ultimo de la cola
            this.frente = nuevoNodo;
            this.ultimo = nuevoNodo;
        }else{
        // la cola tiene elemento(s) / no esta vacia
        
        //Paso 1: al actual ultimo, le actualizamos el atributo atras a 
        // el nuevo nodo que acabamos de crear
        this.ultimo.setAtras(nuevoNodo);
        
        //Paso 2: actualizar el atributo ultimo de la Cola
        //apuntar al nuevo nodo que ahora sera el ultimo
        this.setUltimo(nuevoNodo);
        }
    }
    
    public NodoC atender(){
        //siempre se atiende el primero que se inserto
        //es decir el del frente
        
        // Paso 1: copiamos el frente a una variable auxiliar
        NodoC actual = this.frente;
        
        // Paso 2: ahora el frente sera el que estaba atras del frente
        this.frente = actual.getAtras();
        
        // Paso 3: eliminar la referencia de Atras del nodo extraido
        actual.setAtras(null);
        
        return actual;
    }
}
