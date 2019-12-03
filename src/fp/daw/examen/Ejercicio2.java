package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * 3 puntos
	 * 
	 * Escribir en el método main un programa que lea del teclado dos números enteros y calcule
	 * la suma de todos los números impares comprendidos entre ellos, ambos incluidos.
	 * 
	 * El programa deberá calcular el resultado sin importar el orden en que se introduzcan los dos números
	 * (primero el mayor o primero el menor).
	 * 
	 * Si es posible, minimizar el número de iteraciones que se ejecutarán para obener el resultado.
	 * 
	 * No se permite el uso de la clase Scanner para leer del teclado.
	 * 
	 * Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2 y 3.
	 */
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("dime un numero: ");
		int num1 = sc.nextInt();
		System.out.println("dime otro numero");
		int num2 = sc.nextInt();
		int i;
		int suma=0;
		
		if (num1>num2)
		{
			for ( i =num2+1; i<num1;i++)
				if (i %2!=0)
				{
					suma = suma +i;
				}
		}
		if (num1<num2)
		{
			for (i=num1+1;i<num2;i++)
				if (i %2 !=0)
				{
					suma = suma +i;
				}
		}
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("la suma de los impares es: "+ suma);
		
	}

}
