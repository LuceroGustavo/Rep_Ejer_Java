/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.
 */
package clase.pkg5;

import java.util.Scanner;

public class Eje_practico_2 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase ");
       String frase = leer.next();
       
       if ("eureka".equals(frase)){
           System.out.println("Correcto");
       }else
            System.out.println("Incorrecto");
    }
    
}
