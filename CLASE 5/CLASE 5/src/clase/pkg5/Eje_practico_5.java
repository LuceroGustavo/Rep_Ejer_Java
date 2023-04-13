/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package clase.pkg5;

import java.util.Scanner;

public class Eje_practico_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite");
        
        int limite = leer.nextInt();
        int sum =0;
        
        for (int i = 0; i < limite; i++) {
            
            System.out.println(" Ingrese el "+i+" numero");

            int num = leer.nextInt();
            
            sum = sum + num;
            
            if (sum < limite) {
                
                continue;
                
            } else {
                break;
            }
            
        }
          System.out.println(" la suma de los numeros leidos es de "+sum);              
    }
    
}
