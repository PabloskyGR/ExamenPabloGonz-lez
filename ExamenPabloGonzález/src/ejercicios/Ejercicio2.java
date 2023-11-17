package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

		/**
		 * PRUEBAS PARA MOSTRAR TOTAL BILLETES
		 * 
		 * 1. Valor introducido: f
		 * Respuesta esperada: Error, el tipo de dato introducido no es válido
		 *					   Dime una cantidad de euros (Múltiplo de 5):
		 * Respuesta final: Error, el tipo de dato introducido no es válido
		 *				    Dime una cantidad de euros (Múltiplo de 5):
		 * 
		 * 2. Valor introducido: -5
		 * Respuesta esperada: Dime una cantidad de euros (Múltiplo de 5):
		 * Respuesta final: Dime una cantidad de euros (Múltiplo de 5):
		 * 
		 * 3. Valor introducido: 1250 
		 * Respuesta esperada: Necesitaras un total de:
		 *					   2 billete/s de 500
		 *				       1 billete/s de 200
		 *					   1 billete/s de 50
		 * Respuesta final: Necesitaras un total de:
		 *					2 billete/s de 500
		 *				    1 billete/s de 200
		 *				    1 billete/s de 50
		 *
		 * PRUEBAS PARA CONTINUAR INTRODUCIENDO CANTIDADES
		 * 
		 * 1. Valor introducido: s
		 * Respuesta esperada: Dime una cantidad de euros (Múltiplo de 5):
		 * Respuesta final: Dime una cantidad de euros (Múltiplo de 5):
		 * 
		 * 2. Valor introducido: n
		 * Respuesta esperada: Saliendo del programa...
		 * Respuesta final: Saliendo del programa...
		 * 
		 **/

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las constantes de los billetes 
		final int BILLETE5 = 5, // Variable donde guardaremos la cantidad del billete de 5
				  BILLETE10 = 10, // Variable donde guardaremos la cantidad del billete de 10 
				  BILLETE20 = 20, // Variable donde guardaremos la cantidad del billete de 20
				  BILLETE50 = 50, // Variable donde guardaremos la cantidad del billete de 50
				  BILLETE100 = 100, // Variable donde guardaremos la cantidad del billete de 100
				  BILLETE200 = 200, // Variable donde guardaremos la cantidad del billete de 200
				  BILLETE500 = 500; // Variable donde guardaremos la cantidad del billete de 500
		
		// Variables donde guardaremos la cantidad de billetes que necesitaremos de cda uno
		int cont5 = 0, // Variable donde guardaremos los billetes de 5 que necesitaremos
			cont10 = 0, // Variable donde guardaremos los billetes de 10 que necesitaremos
			cont20 = 0, // Variable donde guardaremos los billetes de 20 que necesitaremos
			cont50 = 0, // Variable donde guardaremos los billetes de 50 que necesitaremos
			cont100 = 0, // Variable donde guardaremos los billetes de 100 que necesitaremos
			cont200 = 0, // Variable donde guardaremos los billetes de 200 que necesitaremos
			cont500 = 0; // Variable donde guardaremos los billetes de 500 que necesitaremos
		
		// Variable donde guardaremos la cantidad de euros que nos introduzcan
		int euros = -1;
		
		// Varibale booleana para comprobar si seguimos o no con el programa
		boolean seguir;
		
		// Realizaremos un bucle do-while para ejecutar el programa cada vez que el usuario quiera seguir introduciendo cantidades
		do {
			
			// Inicializamos la varibale booleana a false
			seguir = false;
		
			// Hacemos un do-while para comprobar que la cantidad no sea menor a 0 y seguir pidiendole números
			do {
				// Hacemos un try-catch en caso de que se nos introduzca un valor del un tipo no deseado
				try {
					// Hacemos otro do-while pero para comprobar esta vez que sea múltiplo de 5
					do {
						// Y con otro try-catch comprobamos que el valor no sea del tipo diferente al que queremos
						try{System.out.println("Dime una cantidad de euros (Múltiplo de 5):");
						euros = sc.nextInt();
						
						// En caso de capturar una excepción mostramos un mensaje de error
						}catch(InputMismatchException e) {
							System.out.println("Error, el tipo de dato introducido no es válido");
							sc.nextLine();
						}
						
					}while(euros % 5 != 0); // Condición para comprobar si es múltiplo de 5
					
				// Capturamos la excepción y mostramos un mensaje de error
				}catch(InputMismatchException e) {
					System.out.println("Error, el tipo de dato introducido no es válido");
					sc.nextLine();
				}
			} while(euros < 0); // Condición para comprobar que es mayro de 0
		
			// Mostramos un mensaje antes de ejecutar el programa
			System.out.println("Necesitaras un total de:");
		
			// Comprobamos si los euros es superior a 500, y si es asi lo dividimos para averiguar cuantos billetes necesitaremos
			if(euros >= BILLETE500) {
				cont500 = euros / BILLETE500; // Dividimos los euros por la cantidad para saber cuantos billetes necesitamos y se lo asignamos a cont
				euros %= BILLETE500; // Calculamos cuanto dinero queda después de darle los billetes de 500
				System.out.println(cont500 + " billete/s de " + BILLETE500);
				
			// Comprobamos si los euros es superior a 200, y si es asi lo dividimos para averiguar cuantos billetes necesitaremos
			} if(euros >= BILLETE200) {
				cont200 = euros / BILLETE200; // Dividimos los euros por la cantidad para saber cuantos billetes necesitamos y se lo asignamos a cont
				euros %= BILLETE200; // Calculamos cuanto dinero queda después de darle los billetes de 200
				System.out.println(cont200 + " billete/s de " + BILLETE200);
				
			// Comprobamos si los euros es superior a 100, y si es asi lo dividimos para averiguar cuantos billetes necesitaremos
			} if(euros >= BILLETE100) {
				cont100 = euros / BILLETE100; // Dividimos los euros por la cantidad para saber cuantos billetes necesitamos y se lo asignamos a cont
				euros %= BILLETE100; // Calculamos cuanto dinero queda después de darle los billetes de 100
				System.out.println(cont100 + " billete/s de " + BILLETE100);
				
			// Comprobamos si los euros es superior a 50, y si es asi lo dividimos para averiguar cuantos billetes necesitaremos
			} if(euros >= BILLETE50) {
				cont50 = euros / BILLETE50; // Dividimos los euros por la cantidad para saber cuantos billetes necesitamos y se lo asignamos a cont
				euros %= BILLETE50; // Calculamos cuanto dinero queda después de darle los billetes de 50
				System.out.println(cont50 + " billete/s de " + BILLETE50);
				
			// Comprobamos si los euros es superior a 20, y si es asi lo dividimos para averiguar cuantos billetes necesitaremos
			} if(euros >= BILLETE20) {
				cont20 = euros / BILLETE20; // Dividimos los euros por la cantidad para saber cuantos billetes necesitamos y se lo asignamos a cont
				euros %= BILLETE20; // Calculamos cuanto dinero queda después de darle los billetes de 20
				System.out.println(cont20 + " billete/s de " + BILLETE20);
				
			// Comprobamos si los euros es superior a 10, y si es asi lo dividimos para averiguar cuantos billetes necesitaremos
			} if(euros >= BILLETE10) {
				cont10 = euros / BILLETE10; // Dividimos los euros por la cantidad para saber cuantos billetes necesitamos y se lo asignamos a cont
				euros %= BILLETE10; // Calculamos cuanto dinero queda después de darle los billetes de 10
				System.out.println(cont10 + " billete/s de " + BILLETE10);
				
			// Comprobamos si los euros es superior a 5, y si es asi lo dividimos para averiguar cuantos billetes necesitaremos
			} if(euros >= BILLETE5) {
				cont5 = euros / BILLETE5; // Dividimos los euros por la cantidad para saber cuantos billetes necesitamos y se lo asignamos a cont
				euros %= BILLETE5; // Calculamos cuanto dinero queda después de darle los billetes de 5
				System.out.println(cont5 + " billete/s de " + BILLETE5);
			} 
		
			// Le pedimos si quiere continuar introduciendo cantidades
			System.out.println("¿Quieres introducir otra cantidad? S/N");
		
			// Con un switch comprobamos si el usuario pone "S" para continuar
			switch(sc.next().toLowerCase()) {
			case "s": seguir = true; // En caso de que ponga una "S", el booleano se pondrá a true y continuará el programa
			}
		
			} while(seguir == true); // Condición para que el programa se siga ejecutando
		
		// Mostramos un mensaje de que el programa ha terminado
		System.out.println("Saliendo del programa...");
		
		// Cerramos el scanner
		sc.close();
		
	}

}
