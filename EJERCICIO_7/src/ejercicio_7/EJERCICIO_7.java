/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7;
import java.util.Scanner;
/**
 *
 * @author mac
 */
public class EJERCICIO_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        
        
        int numero;
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE; 
        
        
        
        while (true) {
            System.out.print("Introduce un número: ");
            numero = input.nextInt();
            
            if (numero < 0) 
                break; 
            
            
            if (numero < min) 
                min = numero; 
            
            
            if (numero > max) 
                max = numero; 
            
        }
           if (min == Integer.MAX_VALUE) {
            System.out.println("Solo se ingreso un número Negativo");
        } else {
            System.out.println("El número más pequeño es: " + min);
            System.out.println("El número más grande es: " + max);
        }
        
        }
        
        
    }

        
        
        
        
   
