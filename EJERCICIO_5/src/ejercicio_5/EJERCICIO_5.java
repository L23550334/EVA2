/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;
import java.util.Scanner;
/**
 *
 * @author mac
 */
public class EJERCICIO_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        boolean continuar=true;
        while(continuar){
        System.out.print("Ingrese el número que será la base: ");
        double n1=input.nextDouble();
         System.out.print("Ingrese el número que será el exponente: ");
        double n2=input.nextDouble();
        
        double elevado =Math.pow(n1,n2);
            System.out.println("El resultado de la operación es: "+elevado);
        
            System.out.print("¿Desea terminar el programa? (Sí/No): ");
            String respuesta = input.next();

            if (("Si".equals(respuesta))||("si".equals(respuesta))) 
                continuar = false;
            
        }

        System.out.println("Programa terminado.");   
    }
    
}
