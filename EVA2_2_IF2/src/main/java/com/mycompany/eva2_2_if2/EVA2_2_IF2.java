/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_if2;

import java.util.Scanner;

/**
 *
 * @author uriel
 */
public class EVA2_2_IF2 {

    public static void main(String[] args) {
        Scanner nono = new Scanner (System.in);
        int valor1;
        int valor2;
        System.out.println("introduce el valor 1");
        valor1 = nono.nextInt();
        System.out.println("introduce el valor 2");
        valor2 = nono.nextInt();
        if(valor1>valor2)
            System.out.println("El valor mas grande es:"+ valor1 );
        else{
            if(valor1==valor2)
                System.out.println("Ambos valores son iguales");
            else
                System.out.println("El valor mas grande es:"+valor2);    
        }
    }
}
