package Sem06;

public class NodoL {
    //referencia al siguiente nodo
    private NodoL siguienteNodo;

    public NodoL(Dato dato) {
        this.dato = dato;
    }
    
    //el dato a almacenar
    private Dato dato;

    public NodoL getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoL siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }
}
