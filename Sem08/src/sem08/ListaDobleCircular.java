package sem08;

public class ListaDobleCircular {
    private NodoLDC cabeza;
    private NodoLDC ultimo;
    
    //agregar una persona a la lista
    public void insert(Persona elemento){
        //1. Cabeza es nulo, no hay elementos en la lista
        if(cabeza == null){
            //el nodo es el primero y ultimo de la lista
            this.cabeza = new NodoLDC(elemento);
            this.ultimo = this.cabeza;
            //creamos para cabeza las referencias 
            //hacia adelante y hacia atras 
            this.cabeza.setNodoAtras(this.ultimo);
            this.cabeza.setNodoAdelante(this.ultimo);
            //igual para ultimo
            this.ultimo.setNodoAtras(this.cabeza);
            this.ultimo.setNodoAdelante(this.cabeza);
        }else{
            //2. el id de persona es menor al id de la cabeza
            //tenemos una nueva cabeza
            if(cabeza.getDato().getId() > elemento.getId()){
                NodoLDC nodo = new NodoLDC(elemento);
                //definimos adelante y atras del nuevo nodo
                //nuevo nodo tiene adelante a la antigua cabeza
                nodo.setNodoAdelante(this.cabeza);
                
                //sobreescribimos cabeza
                this.cabeza= nodo;
                this.cabeza.setNodoAtras(this.ultimo);
                
                //el ultimo debe apuntar a la nueva cabeza
                this.ultimo.setNodoAdelante(this.cabeza);
            }else{
                //3. el id es mayor al ultimo
                //definimos el nuevo ultimo y actualizamos las referencias
                NodoLDC nodo = new NodoLDC(elemento);
                
                //Evaluamos si el id del nuevo elemento es mayor 
                //al id del ultimo
                if(elemento.getId() > this.ultimo.getDato().getId()){
                    //definimos que el de tras del nuevo nodo es el
                    //actual ultimo
                    nodo.setNodoAtras(this.ultimo);
                    //el actual ultimo tiene siguiente apuntando al nuevo nodo
                    this.ultimo.setNodoAdelante(nodo);
                    //definimos el nuevo ultimo
                    this.ultimo=nodo;
                    //actualizamos las referencias de cabeza/ultimo 
                    //para guardar el principio circular
                    this.ultimo.setNodoAdelante(this.cabeza);
                    this.cabeza.setNodoAdelante(this.ultimo);
                }else{
                    //4. no es ni el menor ni el mayor, debe insertarse en el medio
                    
                    //comenzamos a recorrer a partir de el siguietne de cabeza
                    NodoLDC aux = this.cabeza.getNodoAdelante();
                    
                    //recorremos los nodos buscando donde el siguiente 
                    //no sea menor
                    while(aux.getDato().getId() < nodo.getDato().getId()){
                        aux= aux.getNodoAdelante();
                    }
                    
                    //nuevo nodo
                    nodo = new NodoLDC(elemento);
                    //definimos cual es el siguiente del nuevo nodo y el de atras
                    nodo.setNodoAtras(aux.getNodoAtras());
                    nodo.setNodoAdelante(aux);
                    
                    //el anterior ahora debe apuntar su siguiente
                    //al nuevo nodo
                    nodo.getNodoAtras().setNodoAdelante(nodo);
                    //el siguienteNodo debe apuntar atras 
                    //hacia el nuevo nodo
                    aux.setNodoAtras(nodo);
                }
            }
        
        }
    }

    @Override
    public String toString() {
        String respuesta = "Lista Doble Circular: ";
        
        //
        if(cabeza!=null){
            //copiamos cabeza
            NodoLDC aux = this.cabeza;
            //agregamos el string generado del nodo actual
            respuesta += aux.toString();
            //sobreescribimos para la siguiente iteracion
            aux = aux.getNodoAdelante();
            //si el siguiente no es cabeza, 
            //no hemos llegado al ultimo elemento
            while(aux!= this.cabeza){
                respuesta += aux.toString();
                aux = aux.getNodoAdelante();
            }
        }else{
            respuesta+= "vacia";
        }
        
        return respuesta;
    }
    
    
}
