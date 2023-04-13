/*
 7. Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package clase.pkg5;

import java.util.Scanner;

public class Eje_practico_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont_correctos = 0;
        int cont_incorrectos = 0;
        System.out.println("Ingrese una cadena FDE");
        String fde = leer.next();

        while ("&&&&&".equals(fde) == false) {

            if (fde.length() == 5 && "x".equals(fde.substring(0, 1)) && "o".equals(fde.substring(4, 5))) {

                cont_correctos++;

            } else {

                cont_incorrectos++;
            }
            System.out.println("Ingrese otra cadena FDE");
            fde = leer.next();

        }

        System.out.println("La cantidad de cadenas correctas ingresadas es " + cont_correctos);
        System.out.println("");
        System.out.println("La cantidad de cadenas Incorrectas ingresadas es " + cont_incorrectos);
        System.out.println("");
        System.out.println("***FIN de la ejecucion*** Gustavo Luero");
    }

}
