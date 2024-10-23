package Sem06;

public class Sem06 {

    public static void main(String[] args) {
        //Crear Lista
        ListaSimple lista = new ListaSimple();
        
        //Insertar elemento en lista
        lista.insertar(new Persona(1, "James"));
        
        //ImprimeLista
        lista.ImprimeLista();
        
        //Inserta segundo elemento
        System.out.println("\n");
        lista.insertar(new Persona(2, "Isabel"));
        lista.ImprimeLista();
        
        //inserta elemento al final
        System.out.println("\n");
        lista.insertar(new Persona(3, "Juan"));
        lista.ImprimeLista();
        
        //Modifica elemento
        lista.modificar(new Persona(3,"Pedro"));
        lista.ImprimeLista();
        
        
        //Elimina elemento
        lista.eliminar(new Persona(2,"Isabel"));//elimina por Id
        lista.ImprimeLista();
        
    }
    
}
