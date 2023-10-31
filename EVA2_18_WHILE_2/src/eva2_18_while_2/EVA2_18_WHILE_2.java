/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_18_while_2;

import java.util.Scanner;



/**
 *
 * @author invitado
 */
public class EVA2_18_WHILE_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int num= 100;
        int cap = 0;
        
        while(cap != num){
            System.out.print("INTRODUCE EL NÚMERO: ");
            cap=input.nextInt();
        }
        if(cap==num)
        System.out.println("¡¡¡¡FELICIDADES!!!! ADIVINASTE EL NÚMERO");
    }
    
    
}
