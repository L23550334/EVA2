/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_6_AND_OR_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap= new Scanner(System.in);
        int cali;
        System.out.println("Ingrese la Calificación:");
        cali=cap.nextInt();
        
        if ((cali>=0)&& (cali<=100)){
        System.out.println("LA CALIFICACIÓN "+cali+ " ES VÁLIDA");
        if (cali>=70)
            System.out.println("¡¡ACREDITASTE EL CURSO!!");
        else
                System.out.println("NO ACREDITASTE :( ");
            } else
        System.out.println("LA CALIFICACION "+ cali+ " ES INVÁLIDA");
       
    }
    
}
