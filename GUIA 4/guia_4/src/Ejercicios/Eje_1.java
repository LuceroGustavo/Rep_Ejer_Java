package Ejercicios;

import static java.lang.System.exit;
import java.util.Scanner;

public class Eje_1 {

    /* descripción:
     Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.


     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int resultado,opcion;
        double res_division;
        
        System.out.println("Ingrese 2 numeros para realizar operaciones ");
        System.out.println("");
        
        System.out.println("Ingrese el numero a:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el numero b:");
        int num2 = leer.nextInt();
        System.out.println("");
       
        
        do {
            
       
        
        System.out.println(" ingrese la operacion que desea realizar o precione 0 para salir ");
        System.out.println("1- a+b");
        System.out.println("2- a-b");
        System.out.println("3- a/b");
        System.out.println("4- a*b");
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                resultado = suma(num1, num2);

                System.out.println(" el resultado es: " + resultado);

                break;
            case 2:
                resultado = resta(num1, num2);
                System.out.println(" el resultado es: " + resultado);
                break;
            case 3:
                res_division = divide(num1, num2);
                System.out.println(" el resultado es: " + res_division);
                break;
            case 4:
                resultado = producto(num1, num2);
                System.out.println(" el resultado es: " + resultado);
                break;
                case 0:
                    exit(0);
                
        }   
         } while (opcion!=0);

    }

    public static int suma(int a, int b) {
        int c = a + b;

        return c;
    }

    public static int resta(int a, int b) {
        int c = a - b;

        return c;

    }

    public static double divide(int a, int b) {

        double c = a / b;

        return c;

    }

    public static int producto(int a, int b) {
        int c = a * b;

        return c;
    }
}
