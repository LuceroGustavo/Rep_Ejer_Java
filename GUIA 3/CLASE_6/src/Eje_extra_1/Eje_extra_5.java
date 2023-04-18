
package Eje_extra_1;
import java.util.Scanner;

public class Eje_extra_5 {

    /* descripción:
     


     */
     public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
     
      
        System.out.println("Ingrese la CLASE/TIPO de socio A,B,C. ");
        String tipo_socio = leer.nextLine();
        System.out.println("Por favor Ingrese el costo del tratamiento");
        double costo = leer.nextDouble();
        double descuento ;
        
        switch(tipo_socio){
            case "A":
                System.out.println("El costo final a abonar es de $" + (costo/2));
                break;
            case "B":  
                
                descuento = (costo*35)/100;
                System.out.println("El costo final a abonar es de $"+ (costo-descuento));
                break;
            case "C":    
                System.out.println("El costo final es de $"+costo+" dado que el tipo de plan no posee descuentos ");
                break;
        }
    }

}
