package sem03;

public class NodoP {
    private Dato elemento;
    private NodoP siguiente;

    public NodoP() {
        //Se define nulo ya que en la base no hay elemento abajo
        this.siguiente = null; 
    }

    public NodoP(Dato elemento, NodoP siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public NodoP getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoP siguiente) {
        this.siguiente = siguiente;
    }
}
