/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_operaciones;



/**
 *
 * @author mac
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //OPERADOR--> Símbolo que ejecuta alguna acción
        //SUMA-->+
        int suma , val1, val2;
        val1=100;
        val2=200;
           
        suma = val1 + val2;//suma aritmética 
        System.out.println("SUMA-------");
        System.out.println("La suma es= "+suma+" pesos");//Concatenar es anexar una cadenade texto al final de otra cadena de texto.
        
        //RESTA
        
        int resta;
        resta =val1-val2;
        System.out.println("RESTA-------");
        System.out.println("La resta es= "+resta+" pesos");
        
        //MULIPLICACIÓN
        int multiplicacion;
        multiplicacion =val1*val2;
        System.out.println("MULTIPLICACIÓN-------");
        System.out.println("La multiplicación es= "+multiplicacion+" pesos");
        
        //DIVISIÓN
        int division;
        division =val2/val1;
        System.out.println("DIVISIÓN-------");
        System.out.println("La división es= "+division+" pesos");
        val1=11;
        val2=2;
        division=val1/val2;
        System.out.println("La división de 11/2= "+division+" pesos");
        int residuo= val1 % val2;
        System.out.println("La residuo de 11/2= "+residuo+" pesos");
        
        //------
        double resi=val1/val2;
        System.out.println("La residuo de 11/2= "+resi+" pesos");
        
        double val2Double=2;
        resi= val1/val2Double;
        System.out.println("La residuo de 11/2= "+resi+" pesos");
        
        double resi2 =11/2.0;
        System.out.println("La residuo de 11/2= "+resi2+" pesos");
        
        //POTENCIAS-->no hay operador, pero se usan funciones
        double potencia=Math.pow(3,3); 
               System.out.println("POTENCIA-------");
        System.out.println("3 elevado a la 3 es= "+potencia);
        
        //RAIZ
        double raiz= Math.pow(100,0.5);
        System.out.println("RAÍZ-------");
        System.out.println("La raíz cuadrada de 100 es= "+raiz );
        
        
        //Procedencia de operadores
        int resiOp, x=3,y=3,z=5;
        resiOp=(x*z)+ (x*y)/2-(y-z);
        //(15)+(6)/ 2 - (-3)
        //15+3-(3)
        //15+3+3
        //21
        System.out.println("El resultado es= "+resiOp);
        
        //FORULA GENERAL
        double resiForm, a=3, b=9 ,c=3;
        resiForm= ((-b)-(Math.pow((b*b)-(4*a*c),0.5)))/(2*a);
         System.out.println("El resultado de la formula general es= "+resiForm);
        
        
        
     
             
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
