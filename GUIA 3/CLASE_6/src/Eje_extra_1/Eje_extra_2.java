
package Eje_extra_1;
import java.util.Scanner;

public class Eje_extra_2 {

    /* descripción:
     Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
     diferente a cada una. A continuación, realizar las instrucciones
     necesarias para que: B tome el valor de C, C tome el valor de A, A tome
     el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
     valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    
        int A=10,B=20,C=30,D=40,AUX;
        
        System.out.println("variables de fotmato inicial");
        System.out.println("A = "+A);
        System.out.println("B = "+B);
        System.out.println("C = "+C);
        System.out.println("D = "+D);
        System.out.println("");
       AUX=B;
       B=C;
       C=A;
       A=D;
       D=AUX;
       
       System.out.println("variables TRANSFORMADAS");
       
        System.out.println("B tome el valor de C, C tome el valor de A, A tome\n" +
                            "el valor de D y D tome el valor de B");
        System.out.println("");
        System.out.println("A = "+A);
        System.out.println("B = "+B);
        System.out.println("C = "+C);
        System.out.println("D = "+D);
        System.out.println("");
        System.out.println("***fin de la ejecución***");
    }

}
