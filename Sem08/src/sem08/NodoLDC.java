package sem08;

//Nodo Lista Doble Circular
public class NodoLDC {
    private Persona dato;
    private NodoLDC nodoAdelante;
    private NodoLDC  nodoAtras;
    
    public NodoLDC(Persona dato) {
        this.dato = dato;
    }

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public NodoLDC getNodoAdelante() {
        return nodoAdelante;
    }

    public void setNodoAdelante(NodoLDC nodoAdelante) {
        this.nodoAdelante = nodoAdelante;
    }

    public NodoLDC getNodoAtras() {
        return nodoAtras;
    }

    public void setNodoAtras(NodoLDC nodoAtras) {
        this.nodoAtras = nodoAtras;
    }
    @Override
    public String toString() {
        return "NodoLDC{" + "dato=" + dato.toString() + '}';
    }
    
}
