/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_23_validar_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_2_23_VALIDAR_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int valor;
        String cade;
        
        
        do{
            System.out.print("Introuce un valor entero: ");
            valor=input.nextInt();
        }while(true);
    }
    
}
