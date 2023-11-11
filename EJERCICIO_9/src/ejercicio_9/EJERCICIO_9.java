/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class EJERCICIO_9 {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);

        
        System.out.print("Introduce una cadena de texto: ");
        String cadena = input.nextLine();

        
        System.out.print("Introduce el carácter a buscar: ");
        char Busqueda = input.next().charAt(0);

        
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracterCadena = cadena.charAt(i);
           
            if (caracterCadena == Busqueda) {
                contador++;
            }
        }


        System.out.println("El carácter '" + Busqueda + "' aparece " + contador + " veces en la cadena.");

    }
    
}
