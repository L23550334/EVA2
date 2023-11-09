/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class EJERCICIO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
         int num;
         int suma=0;
         
         System.out.print("Ingresa un número: ");
         num=input.nextInt();
         
         for (int i = 1; i <= num; i++) {
           suma+=i;  
            
        }
         System.out.println("La suma desde el 1 hasta el número que ingreso es de: "+suma);         
  
            
            
            
            
          

       
    }
    
}
