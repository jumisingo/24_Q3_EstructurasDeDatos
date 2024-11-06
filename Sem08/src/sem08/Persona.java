package sem08;

public class Persona {
    private String nombre;
    private int id;
    
    //constructor vacio
    public Persona() {
    }
    
    //constructor con ambos atributos
    public Persona(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", id=" + id + '}';
    }
}
