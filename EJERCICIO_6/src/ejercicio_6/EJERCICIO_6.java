/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;
import java.util.Scanner;
/**
 *
 * @author mac
 */
public class EJERCICIO_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        boolean continuar=true;
        
        while(continuar){
            System.out.print("Ingrese un número positivo: ");
            int num=input.nextInt();
            String binario= Integer.toBinaryString(num);
            System.out.println("El numero ingresado en Binario es: "+ binario);
            
            if (num<0){
                System.out.println("EROR, tiene que ser un numero positivo.");
        }
        
                
    }
    
}
}