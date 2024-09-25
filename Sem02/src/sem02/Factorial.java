/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem02;

public class Factorial {
    
    public int fac(int num){
        System.out.println("Numero actal: "+num);

        // condicion de parada de recursividad
        if(num == 0){
            System.out.println("Condicion de parada alcanzada");
            return 1;
        }else{
            //aplica recursividad llamandose a si mismo
            //con el valor actualizado
            int resultado = num * fac(num-1);
            System.out.println("Resultado de "+num+" * fac("+(num-1)+") es: "+resultado);
            return resultado; 
        }
    }
}
