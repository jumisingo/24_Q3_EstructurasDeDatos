package sem03;

public class Dato {
    private String nombre; // Dato

    public Dato() {
        this.nombre = "";
    }

    public Dato(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
