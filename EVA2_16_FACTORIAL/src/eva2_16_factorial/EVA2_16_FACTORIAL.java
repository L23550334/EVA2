/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_factorial;

import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA2_16_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap=new Scanner(System.in);
        
        System.out.print("Ingrese un número de veces: ");
        int num=cap.nextInt();
        
        int factorial=1;
        
                
        for (int i = 1; i <= num; i++) {
            System.out.print(i +" x ");
            factorial= factorial*i;
        }
        System.out.println("");
        System.out.println("Factorial de "+num+" es: "+factorial);
        System.out.println("");
        
        int factorial1=1;
         for(int i=num; i >=1; i--){
            System.out.print(i+" x ");
            factorial1= factorial1*i;
    }
         System.out.println("");
         System.out.println("Factorial de "+num+" es: "+factorial1);
    
    }
}