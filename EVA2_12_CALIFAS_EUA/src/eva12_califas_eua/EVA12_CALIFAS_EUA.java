/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA12_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner cap=new Scanner (System.in);
        int califa;
        System.out.println("Ingresa tu calificación obtenida: ");
        califa=cap.nextInt();
        if((califa>=90)&& (califa<=100))
                System.out.println("Tu calificación es de: "+califa+" A");
        else if((califa>=80)&& (califa<=89))
                System.out.println("Tu calificación es de: "+califa+" B");
        else if((califa>=70)&& (califa<=79))
                System.out.println("Tu calificación es de: "+califa+" C");
        else if((califa>=60)&& (califa<=69))
                System.out.println("Tu calificación es de: "+califa+" D");
        else if((califa>=0)&& (califa<=60))
                System.out.println("Tu calificación es de: "+califa+" F");
    else
         
            System.out.println("La calificación "+califa+" es INVÁLIDA");
        
}
}