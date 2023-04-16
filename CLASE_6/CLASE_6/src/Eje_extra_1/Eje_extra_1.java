package Eje_extra_1;

import static java.lang.System.exit;
import java.util.Scanner;

public class Eje_extra_1 {

    /* Descripción:
    Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
    ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
    equivalente: 1 día, 2 horas.
    
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int minutos, cont_dias, cont_horas;
        double horas;
        cont_dias = 0;
        cont_horas = 0;
        

        System.out.println("Ingrese la cantidad de minutos para parlo a dias y horas");
        minutos = leer.nextInt();

        if (minutos >= 1440) {

            do {
                minutos = minutos - 1440;
                cont_dias++;

            } while (minutos >= 1440);

        } else if (minutos < 60) {

            System.out.println("La cantidad de minutos no llega a cubrir una hora");
            System.out.println("***fin de la ejecución***");
            exit(0);
        }

        do {

            minutos = minutos - 60;
            cont_horas++;

        } while (minutos >= 60);

        System.out.println("La cantidad de minutos ingresada es igual a " + cont_dias + " dias y " + cont_horas + " Horas");
        System.out.println("***fin de la ejecución***");
    }

}
