
package Eje_extra_1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejer_extra_10 {

    /* descripción:
     Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.


     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num;
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);

        System.out.println(a);
        System.out.println(b);
        int producto = a * b;

        System.out.println("***Adivine la Multiplicacion***");
        System.out.println("El sistema multiplicara 2 numeros al azar entre 0 y 10");
        System.out.println("si usted adivina se ganaá una licuadora!!");
        System.out.println("");
        do {
            System.out.println("Ingrese el resultado");
            num = leer.nextInt();

            if (num == producto) {

                //System.out.println("FELICITACIONES!!!!!");
                //System.out.println("Se gano una licuadora");
                
             JOptionPane.showMessageDialog(null,"FELICITACIONES!!!!!");
              JOptionPane.showMessageDialog(null,"Se gano una licuadora");  
                
                
                break;
                
                
            

            } else {
                System.out.println("Respuesta incorrecta Intente nuevamente");
            }

        } while (num != producto);

    }

}
