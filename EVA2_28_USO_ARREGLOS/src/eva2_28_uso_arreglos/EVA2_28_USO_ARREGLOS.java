/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_uso_arreglos;
import java.util.Scanner;
/**
 *
 * @author mac
 */
public class EVA2_28_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int cant;
        int[]califas;//Todavia no existe el arreglo
        
        System.out.print("Cuantas calificaciones quieres capturar?: ");
        cant=input.nextInt();
        
        califas=new int[cant];//Ahora si el arreglo ha sido creado
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese la calificación");
            califas[i] = input.nextInt();
        }
        for (int i = 0; i < cant; i++) {
            System.out.print ("["+ califas[i]+"]");
            
        }
    }  
}
