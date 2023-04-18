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
public class Eje_2 {

    /**
     2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("El nombre que ingreso es "+nombre);
     
    }
    
}
