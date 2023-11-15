/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_23_validar_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_23_VALIDAR_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int valor;
        
        
        
        do{
            System.out.print("Introduce un valor entero:");
            if (input.hasNextInt()){
            valor=input.nextInt();
            
            System.out.println("SI es un valor entero");
            break;
            }else {
                System.out.println("NO es un valor entero");
                break;
            }    
        }while(true);
    }
}
