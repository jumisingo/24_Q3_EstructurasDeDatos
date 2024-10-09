package sem04;

public class Rutinas {
    private Cola cola1;

    public Rutinas(Cola cola1) {
        this.cola1 = cola1;
    }
    
    public boolean Encuentra(String criterio){
        //retorna false si no encuentra el valor
        //retorna true si si lo encuentra
        //la cola no se debe modificar.
        
        Cola aux = this.cola1;
        if(aux.getFrente() == null){
            return false;
        }
        
        //Comenzamos por el frente
        NodoC actual = aux.getFrente();
        
        do{
            if(actual.getDato().equals(criterio)){
                return true;
            }
            //actualizamos el actual al siguiente nodo
            actual= actual.getAtras();
        }
        while(actual.getAtras()!= null);
        
        //while(condicionEvaluada){
            //codigo del ciclo
        //}
            
        return false; //para que no muestre error por mientras
    }
}
