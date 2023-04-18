
package Eje_extra_1;
import java.util.Scanner;

public class Eje_extra_7_dowhile {

    /* descripción:
     Realice un programa que calcule y visualice el valor máximo, el valor
    mínimo y el promedio de n números (n>0). El valor de n se solicitará al
    principio del programa y los números serán introducidos por el usuario.
    Realice dos versiones del programa, una usando el bucle “while” y otra
    con el bucle “do - while”.


     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int max=0, num , min=0, b = 0, cont = 0, sum = 0;
        double promedio;
        System.out.println("Ingrese la cantidad de numeros que va a ingresar");
        int n = leer.nextInt();

        //while (b <= n-1) {
        
        do {
    
            b++;
            
            System.out.println("Ingrese el un "+ b + "° numero");
            num = leer.nextInt();

            if (b == 1) {

                max = num;
                min = num;
            }

            sum = sum + num;
            min=Math.min(num,min);
            max=Math.max(max,num);
            
             } while (b<n);
        //}
        promedio = sum / n;
        
        System.out.println("El maor numero ingresado es "+max);
        System.out.println("El menor numero ingresado es "+min);
        System.out.println("El promedio de los numeros ingresados es " + promedio);
        
        
        
        
        
    }

}
