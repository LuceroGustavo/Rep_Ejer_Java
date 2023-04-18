
package LECTURA;
import java.util.Scanner;

public class Material_lectura_2 {

    /* descripción:
     Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.


     */
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    int num1,num2 ;
    
        System.out.println(" Ingrese 2 numeros mayor a 0 para comprobar si el primero es multiplo del segundo");
        
    num1 =leer.nextInt();
    num2 = leer.nextInt();
    
    EsMultiplo(num1,num2);

    }
    
    public static void EsMultiplo(int num1,int num2){
        if (num2%num1 == 0) {
            
            System.out.println("el numero "+num1+" es multiplo de "+num2);
            
        } else {
            
            System.out.println("E primer numero no es multiplo del segundo");
        }
        
    
     }
    

    

}
