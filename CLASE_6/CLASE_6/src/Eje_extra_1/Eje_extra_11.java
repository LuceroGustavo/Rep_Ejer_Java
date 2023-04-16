
package Eje_extra_1;
import java.util.Scanner;

public class Eje_extra_11 {

    /* descripción:
     Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.


     */
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    int c =0;
        System.out.println("Ingrese u numero entero para contar los digitos");
        int num= leer.nextInt();

        while (num!=0) {
            
            num=num/10;
            c++;
        }
            System.out.println("la cantidad de digitos es " +c);
    }

}
