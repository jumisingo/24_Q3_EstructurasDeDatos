
package sem07;

public class Sem07 {

    public static void main(String[] args) {
      ListaLC lista = new ListaLC();
      //insertamos un elemento Persona
      lista.insertar(new Persona(1, "Pablo"));
      lista.insertar(new Persona(5, "Pedro"));
      lista.insertar(new Persona(15, "Alicia"));
      lista.insertar(new Persona(4, "Sabrina"));
      System.out.println(lista.toString());
    }
}
