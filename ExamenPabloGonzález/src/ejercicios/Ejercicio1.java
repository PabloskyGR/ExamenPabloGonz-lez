package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

		/**
		 * RRUEBAS
		 * 
		 * 1. Valor introducido: f
		 * Respuesta esperada: Error, el valor introducido no es de un tipo válido
		 * Respuesdta final: Error, el valor introducido no es de un tipo válido
		 * 
		 *  1. Valor introducido: 3
		 * Respuesta esperada:   ***
		 *						*****
		 *					   *******
		 *					    *****
		 *					     ***
		 *
		 * Respuesdta final:  ***
		 *					 *****
		 *					*******
		 *					 *****
		 *   				  ***
		 * 
		 **/

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos que introduzca el usuario
		int num = 0;
		
		// Probamos con un try-catch para ver si el número introducido es del tipo válido
		try {
			System.out.println("Introduce el tamaño del lado:");
			num = sc.nextInt();
		// Capturamos la excepción y mostramos un mensaje de error
		}catch(InputMismatchException e) {
			System.out.println("Error, el valor introducido no es de un tipo válido");
			sc.nextLine();	
		}
		
		// Bucle donde crearemos las filas del hexagono
		for(int i = 1; i <= num; i++) {
			// Bucle donde crearemos los espacios
			for(int j = i; j <= num - 1; j++) {
				System.out.print(" ");
			}
			// Bucle donde crearemos la mitad de los asteriscos
			for(int k = i; k > 0; k--) {
				System.out.print("*");
			}
			// Añadimos con otro bucle los asteriscos del medio respecto el número introducido
			for(int b = num - 2; b > 0; b--) {
				System.out.print("*");
			}
			// Hacemos lo mismo en la mitad derecha
			for(int a = i; a > 0; a--) {
				System.out.print("*");
			}
			// Salto de linea
			System.out.println();
		}
		// Bucle donde crearemos las filas del hexagono
		for(int i = num - 1; i > 0; i--) {
			// Bucle donde crearemos los espacios
			for(int j = i; j <= num - 1; j++) {
				System.out.print(" ");
			}
			// Bucle donde crearemos la mitad de los asteriscos
			for(int k = i; k > 0; k--) {
				System.out.print("*");
			}
			// Añadimos con otro bucle los asteriscos del medio respecto el número introducido
			for(int b = num - 2; b > 0; b--) {
				System.out.print("*");
			}
			// Hacemos lo mismo en la mitad derecha
			for(int a = i; a > 0; a--) {
				System.out.print("*");
			}
			// Salto de linea
			System.out.println();
		}
		
		// Cerramos el scanner
		sc.close();
	}

}
