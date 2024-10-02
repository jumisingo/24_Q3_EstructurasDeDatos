package sem03;

public class Pila {
    private NodoP cima;

    public Pila() {
        this.cima = null;
    }
    
    public void apilar(String dato){
        NodoP nodo = new NodoP();
        nodo.setElemento(new Dato(dato));
        //caso: cima es nula
        if(this.cima == null){
            this.cima = nodo;
        }else{
            //el nuevo elemento debe apuntar al que antes era la cima 
            nodo.setSiguiente(this.cima); 
            
            //ahora tenemos una nueva cima, actualizamos el atributo cima
            this.cima = nodo;
        }
    }
    
    public void desapilar(){
        //valido que haya un primer elemento definido, la cima.
        if(this.cima != null){
            //1. Extraer cima actual
            //2. definir nueva cima
            //3. Actualizar el siguiente del elemento extraido a nulo
            
            NodoP elementoExtraido = this.cima;
            //definir el anterior a la cima actual como la nueva cima.
            this.cima = this.cima.getSiguiente();  
            
            //como ya no hace parte de la pila
            //eliminamos la referencia al siguiente
            elementoExtraido.setSiguiente(null);
        }
    }
    
    public void imprimirPila(){
        String texto = "";
        
        if(this.cima != null){
            //para imprimir, copiamos la cima a una variable auxiliar
            //y sobre esta copia recorremos 
            NodoP aux = this.cima;
            while(aux != null){
                // backslash en windows es Alt 192
                texto += aux.getElemento().getNombre()+"\n"; 
                //obtenemos el siguiente nodo
                //y actualizamos aux para la siguiente ejecucion del ciclo
                aux = aux.getSiguiente();
            }
        }
        System.out.println(texto);
    }
    
    
    
}
