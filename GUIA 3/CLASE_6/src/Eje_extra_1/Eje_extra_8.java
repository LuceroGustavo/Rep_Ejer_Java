
package Eje_extra_1;
import java.util.Scanner;

public class Eje_extra_8 {

    /* descripción:
     Escriba un programa que lea números enteros. Si el número es múltiplo
    de cinco debe detener la lectura y mostrar la cantidad de números
    leídos, la cantidad de números pares y la cantidad de números impares.
    Al igual que en el ejercicio anterior los números negativos no deben
    sumarse. Nota: recordar el uso de la sentencia break.


     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int c_num_leidos = 0, c_num_pares = 0, c_num_impares = 0;

        System.out.println("Ingrese numeros enteros ");

        double num = leer.nextDouble();

        while (num % 5 != 0) {
           if (num > 0) {
                c_num_leidos++;

                if (num % 2 == 0) {

                    c_num_pares++;

                } else {
                    c_num_impares++;
                }
            }
                   System.out.println("Ingrese numeros enteros ");

                   num = leer.nextDouble();
        }

        System.out.println(" la cantidad de numeros ingresados NO MULTIPLOS DE 5 es :"+ c_num_leidos);
        System.out.println("la cantidad de numeros pares es :" +c_num_pares );
        System.out.println("la cantidad de numeros impares es :" +c_num_impares );
    }

}

