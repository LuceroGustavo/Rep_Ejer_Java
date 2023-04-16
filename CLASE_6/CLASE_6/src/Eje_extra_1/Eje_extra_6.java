
package Eje_extra_1;
import java.util.Scanner;

public class Eje_extra_6 {

    /* descripción:
     


     */
  public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
      int cont_estandar=0;
      int cont_debajo =0;
      double sum_estandar =0;
      double sum_debajo=0;
      double altura;            
              
        System.out.println("Ingrese la cantidad de personas que desea sacar el estadistico");
        int personas = leer.nextInt();
        
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la medidad de la "+i+" persona");
            altura = leer.nextDouble();
            
            if (altura > 1.6) {
                cont_estandar++;
                sum_estandar = sum_estandar + altura;
                
                
            } else {
                cont_debajo++;
                sum_debajo =sum_debajo+altura;
                
            }
     

        }
System.out.println("El promedio de altura de personas mayor a 1.60mts es de "+(sum_estandar / cont_estandar)); 
            System.out.println("El promedio de altura de personas menor a 1.60mts es de "+(sum_debajo / cont_debajo)); 

    }

}

