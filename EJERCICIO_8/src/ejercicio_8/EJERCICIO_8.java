 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8;
import java.util.Scanner;
/**
 *
 * @author mac
 */
public class EJERCICIO_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
        
        char inputChar;

        while (true) {
            System.out.print("Introduce un carácter alfabético (o un espacio en blanco para salir): ");
            String userInput = scanner.nextLine();

            if (userInput.isEmpty() || userInput.charAt(0) == ' ') {
                System.out.println("Saliendo del programa.");
                break;
            }
        
         if (userInput.length() == 1) {
                inputChar = userInput.charAt(0);
                
                
                switch (Character.toLowerCase(inputChar)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println(inputChar + " es una vocal.");
                        break;
                    default:
                        System.out.println(inputChar + " es una consonante.");
                        break;
                }
            } else {
                System.out.println("Ingresa solo un carácter válido.");
            }    
            
        
            }

       
    

    
    }
}

     

