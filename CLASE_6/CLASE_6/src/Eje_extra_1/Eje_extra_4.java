package Eje_extra_1;

import static java.lang.System.exit;
import java.util.Scanner;

public class Eje_extra_4 {

    /* descripción:
    Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
    muestre su equivalente en romano.
     */
    public static void main(String[] args) {
        int b;
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 10 para ver su equivalente en números Romano ");
        System.out.println("");

        do {
            
            System.out.println("Ingrese un número del 1 al 10 -- para salir Ingrese el Numero 0 ");
           b=0; 
            num = leer.nextInt();
            if (num == 0) {
                System.out.println("***fin de la ejecución***");
                exit(0);
            }

            while (num > 10 && b != 2) {
                b++;
                System.out.println(b + " de 3 intentos");
                System.out.println("te dije entre 1 y 10 -Anda pa ya.. bobo..");
                System.out.println("ingrese un número ente 1 y 10 ");

                num = leer.nextInt();
                if (num == 0 || b==2) {
                    System.out.println("***fin de la ejecución***");
                    exit(0);
                }
            }

            switch (num) {
                case 1:
                    System.out.println("el " + num + " en romano es I.");
                    break;
                case 2:
                    System.out.println("el " + num + " en romano es II.");
                    break;
                case 3:
                    System.out.println("el " + num + " en romano es III.");
                    break;
                case 4:
                    System.out.println("el " + num + " en romano es IV.");
                    break;
                case 5:
                    System.out.println("el " + num + " en romano es V.");
                    break;
                case 6:
                    System.out.println("el " + num + " en romano es VI.");
                    break;
                case 7:
                    System.out.println("el " + num + " en romano es VII.");
                    break;
                case 8:
                    System.out.println("el " + num + " en romano es VIII.");
                    break;
                case 9:
                    System.out.println("el " + num + " en romano es IX.");
                    break;
                case 10:
                    System.out.println("el " + num + " en romano es X.");
                    break;

            }

        } while (num != 0);

        System.out.println("");
        System.out.println("***fin de la ejecución***");

    }

}
