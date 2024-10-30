package sem07;
//Lista Circular Simple
public class ListaLC {
    private NodoLC cabeza;
    private NodoLC ultimo;
    
    //inserta un nodo en la lista
    public void insertar(Persona elemento){
        //creamos el nuevo nodo para despues validar 
        //la posicion de insercion
        NodoLC nuevoNodo = new NodoLC(elemento);
        //caso 1: lista vacia
        if(this.cabeza==null){
            //si cabeza esta vacia, el ultimo debe estarlo tambien
            //por lo tanto definimos cabeza y ultimo
            this.cabeza = nuevoNodo;
            this.ultimo = nuevoNodo;
            //ultimo apunta a primero
            this.ultimo.setSiguienteNodo(this.cabeza);
        }else{//no esta vacia
            //insercion ascendente 
            //con base en el atributo Id de persona
            
            if(elemento.getId() < this.cabeza.getDato().getId()){
                //el numero es menor que cabeza, insertamos al inicio
                nuevoNodo.setSiguienteNodo(this.cabeza);
                this.cabeza=nuevoNodo;
                this.ultimo.setSiguienteNodo(this.cabeza);
            }else{
                if(ultimo.getDato().getId()<elemento.getId()){
                    //es mayor que el ultimo, insertamos al final
                    this.ultimo.setSiguienteNodo(nuevoNodo);
                    this.ultimo = nuevoNodo;
                    this.ultimo.setSiguienteNodo(this.cabeza);
                }else{
                    //no es el ultimo ni el primero, por tanto
                    //insertamos en el medio 
                    NodoLC aux = this.cabeza;

                    //si el Id del dato del nuevoNodo es mayor que el de aux.SiguienteNodo()
                    while(aux.getSiguienteNodo().getDato().getId() < nuevoNodo.getDato().getId()){
                        aux = aux.getSiguienteNodo();
                    }

                    nuevoNodo.setSiguienteNodo(aux.getSiguienteNodo());
                    aux.setSiguienteNodo(nuevoNodo);
                }
            }
        }
            
    }//> <

    @Override
    public String toString(){
        //recorre la lista e imprime
        if(this.cabeza!= null){
            //hay al menos un elemento
            
            //copiamos la cabeza para iniciar lectura
            NodoLC aux=cabeza;
            String cadena="";
            do{
                //agregamos el dato a la cadena
                cadena+= aux.getDato().toString();
                //obtenemos el siguiente nodo
                aux=aux.getSiguienteNodo();
            }while(aux != cabeza);
            //System.out.println("ListaLC {"+cadena+"}");
            return cadena;
        }
        //no hay nada que imprimir
        return null;
    }
}
