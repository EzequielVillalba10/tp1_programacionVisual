package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int [8];
		int valor;
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<array.length;i++)
		{
			System.out.println("Ingrese valor: ");
			valor = scanner.nextInt();
			array[i] = valor;
		}
		
		for (int i=0; i<array.length;i++)
		{
			System.out.println("Posicion "+i+"|| Valor: "+array[i]);
			
		}
		scanner.close();
	}

}
