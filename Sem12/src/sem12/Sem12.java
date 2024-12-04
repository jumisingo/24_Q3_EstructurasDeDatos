
package sem12;

public class Sem12 {
    public static void main(String[] args) {
      Grafo grafo = new Grafo(10);
      grafo.agregarRelacion(0, 1);
      grafo.agregarRelacion(0, 2);
      grafo.agregarRelacion(1, 3);
      grafo.agregarRelacion(2, 3);
      grafo.agregarRelacion(4, 3);
      grafo.agregarRelacion(4, 5);
      grafo.agregarRelacion(4, 6);
      grafo.agregarRelacion(4, 7);
      grafo.agregarRelacion(4, 8);
      grafo.agregarRelacion(0, 9);
      grafo.imprimirMatrizAdyacencia();
      
      grafo.recorridoProfundidad(0);
    }
}
