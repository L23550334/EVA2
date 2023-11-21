/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_uso_arreglos2;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class EVA2_31_USO_ARREGLOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
        int valor;
        int posi = -1;
        int[] arreglo = new int[15];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("¿Que valor necesitas?");
        valor = input.nextInt();
        for (int i = 0; i < arreglo.length; i++) {
                if(arreglo[i] == valor){
                   posi = i;
                   System.out.println("Valor encontrado en: " + i);
                   break;
                }
                if(i == (arreglo.length - 1))
                    System.out.println("No se encuentra");

        }
    }
}
