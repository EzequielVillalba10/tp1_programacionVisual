package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);	
		int numero=1;
		int suma=0;
		while (numero < 3 || numero >10)
		{
		System.out.println("Ingrese numero en el rango comprendido [3,10]");
		numero=scanner.nextInt();
		if (numero <3 || numero > 10)
		{
			System.out.println("ERROR!!! El numero ingresado se encuentra fuera del rango solicitado!!!");
		}
		
		} // finalizacion del bucle	
		
		int [] array = new int[numero];
		for (int i=0; i<array.length;i++)
		{
			System.out.println("Ingrese un valor: ");
			array[i] = scanner.nextInt();
			System.out.println("Valor cargado!!!");
			suma+= array[i];
		}
		
		for (int j=0; j<array.length; j++)
		{
			System.out.println("Posicion: ["+j+"]  ||  Valor: "+array[j]);
			
		}
		System.out.println("La suma de todos los valores es: "+suma);
		scanner.close();
	}
}
