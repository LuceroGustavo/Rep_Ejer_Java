package LECTURA;

import java.util.Scanner;

public class Material_lectura_1 {

    /* descripción:
     Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.


     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String frase;

        do {

            System.out.println("Ingrese una frase que termine con un punto");

            frase = leer.nextLine();
        } while (!frase.endsWith("."));

        ModificaFrase(frase);

    }

    public static void ModificaFrase(String frase) {

        String auxiliar = "";

        for (int i = 0; i < frase.length(); i++) {

            switch (frase.substring(i, i + 1)) {
                case "a":
                case "A":
                    auxiliar = auxiliar.concat("@");
                     break;
                case "e":
                case "E":
   
                    auxiliar = auxiliar.concat("#");
                     break;
                   
                case "i":
                case "I":
                    auxiliar = auxiliar.concat("$");
                     break;
                case "o":
                case "O":
                    auxiliar = auxiliar.concat("%");
                     break;
                case "u":
                case "U":
                    auxiliar = auxiliar.concat("*");
                     break;
                default:
                    auxiliar = auxiliar.concat(frase.substring(i, i + 1));
            }

        }
        
        System.out.println("La nueva frase es: "+ auxiliar );
    }

}
