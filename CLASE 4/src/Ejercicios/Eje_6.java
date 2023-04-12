/*
esto es de prueba para probar el *IF*
 */
package Ejercicios;

import java.util.Scanner;


public class Eje_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese 2 numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 > 25 || num2 > 25){
            
            if (num1 > 25 && num2 > 25) {
              System.out.println(" Los 2 numeros ingresados son mayores a 25");
          }else 
            if (num1 > 25 ) {  
              System.out.println(" El primer numero ingresado es mayor a 25");
          }else {
                System.out.println(" El segundo numeros ingresados es mayor a 25");
            }
                        
        }else {
            System.out.println("Ninguno de los numeros ingresados son mayores a 25");
        }
        
    }
}
