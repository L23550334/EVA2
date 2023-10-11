/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap=new Scanner(System.in);
        int year, residuo;
        
        System.out.println("Ingrese el año: ");
        year=cap.nextInt();
        
        residuo= year%4;
        
        if(residuo==0){
            residuo= year%100;
            if(residuo==0){
              residuo= year%400;
              if(residuo==0)
              System.out.println("ES BISIESTO");
              else
              System.out.println("NO ES BISIESTO");
              
              
            }else
                System.out.print("ES BISIESTO");
        }else
            System.out.println("NO ES UN AÑO BISIESTO");
        
            
        
        
        
    }
    
}
