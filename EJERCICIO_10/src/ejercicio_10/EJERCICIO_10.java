/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class EJERCICIO_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num;
        do{
            System.out.print("Introduce una cadena que represente un número: ");
            if (input.hasNextInt()){
            num=input.nextInt();
            
            System.out.println("La cadena SI representa un número");
            break;
            }else {
                System.out.println("La cadena NO representa un número");
                break;
            }    
        }while(true);

        
    }
    
}
