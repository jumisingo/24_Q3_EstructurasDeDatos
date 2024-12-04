
package sem12;

public class Grafo {
    //nodos que conforman el grafo
    private NodoGrafo[] nodos;
    //matriz de relaciones
    private int[][] matrizAdyacencia;
    
    
    public Grafo(int cantidadNodos){
        //instanciamos nodos con tamano cantidadNodos
        this.nodos = new NodoGrafo[cantidadNodos];
        
        //instanciamos la matriz de adyacencia
        this.matrizAdyacencia = new int[cantidadNodos][cantidadNodos];
        //Explicacion:
        //El maximo numero de relaciones entre nodos es igual al cuadrado
        //del numero de nodos.
        //es decir 5 nodos tendrian un maximo de 5 x 5 relaciones.
        
        //llenamos el grafo
        for(int i = 0; i<cantidadNodos; i++)
        {
            nodos[i]=new NodoGrafo(i);
        }
    }
    
    public void agregarRelacion(int nodoOrigen, int nodoDestino){
        //construimos la relacion de nodoOrigen a NodoDestino
        //Y de nodoDestino a NodoOrigen
        this.matrizAdyacencia[nodoOrigen][nodoDestino]=1;
        this.matrizAdyacencia[nodoDestino][nodoOrigen]=1;
    }
    
    public void imprimirMatrizAdyacencia(){
        //recorremos las filas
        for(int i=0; i<this.matrizAdyacencia.length; i++){
            //recorremos las columnas por cada fila
            for(int j=0; j<this.matrizAdyacencia.length; j++){
                System.out.print(this.matrizAdyacencia[i][j]+" ");
            }
            //insertamos salto de linea
            System.out.println();
        }
    }
    
    public NodoGrafo[] recorridoProfundidad(int nodoInicial){
        NodoGrafo[] nodosVisitados = new NodoGrafo[nodos.length];
        boolean[] visitados = new boolean[nodos.length];
        
        //metodo para recorrer recursivamente el grafo
        this.recorridoProfundidadRecursivo(nodoInicial, visitados, nodosVisitados, 0);
        
        System.out.println("Nodos visitados a profundidad: ");
        for(int i=0; i<nodosVisitados.length; i++){
            //imprimimos el valor de cada nodo en la ruta
            System.out.println(nodosVisitados[i].getValor());
        }
        return nodosVisitados;
    }
    
    private int recorridoProfundidadRecursivo(int nodoGrafo,
            boolean[] visitados, NodoGrafo[] nodosVisitados, 
            int idx){
        //lo primero al entrar al metodo es definir la posicion del nodo
        //como ya recorrida, y agregarlo al arreglo de nodosVisitados
        visitados[nodoGrafo] = true;
        nodosVisitados[idx++] = this.nodos[nodoGrafo];
        
        //recorremos todos los nodos del grafo, que no hayan sido visitados y 
        //que no esten en la lista de nodos
        for(int i=0; i< this.nodos.length; i++){
            if(this.matrizAdyacencia[nodoGrafo][i]==1 && !visitados[i]){
                idx = recorridoProfundidadRecursivo(i,visitados,nodosVisitados,idx);
            }
        }
        //devolvemos la cuenta
        return idx;
    }
            
}
