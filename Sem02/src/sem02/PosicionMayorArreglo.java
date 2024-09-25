/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem02;

/**
 *
 * @author LABORATORIO 04
 */
public class PosicionMayorArreglo {
    //Importante:
    //tamano del arreglo (condicion de Parada)
    //indice actual
    //posicion del indice del ultimo de calculo numero mayor 
    
    public int[] numeros;

    public PosicionMayorArreglo(int numeros) {
        this.numeros = new int[numeros];
        
        for(int a=0; a<numeros; a++){
            int valor = (int)(Math.random()*100);
            //System.out.println("el numero en el indice "+a+" es: "+valor);
            this.numeros[a]= valor;
        }
        //break;
    }
    
    
    
    public int sacaPosicionMayor(){
        return sacaPosicionMayorR(0, 0);
    }
    
    public int sacaPosicionMayorR(int i, int maxPos){
        if(i>=numeros.length){ //condicion de parada
            return maxPos;
        }
        
        //Si el numero actual es mayor al ultimo mayor, tenemos un nuevo mayor
        //Actualizar maxPos
        if(numeros[i]>numeros[maxPos]){
            maxPos=i;
        }
        
        //aplicar recursion enviando  la posicion del ultimo mayor
        //y el indice actual + 1
        return sacaPosicionMayorR(i+1,maxPos);
    }
}

