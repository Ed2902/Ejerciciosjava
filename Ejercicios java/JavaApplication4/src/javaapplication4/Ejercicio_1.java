/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Kathe Escobar
 */
public class Ejercicio_1 {

    /**
     * Leer un número determinar si es positivo o negativo.
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
     
        System.out.println("Dame un numero:\n"); 
        
       double numero1 = leer.nextDouble();
       
       if(numero1>0){
           System.out.println("El numero es positivo");       
         }else{
           System.out.println("El numero es negativo");
       }
        
       
    }
    
}
