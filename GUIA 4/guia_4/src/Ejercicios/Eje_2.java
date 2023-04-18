package Ejercicios;
import java.util.Scanner;


public class Eje_2 {

    /* descripción:
     *Diseñe una función que pida el nombre y la edad de N personas e imprima
    los datos de las personas ingresadas por teclado 
    e indique si son mayores o menores de edad. Después de cada persona, 
    el programa debe preguntarle al usuario 
    si quiere seguir mostrando personas y frenar cuando el usuario ingrese 
    la palabra “No”.


     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String opcion;

        do {

            ImprimirNombre();

            System.out.println("Desea continiar SI/NO");
            opcion = leer.nextLine();

        } while (!"no".equalsIgnoreCase(opcion));

    }

    public static void ImprimirNombre() {
  Scanner leer = new Scanner(System.in);
        int edad;
        //Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nombre de una persona");
        String pesrona = leer.nextLine();

        System.out.println("Ingrese la edad de ");
        edad = leer.nextInt();

        if (edad < 18) {

            System.out.println(" Es mayor de edad");

        } else {
            System.out.println(" Es menor de edad");
        }

    }
}
