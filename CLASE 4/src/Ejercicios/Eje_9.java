

package Ejercicios;

import java.util.Scanner;

/**
Ejercicio 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
public class Eje_9 {

      public static void main(String[] args) {
     Scanner leer = new Scanner(System.in); 
     
     int num = 0;
     int cont =0;
     int sum = 0;       
     do {
         
       cont++;
         System.out.println("Ingrese el "+cont+" Número");
         
         num = leer.nextInt();
         
         if(num == 0){
             System.out.println("Se capturo el numero 0 ");
             break;
         }else if(num > 0){
         
         sum = num + sum;
         
         }
             
        } while(cont < 20 );    
      
          System.out.println("La suma de los numeros leidos es de "+sum);
     
     
    
         }
    
}
