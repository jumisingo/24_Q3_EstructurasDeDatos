
package sem11;

public class Arbol {
    NodoA raiz;
    
    public void inserta (int num){
        if(raiz == null){
            //Si la raiz es nula (el arbol esta vacio), creamos el nodo raiz
            raiz = new NodoA(num);
        }else{
            //el arbol no esta vacio
            //ejecutar insercion evaluativa del orden
            insertaRecursivo(raiz, num);
        }
    }
    
    public void insertaRecursivo(NodoA nodo, int x){
        //evaluar si el numero es mayor o menor que el nodo actual
        if(x <= nodo.getId()){
            //es menor
            
            //evaluamos si el nodo hijoIzq es nulo
            if(nodo.getHijoIzq() == null){
                //si es nulo, insertamos aqui 
                nodo.setHijoIzq(new NodoA(x));
            }else{
                //como el hijo izq no es nulo
                //envio a evaluacion de insercion recursiva el nodo hijo izquierdo 
                // y el numero para ver si es mayor o menor
                insertaRecursivo(nodo.getHijoIzq(), x);
            }
        }else{
            //analizamos hacia la derecha ya que el numero es mayor
            if(nodo.getHijoDer() == null){
                //si hijo derecho es nulo, nuestro numero se inserta en esta
                //posicion
                nodo.setHijoDer(new NodoA(x));
            }else{
                //si no, bajamos un nivel y ejecutamos la insercion recursiva
                insertaRecursivo(nodo.getHijoDer(), x);
            }
        }
    }
    
    public void inorden(){
        if(raiz == null){
            System.out.println("El arbol esta vacio.");
        }else{
            //impresion recursiva
            inordenRecursivo(raiz);
        }
    }
    
    public void inordenRecursivo(NodoA nodo){
        if(nodo!=null){
            //primero imprime la vertiente izquierda
            inordenRecursivo(nodo.getHijoIzq());
            //luego el id del nodo actual
            System.out.println(nodo.getId());
            //luego recorre vertiente derecha
            inordenRecursivo(nodo.getHijoDer());
        }
    }
    
    public void preorden(){
        if(raiz == null){
            System.out.println("El arbol esta vacio.");
        }else{
            //impresion recursiva
            preordenRecursivo(raiz);
        }
    }
    
    public void preordenRecursivo(NodoA nodo){
        if(nodo!=null){
            //primero imprime el numero del nodo actual
            System.out.println(nodo.getId());
            //segundo imprime la vertiente izquierda
            preordenRecursivo(nodo.getHijoIzq());
            //luego recorre vertiente derecha
            preordenRecursivo(nodo.getHijoDer());
        }
    }
    
    public void postorden(){
        if(raiz == null){
            System.out.println("El arbol esta vacio.");
        }else{
            //impresion recursiva
            postordenRecursivo(raiz);
        }
    }
    
    public void postordenRecursivo(NodoA nodo){
        if(nodo!=null){
            //primero imprime la vertiente izquierda
            postordenRecursivo(nodo.getHijoIzq());
            //luego recorre vertiente derecha
            postordenRecursivo(nodo.getHijoDer());
            //ultimo imprime el numero del nodo actual
            System.out.println(nodo.getId());
        }
    }
}
