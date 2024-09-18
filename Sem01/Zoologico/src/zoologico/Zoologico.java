package zoologico;

public class Zoologico {

    public static void main(String[] args) {
        Oso osoPolar = new Oso();
        
        osoPolar.setNombreOso("Dolly");
        String nombre = osoPolar.getNombreOso();
        //System.out.println("El nombre es: "+nombre);
        
        osoPolar.setHibernando(true);
        //osoPolar.indicadorHibernando();
        
        
        Leon leonAfricano = new Leon("surafricano", "Tony", true);
        System.out.println(leonAfricano.toString());
        leonAfricano.leonComiendo(0);
    }
    
}
