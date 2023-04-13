/*
Crear un programa que dado un número determine si es par o impar.

 */
package clase.pkg5;

import java.util.Scanner;

public class Eje_practico_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para determinar si es Par o Impar");
        int num = leer.nextInt();
        
        if (num%2 ==0){
            System.out.println("Numero Par");
        }else
                        System.out.println("Numero Impar");

        
    }
    
    
}
