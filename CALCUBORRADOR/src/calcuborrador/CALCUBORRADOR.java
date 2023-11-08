/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcuborrador;

import java.util.Scanner;

public class CALCUBORRADOR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Calculadora Binaria");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("Saliendo de la calculadora.");
                break;
            }

            System.out.print("Ingrese el primer número binario: ");
            String numero1 = scanner.next();

            System.out.print("Ingrese el segundo número binario: ");
            String numero2 = scanner.next();

            switch (opcion) {
                case 1:
                    String suma = sumarBinarios(numero1, numero2);
                    System.out.println("Resultado: " + suma);
                    break;
                case 2:
                    String resta = restarBinarios(numero1, numero2);
                    System.out.println("Resultado: " + resta);
                    break;
                case 3:
                    String multiplicacion = multiplicarBinarios(numero1, numero2);
                    System.out.println("Resultado: " + multiplicacion);
                    break;
                case 4:
                    String division = dividirBinarios(numero1, numero2);
                    System.out.println("Resultado: " + division);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    //  Suma de dos números binarios 
    public static String sumarBinarios(String bin1, String bin2) {
        int maxLength = Math.max(bin1.length(), bin2.length());
        bin1 = padLeft(bin1, maxLength);
        bin2 = padLeft(bin2, maxLength);

        StringBuilder resultado = new StringBuilder();
        int carry = 0;

        for (int i = maxLength - 1; i >= 0; i--) {
            int bit1 = Character.getNumericValue(bin1.charAt(i));
            int bit2 = Character.getNumericValue(bin2.charAt(i));

            int suma = bit1 + bit2 + carry;
            resultado.insert(0, suma % 2);
            carry = suma / 2;
        }

        if (carry > 0) {
            resultado.insert(0, carry);
        }

        return resultado.toString();
    }

    // Resta de dos números binarios 
    public static String restarBinarios(String bin1, String bin2) {
        int maxLength = Math.max(bin1.length(), bin2.length());
        bin1 = padLeft(bin1, maxLength);
        bin2 = padLeft(bin2, maxLength);

        StringBuilder resultado = new StringBuilder();
        int borrow = 0;

        for (int i = maxLength - 1; i >= 0; i--) {
            int bit1 = Character.getNumericValue(bin1.charAt(i));
            int bit2 = Character.getNumericValue(bin2.charAt(i));

            int resta = bit1 - bit2 - borrow;
            if (resta < 0) {
                resta += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }

            resultado.insert(0, resta);
        }

        return resultado.toString();
    }

    // Multiplicación de dos números binarios 
    public static String multiplicarBinarios(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) * Integer.parseInt(bin2, 2));
    }

    //Dividición de dos números binarios 
    public static String dividirBinarios(String bin1, String bin2) {
        int numero1 = Integer.parseInt(bin1, 2);
        int numero2 = Integer.parseInt(bin2, 2);

        if (numero2 == 0) {
            return "Error: División por cero";
        }

        return Integer.toBinaryString(numero1 / numero2);
    }

    //Rellenado de una cadena con ceros a la izquierda
    public static String padLeft(String s, int length) {
        return String.format("%" + length + "s", s).replace(' ', '0');
    }
}
