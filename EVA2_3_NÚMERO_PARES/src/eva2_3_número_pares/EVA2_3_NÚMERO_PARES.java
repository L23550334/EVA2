/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_número_pares;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_NÚMERO_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap=new Scanner (System.in); 
        int val, res;
        System.out.println("Ingresa el valor a evaluar:");
        val= cap.nextInt();
        
        res=val % 2;
        
        if (res==0)
            System.out.println("¡¡El número es par!! ");
        else
             System.out.println("¡¡El número es inpar!! ");
                
   
        
        
    }
    
    
}
