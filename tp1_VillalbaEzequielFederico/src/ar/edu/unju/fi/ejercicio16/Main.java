package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] array = new String [5];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Ingrese nombre: ");
			array[i] = scanner.next();
		}
	}

}
