package javaapplication4;

import java.util.Scanner;

/**
*
* Calcular el cubo de un número entero ingresado por el
usuario.	
*/

public class Ejercicio_7 {
	public static void main(String[] args) {
		
		
	Scanner leer = new Scanner(System.in);
    	System.out.println("Dame un numero: \n");
    	int numeroL = leer.nextInt();
    
    	int numCubo = numeroL*numeroL*numeroL;
    
    	System.out.println("El valor al cuba de el numero es: \n" + numCubo);}
}
