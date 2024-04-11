package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero que se encuentre en el rango [0-10]: ");
		int i, acumulador=1, aux;
		int numero = scanner.nextInt();
		aux=numero;
		if (numero >= 0 && numero <= 10)
		{
			
			for (i=1; i<=numero; i++)
			{
				
				acumulador =  acumulador * aux;
				aux--;
			}
			System.out.println("El factorial es: "+acumulador);
		}
		else
		{
			System.out.println("Error, el numero ingresado no se encuentra del rango especificado...");
		}
		

	}

}
