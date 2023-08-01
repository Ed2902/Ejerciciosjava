package javaapplication4;

import java.util.Scanner;
/**
*
* Calcular el cuadrado de un número ingresado por teclado
e imprimirlo.	
*/

public class Ejercicio_6 {
	
	public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
       System.out.println("Dame un numero: \n");
       double numeroL = leer.nextDouble();
       
       double numCuadrado = numeroL*numeroL;
       
       System.out.println("El valor al cuadrado de el numero es: \n" + numCuadrado);
       
       
       
       
       
       
       
}
}
