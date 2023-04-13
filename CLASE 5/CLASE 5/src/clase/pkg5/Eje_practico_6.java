/*
 Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 */
package clase.pkg5;

import java.util.Scanner;

public class Eje_practico_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println(" Ingrese 2 numeros enteros");
        double num1 = leer.nextDouble();
        double num2 = leer.nextDouble();
        int opcion;
        int b = 0;
              
        do {

            System.out.println("****MENU****");
            System.out.println("Ingrese una opcion deseada");
            System.out.println("");
            System.out.println("1-SUMAR");
            System.out.println("2-RESTAR");
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR");
            System.out.println("5-SALIR");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(" la suma de los  numeros es: " + (num1 + num2));

                    break;

                case 2:
                    System.out.println(" la resta de los numeros es: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println(" el producto de los numeros es: " + (num1 * num2));
                    break;

                case 4:
                    System.out.println(" la division de los numeros es: " + (num1 / num2));
                    break;

                case 5:
                    System.out.println("Esta seguro que desea salir (S/N)");
                    
                    String control = leer.next();
                  
                    if ("s".equalsIgnoreCase(control)) {
                        
                        b=1;
                        break;
                        
                    } else {
                        break;
                    }
                    
                default:
            }
        } while (b != 1);
        System.out.println("***FIN DEL PROGRAMA***");
    }
}
