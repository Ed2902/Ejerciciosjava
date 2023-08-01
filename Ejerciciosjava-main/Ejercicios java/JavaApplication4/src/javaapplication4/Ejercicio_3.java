/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * Realizar un programa en Java, que realice una suma si los
3 números son pares, de lo contrario los reste e imprima
el resultado.
 */
public class Ejercicio_3 {
    
        public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
     
        System.out.println("Dame Primer valor de la operacion:\n");
        double numero1 = leer.nextDouble();
        
        System.out.println("Dame segundo valor de la operacion:\n");
        double numero2 = leer.nextDouble();
        
        System.out.println("Dame tercer valor de la operacion:\n");
        double numero3 = leer.nextDouble();
        
        if(numero1 %2 ==0 && numero2 %2==0 && numero3 %2==0){
            double suma = numero1+numero2+numero3;
                System.out.println("La suma es: " +suma);
        
            }else{
                double resta = numero1-numero2-numero3;
                System.out.println("La resta es: " +resta);
        }
    
    }       
 }
