
package Ejercicios;

import java.util.Scanner;


public class Ejer_4 {

    
    public static void main(String[] args) {
/*
4. Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
Scanner leer = new Scanner(System.in);

        System.out.println(" Ingrese la cantidad de Grados en CENTIGRADOR");
        int num = leer.nextInt();
         
        int far = 32+(9*num/5);
        
      System.out.println("crresponde a "+far+ "° Fahrenheit ");  
        
      System.out.println("Fin del Ejer_4");
}
    }
