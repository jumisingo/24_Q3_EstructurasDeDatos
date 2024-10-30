package sem07;

//Nodo de Lista Circular
public class NodoLC {
    private Persona dato;
    
    //constructor con el Dato
    public NodoLC(Persona dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "NodoLC{" + "dato=" + dato.toString() + '}';
    }
    private NodoLC siguienteNodo;

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public NodoLC getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoLC siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }
    
    
}
