package sem11;

public class NodoA {
    private int id;
    private NodoA hijoIzq;
    private NodoA hijoDer;

    public NodoA(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NodoA getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoA hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoA getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoA hijoDer) {
        this.hijoDer = hijoDer;
    }
}
