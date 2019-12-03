package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio3 {

	/* 3 puntos
	 * 
	 * Decimos que un número entero positivo es guay si puede obtenerse como suma de dos o más números
	 * enteros consecutivos. Por ejemplo, 3 (=1+2), 5 (=2+3), 6(=1+2+3), son números guays.
	 * 
	 * Escribir en el método main un programa que lea un número entero positivo e indique si éste es guay.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("dime un numero: ");
		int numero = sc.nextInt();
		
		
		for (int i = 0; i< numero; i++)
		{
			if (numero == i+ (i+1))
			{
				System.out.println("es guay");
			}
			else  System.out.println("no es guay");
			
			if (numero == i+ (i+1)+(i+2))
			{
				System.out.println("es guay");
			}
			else System.out.println("no es guay");
		}
	}

}
