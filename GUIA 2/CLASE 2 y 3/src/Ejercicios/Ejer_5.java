
package Ejercicios;

import java.util.Scanner;



public class Ejer_5 {

    
    public static void main(String[] args) {
/*
5. Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
Scanner leer = new Scanner(System.in);

        System.out.println(" Ingrese un número");
        int num = leer.nextInt();
            
        
      System.out.println(" El DOBLR de "+num+" es: "+ num*2 );  
      System.out.println(" El TRIPLE de "+num+" es: "+ num*3 );
      System.out.println(" La RAIZ CUADRADA de "+num+" es: " + Math.sqrt(2) );
      
        
      System.out.println("Fin del Ejer_5");
}
    }
