/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * Dado una compra realizada calcular: el iva e imprimir: la
    compra sin iva, el iva en pesos y el monto más el iva.
    Tomar en cuenta que el iva es el 19%(Utilizar constante
    para el iva). 
 */
public class Ejercicio_5 {
   
      
     public static void main(String[] args) {
         
         final double iva = 0.19;
    
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Dame el valor de la compra:\n");
        double valCompra = leer.nextDouble();
        
        double valSin = valCompra * -iva + valCompra;
        
        System.out.println("El valor sin iva es $"+valSin);
        
      
        double valIva = valCompra * iva;
        
        System.out.println("El valor del iva es $"+valIva);
                
        System.out.println("El valor total de la compra es $ " +valCompra);

        
        
     }
    }

