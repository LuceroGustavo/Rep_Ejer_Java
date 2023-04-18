/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;


/**
 *
 * @author Luceros
 */
public class Eje_3 {

    /**
    3. Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese ua frase ");
        String frase = leer.nextLine();
        
        //Srting frasemin = toLowerCase(frase);
        //srting frasemay = toUpperCase(frase);
                
        System.out.println(" usted escribio "+ frase.toLowerCase());
        System.out.println(" usted escribio "+ frase.toUpperCase());
        
                
        
    }

    
}
