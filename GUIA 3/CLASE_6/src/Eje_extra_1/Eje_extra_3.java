package Eje_extra_1;

import java.util.Scanner;

public class Eje_extra_3 {

    /* descripción:
     Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
     trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
     la función equals() de la clase String.

     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra.");
        String letra = leer.nextLine();

        if ("a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra) || "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra)) {

            System.out.println("usted ha ingresado un VOCAL");
            
        } else {
            System.out.println("usted NO ha ingresado un VOCAL");
        
        }

    }

}
