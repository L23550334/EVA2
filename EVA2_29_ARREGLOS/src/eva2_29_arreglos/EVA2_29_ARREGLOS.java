/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_arreglos;

/**
 *
 * @author mac
 */
public class EVA2_29_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo= new int[2];
        //Vamos a llenar el arreglo de valores entre 0 y 99.
        
        for (int i = 0; i < arreglo.length; i++) {
            //CASTING: convierte un double en un entero.
            arreglo[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i <  arreglo.length; i++) {
            System.out.print("["+ arreglo[i] + "]");
        }
    }
    
}
