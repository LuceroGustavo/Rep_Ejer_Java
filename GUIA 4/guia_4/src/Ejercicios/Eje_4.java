
package Ejercicios;
import java.util.Scanner;

public class Eje_4 {

    /* descripción:
     4. Crea una aplicación que nos pida un número por teclado y con una
    función se lo pasamos por parámetro para que nos indique si es o no un
    número primo, debe devolver true si es primo, sino false.
    Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
    Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
    17 si es primo.


     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero para verificar si es primo");

        int num = leer.nextInt();

        if (VerificaPrimo(num)) {

            System.out.println("Es primo");
        } else {

            System.out.println("NO.... Es primo");
        }

    }

    public static boolean VerificaPrimo(int num) {
        int c=0;
        for (int i = 1; i <= num; i++) {
            
            if ((num%i ==0)) {
               c++; 
            }
        }
           return(c==2);

    }
}
