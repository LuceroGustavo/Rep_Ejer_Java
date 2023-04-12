/*
Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package Ejercicios;

import java.util.Scanner;

public class eje_10 {

       public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
     int num;
           System.out.print(" Ingrese 4 numeros enteros entre 1 y 20");
           
           for(int i=0; i < 4; i++){   
               num = leer.nextInt();
               
               System.out.print(num+" ");
               
            for(int j=0; j < num; j++){
                System.out.print("*");
                
            }
     System.out.println(" ");
    }
     System.out.println("***fin del programa***");
}
}