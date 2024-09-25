package sem02;

public class BusquedaRecursiva {
    //arreglo ordenado, 
    //no necesariamente tiene valores continuos
    //valores crecientes
    private int[] v;

    public BusquedaRecursiva(int[] v) {
        this.v = v;
        System.out.println("size: "+v.length);
    }
    
    public int busca(int num){
        //recibe el numero a buscar
        
        //envia el numero a buscar, el incio del arreglo 
        //y el limite superior (condicion de parada)
        return buscaR(num, 0, v.length-1);
    }
    
    public int buscaR(int num, int minimo, int limite){
        //si el minimo supera el limite, no se encontró
        if(minimo>limite){
            //validacoin para impresion en console, no afecta la logica
            if(minimo == 0 ){
                System.out.println("No se ha encontrado en la primera mitad");
            }else{
                System.out.println("No se ha encontrado en la segunda mitad");
            }
            return -1;
        }
        
        //particionamos la mitad del arreglo
        int mitad = (minimo+limite)/2;
        
        //si el numero objetivo es igual al valor del indice medio
        //hemos encontrado el indice, devolver.
        if(num == v[mitad]){
            System.out.println("Encontrado en posicion: "+mitad);
            return mitad;
        }
        
        //iteramos sobre las mitades
        //Como el arreglo es ordenado, si el numero objetivo 
        //es menor que la mitad, debemos buscar en la particion inferior
        if(num<v[mitad]){
            System.out.println("Recorriendo primera mitad en maxima posicion: "+(mitad-1));
            return buscaR(num, minimo, mitad-1);
        }
        
        // Si el numero objetivo no fue menor que la mitad,
        // es mayor, debemos buscar en la particion superior
        System.out.println("Ejecutando busqueda en segunda mitad.");
        return buscaR(num, mitad+1, limite);
    }
    
    
    
}
