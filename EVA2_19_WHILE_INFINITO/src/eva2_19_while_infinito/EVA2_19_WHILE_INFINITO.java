/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_while_infinito;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_19_WHILE_INFINITO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int num= 100;
        int cap = 0;
        
       
        while(true){ //CICLO INFINITO, POR SI SOLO, NUNCA SE VA A DETENER 
            System.out.print("INTRODUCE EL NÚMERO: ");
            cap=input.nextInt();
        
        if(cap==num){
        System.out.println("¡¡¡¡FELICIDADES!!!! ADIVINASTE EL NÚMERO");
        break;//Romper-->DETIENE LA EJECUCIÓN
        }         
}
       
        
    } 
    }
    

