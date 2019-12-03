package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio1 {

	/* 
	 * 4 puntos
	 * 
	 * Escribir en el método main un programa que pida por teclado un número decimal menor o igual
	 * que 3000 y muestre por pantalla el resultado de convertirlo a un número romanos.
	 *     
	 *     La conversión se realizará transformando individualmente cada dígito, empezando por el correspondiente
	 *     a las unidades de millar, seguido de las centenas, decenas y unidades de la forma siguiente:
	 *     
	 *     		Dígito decimal		|	Transformación
	 *     		--------------------|----------------------------------------------------------------------------
	 *     		1, 2 o 3			|	Escribir C1 de una a tres veces
	 *     		4					|	Escribir C1 seguido de C2
	 *     		5, 6, 7 o 8			|	Escribir una vez C2 seguido de C1 de cero a tres veces
	 *     		9					|	Escribir C1 seguido de C3
	 *     
	 *     donde C1, C2 y C3 son los caracteres de numeración romana que corresponda según la tabla siguiente:
	 *     
	 *     							|   C1   |   C2   |   C3   |
	 *     		--------------------|--------|--------|--------|        
	 *     		unidades			|	I    |   V    |   X    |
	 *     		decenas				|	X    |   L    |   C    |
	 *     		centenas			|	C    |   D    |   M    |
	 *     		unidades de millar	|	M    |        |        |
	 *     
	 *     Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2 y 3.
	 */

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("dime un numero menor que 3001");
			System.out.println("dime dígito unidades de millar: ");
			int millar = sc.nextInt();
			System.out.println("dime dígito unidades de centenas: ");
			int centenas = sc.nextInt();
			System.out.println("dime dígito unidades de decenas: ");
			int decenas = sc.nextInt();
			System.out.println("dime dígito unidades de unidades: ");
			int unidades = sc.nextInt();
			
			System.out.println("el numero es: "+ millar+centenas+decenas+unidades);
			System.out.print("y en romano:");
			
			switch(millar)
			{
			case 0:
				break;
				case 1: System.out.print("M");
					break;
				case 2: System.out.print("MM");
					break;
				case 3: System.out.print("MMM");
			}	
				
			
			switch (centenas)
			{
			
			
			case 1: System.out.print("C");
				break;
			case 2: System.out.print("CC");
				break;
			case 3: System.out.print("CCC");
				break;
			case 4: System.out.println("CD");
				break;
			case 5: System.out.println("D");
				break;
			case 6: System.out.println("DC");
				break;
			case 7: System.out.println("DCC");
				break;
			case 8: System.out.println("DCCC");
				break;
			case 9:System.out.println("CM");
				break;
			case 0:
			
			}
			switch (decenas)
			{
			case 0:
				break;
			case 1: System.out.print("X");
				break;
			case 2: System.out.print("XX");
				break;
			case 3: System.out.print("XXX");
				break;
			case 4: System.out.println("XL");
				break;
			case 5: System.out.println("L");
				break;
			case 6: System.out.println("LX");
				break;
			case 7: System.out.println("LXX");
				break;
			case 8: System.out.println("LXXX");
				break;
			case 9:System.out.println("XC");
				break;
			
			}
			
			switch (unidades)
			{
			case 1: System.out.print("I");
				break;
			case 2: System.out.print("II");
				break;
			case 3: System.out.print("III");
				break;
			case 4: System.out.println("IV");
				break;
			case 5: System.out.println("V");
				break;
			case 6: System.out.println("VI");
				break;
			case 7: System.out.println("VII");
				break;
			case 8: System.out.println("VIII");
				break;
			case 9:System.out.println("IX");
				break;
			case 0:
				break;
			
			}
			
			
		
		sc.close();
	
		
		
	}
	
}
