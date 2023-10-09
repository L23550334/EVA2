/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in); 
        int cali;
        
        System.out.println("Introduce tu Calificación");
        cali = cap.nextInt();
        
        if(cali >= 70)//expresión a evauar, es para el VERDADERO
       { 
        System.out.println("Aprobado: Viaje a Cancún");
        System.out.println("¡¡¡¡¡¡Felicidades!!!!");}
        //Las LLAVES se usan cuando son más de una intrucción. 
     //Dentro del If. si es una sola instrucción, NO SE USAN.
    
     else//else= si no. (ES OPCIONAL)y  es siempre para el FALSO
            System.out.println("No Acreditado :/ ");
            
            
      System.out.println ("End of Line");
    }
           
    
}
