package zoologico;

public class Oso {
    //Atributos
    //public Oso hijo;
    public String colorOso;
    public String nombreOso;
    public boolean hibernando;
    
    public Oso(){
    }
    
    public void setHibernando(boolean hibernando){
        //logica de definicion de valor en atributo hibernando
        this.hibernando = hibernando;
    }

    public String getColorOso() {
        return colorOso;
    }

    public void setColorOso(String colorOso) {
        this.colorOso = colorOso;
    }

    public String getNombreOso() {
        return nombreOso;
    }

    public void setNombreOso(String nombreOso) {
        this.nombreOso = nombreOso;
    }
    
    public boolean getHibernando(){
        //lee o devuelve el valor del atributo hibernndo
        return this.hibernando;
    }
    
    public void indicadorHibernando(){
        //if(this.hibernando==true) Esto es una redundancia
        if(this.hibernando){
            System.out.println("El oso esta hibernando, silencio.");
        }else{
            System.out.println("El oso esta despierto, mantengase alerta.");
        }
    }
    
    public void presentarOso(){
        System.out.println("Hola, soy un oso: "+ this.colorOso + "y me llamo :" + this.nombreOso);
    }
}
