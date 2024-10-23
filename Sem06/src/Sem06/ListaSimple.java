package Sem06;

public class ListaSimple {
    //primer nodo de la estructura
    private NodoL cabeza;
    
    public void insertar(Persona p){
        //primer caso: la lista no tiene nodos
        if(this.cabeza == null){
            //creamos el nuevo nodo
            NodoL nodo = new NodoL(new Dato(p));
            //guardamos el nodo en cabeza (primer elemento de la Lista)
            this.cabeza = nodo;
        }else{
            //creamos el nuevo nodo
            NodoL nodo = new NodoL(new Dato(p));
             
            
            NodoL aux=this.cabeza;
            //validamos cual nodo no tiene siguiente
            while(aux.getSiguienteNodo()!=null && 
                    aux.getSiguienteNodo().getDato().getPersona().getId()< p.getId()){
                aux=aux.getSiguienteNodo();
            }
                
            //Obtenemos el siguiente del actual para insertarlo en medio
            //si no hay siguiente, insertariamos despues del actual ultimo
            nodo.setSiguienteNodo(aux.getSiguienteNodo());
            aux.setSiguienteNodo(nodo);
            }
        
    }
    
    public void modificar(Persona p){
        NodoL auxiliar = cabeza;
        
        while(auxiliar != null){
            //validamos si el ID es igual al de la persona objetivo
            if(auxiliar.getDato().getPersona().getId() == p.getId()){
                //encontramos nuestro nodo objetivo
                String nombre= p.getNombre();
                //actualiza el nombre de la Persona
                auxiliar.getDato().getPersona().setNombre(nombre);
                //encontramos nuestro objetivo, interrumpimos ejecucion
                break;
            }else{
                auxiliar = auxiliar.getSiguienteNodo();
            }
        }
    }
    
    public void eliminar(Persona p){
        NodoL auxiliar = cabeza;
        NodoL anterior = null;
        
        //si la lista tiene elementos, recorremos
        while(auxiliar != null){
            //evaluamos si la persona actual es igual al Id de persona objetivo
            if(auxiliar.getDato().getPersona().getId() == p.getId()){
                //encontramos nuestro nodo a eliminar
                if(auxiliar == cabeza){
                    //eliminamos el primero, sobreescribiendo cabeza con su
                    //siguiente
                    cabeza = cabeza.getSiguienteNodo();
                    
                    //auxiliar es copia de cabeza, definimos su siguiente a null
                    auxiliar.setSiguienteNodo(null);
                    break;
                }else{
                //persona objetivo no es cabeza
                
                //el anterior apunta al siguiente del actual
                anterior.setSiguienteNodo(auxiliar.getSiguienteNodo());
                
                //el actual elimina referencia hacia el siguiente
                //actualizamos el siguiente a null
                auxiliar.setSiguienteNodo(null);
                break;
                }
            }else{
               anterior = auxiliar;
               auxiliar = auxiliar.getSiguienteNodo();
            }
        }
    }
    public void ImprimeLista(){
        NodoL aux = cabeza;
        String cadena = "Lista: \n";
        
        while(aux != null){
            //agrega la impresion de la persona de cada nodo
            cadena += aux.getDato().getPersona().toString();
            //obtenemos el siguiente nodo para el siguiente ciclo
            aux = aux.getSiguienteNodo();
        }
        //impresion del resultado
        System.out.println(cadena);
    
    }
}
