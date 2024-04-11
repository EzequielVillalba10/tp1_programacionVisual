package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,acumulador;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ingrese un valor numerico entre el rango [1,9]: ");
		byte num = scanner.nextByte();
		if (num>=1 && num <= 9)
		{
			for (i=0; i<=num+1; i++)
			{
				acumulador=num*i;
				System.out.println(num + " x "+i+" = "+acumulador);
			}
		}
		else
		{
			System.out.println("Error, el valor ingresado se encuentra fuera del rango...");
		}
	}

}
