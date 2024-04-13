package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el valor de n: ");
		int n = scanner.nextInt(); 
		
		
		
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		calculadora.setN(n);
		System.out.println("////////////////////////////////////");
		System.out.println("La Sumatoria es: "+calculadora.calcularSumatoria());
		System.out.println("////////////////////////////////////");
		System.out.println("La productoria es: "+calculadora.calcularProductoria());
		
		scanner.close();
		
	}

}
