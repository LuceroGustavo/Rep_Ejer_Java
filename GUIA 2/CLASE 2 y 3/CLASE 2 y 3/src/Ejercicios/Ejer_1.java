
package Ejercicios;

import java.util.Scanner;


public class Ejer_1 {

    
    public static void main(String[] args) {
/*
1. Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */
Scanner leer = new Scanner(System.in);

        System.out.println(" Ingrese el primer numero");
        int num1 = leer.nextInt();
          System.out.println(" Ingrese el segundo numero");
        int num2 = leer.nextInt();
        int sum = num1 + num2;
        
      System.out.println("La suma de los numeros ingresados es "+sum);  
        

}
    }
