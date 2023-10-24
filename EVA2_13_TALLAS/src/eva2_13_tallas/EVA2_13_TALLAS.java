/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_tallas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_TALLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap=new Scanner(System.in);
        int talla;
        System.out.println("Ingresa tu talla: ");
        talla=cap.nextInt();
        
        switch (talla){
            case 29:
                System.out.println("Tu talla es SMALL");
                break;
            case 42:
                System.out.println("Tu talla es MEDIUM");
                break;
            case 44:
                System.out.println("Tu talla es LARGE");
                break;
            case 48:
                System.out.println("Tu talla es XLARGE");
                break;
                
            default:
                System.out.println("La talla  "+talla+" es DESCONOCIDA");
                
                
                
                
        }
    }
    
}
