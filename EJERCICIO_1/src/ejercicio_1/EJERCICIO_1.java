/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class EJERCICIO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input= new Scanner (System.in);
    
        System.out.println("INGRESE DOS NUMEROS  ENTEROS POSITIVOS:");
        int n1=input.nextInt();
        int n2=input.nextInt();
       
        System.out.println("");
        
        for (int i = n1; i <= n2; i++) {
            System.out.print( i +"-");
    }
    
}
}