/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
    Dado dos números ingresados por el usuario realizar las
    4 operaciones básicas, suma, resta, multiplicación,
    división e imprimir las operaciones. Validar la división
    entre 0(cero).
 */
public class Ejercicio_4 {
     public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Dame Primer valor de la operacion:\n");
        double numero1 = leer.nextDouble();
        
        System.out.println("Dame segundo valor de la operacion:\n");
        double numero2 = leer.nextDouble();
        
        
        double suma = numero1+numero2;
         System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + suma);
         
        double resta = numero1-numero2;
         System.out.println("resta: " + numero1 + " - " + numero2 + " = " + resta);
         
         
        double multi = numero1*numero2;
         System.out.println("Multiplicacion: " + numero1 + " * " + numero2 + " = " + multi); 
         
         if(numero2 !=0){
             double divi = numero1/numero2;
                 System.out.println("divicion: " + numero1 + " / " + numero2 + " = " + divi);
                 
            }else{
                   System.out.println("No es posible dividir por cero");
         }
 
    }
}
