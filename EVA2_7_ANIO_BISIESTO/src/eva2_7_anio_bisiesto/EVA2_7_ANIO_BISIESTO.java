/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_anio_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_7_ANIO_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap=new Scanner(System.in);
        int year, resi4,resi100,resi400;
        
        System.out.println("Ingrese el año: ");
        year=cap.nextInt();
        
        resi4= year % 4;
        resi100= year % 100;
        resi400= year % 400;
        //&& operador y (and)
        //|| operador o (or)
        //!= operador diferente a 
        //!operador negacion
        if ((resi4==0)&&((resi100 !=0)||(resi400==0)))
            System.out.println("El año "+ year+ " es bisiesto");
        else 
            System.out.println("El año "+ year+"NO es año bisisesto");
        
        
    }
    
}
