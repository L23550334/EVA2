/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_tallas;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class EVA2_13_TALLAS {

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
            case 29 -> System.out.println("Tu talla es SMALL");
            case 42 -> System.out.println("Tu talla es MEDIUM");
            case 44 -> System.out.println("Tu talla es LARGE");
            case 48 -> System.out.println("Tu talla es XLARGE");
                
            default -> System.out.println("La talla  "+talla+" es DESCONOCIDA");
    }
    }
}
