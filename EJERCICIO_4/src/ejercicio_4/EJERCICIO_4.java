/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;
import java.util.Scanner;
/**
 *
 * @author mac
 */
public class EJERCICIO_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese un número: ");
            double numero = input.nextDouble();

            if (numero > 0) 
                System.out.println("El número es positivo.");
            if (numero < 0) 
                System.out.println("El número es negativo.");
            if (numero==0)
                System.out.println("El número es cero.");
            

            System.out.print("¿Desea terminar el programa? (Sí/No): ");
            String respuesta = input.next();

            if ("Si".equals(respuesta)) 
                continuar = false;
            
        }

        System.out.println("Programa terminado.");   
       
            
           
    }
    
}
