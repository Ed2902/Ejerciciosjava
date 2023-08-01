/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 * Leer dos números y determinar ¿cuál de los dos es
    positivo?
 */
public class Ejercicio_2 {
    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
     
        System.out.println("Dame un numero positivo:\n");
        double numero1 = leer.nextDouble();
    
        System.out.println("Dame un numero negativo:\n");
        double numero2 = leer.nextDouble();
    
        if(numero1<0){
                
            System.out.println("El "+ numero1 + " es negativo");   
            }else{
            
                System.out.println("El "+ numero1 + " es positivo");
            }
        
        if(numero2<0){
                
            System.out.println("El "+ numero2 + " es negativo");   
            }else{
            
                System.out.println("El "+ numero2 + " es positivo");
            }
        
    }
}