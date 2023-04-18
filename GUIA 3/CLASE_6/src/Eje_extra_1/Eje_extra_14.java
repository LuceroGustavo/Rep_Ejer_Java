package Eje_extra_1;

import java.util.Scanner;

public class Eje_extra_14 {

    /* descripción:
     14.Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.


     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int hijos, sum_edad = 0, c_hijos = 0, edad;

        System.out.println("Ingrese la cantidad de familias");
        int familias = leer.nextInt();

        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese la cantidad de  hijos de la " + (i + 1) + "° familia ");
            hijos = leer.nextInt();
            for (int j = 0; j < hijos; j++) {

                System.out.println("Ingrese la edad del/la " + (j + 1) + "° hijo/a ");
                edad = leer.nextInt();

                c_hijos++;
                sum_edad = sum_edad + edad;

            }

        }

        System.out.println("el promedio de edad de hijos del total de las familias es " + (sum_edad / c_hijos) + " años");
    }

}
