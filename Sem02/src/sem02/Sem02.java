package sem02;

public class Sem02 {

    public static void main(String[] args) {
        //imprime(7);
        Factorial facObj = new Factorial();
        //System.out.println("El resultado factorial es: "+facObj.fac(12));
        
        PosicionMayorArreglo posObj = new PosicionMayorArreglo(8);
        //System.out.println("La posicion mayor es: "+posObj.sacaPosicionMayor());
        int[] arregloBusqueda = {2,4,8,9,15,21,22,23,31,35,41};
        
        BusquedaRecursiva busquedaObj = new BusquedaRecursiva(arregloBusqueda);
        System.out.println("El indice es: "+busquedaObj.busca(35));
    }
    
    public static void imprime(int num){
        if(num >= 0){
            System.out.print("El numero es: "+num+"\n");
            imprime(num-1);
        }
    }
    
}
