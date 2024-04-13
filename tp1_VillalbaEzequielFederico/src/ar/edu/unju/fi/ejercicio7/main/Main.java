package ar.edu.unju.fi.ejercicio7.main;


import ar.edu.unju.fi.ejercicio7.model.Empleado;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese el legajo: ");
		int legajo = scanner.nextInt();
		
		System.out.println("Ingrese el salario del empleado: ");
		double salario = scanner.nextDouble();
		
		
		
		// creacion del objeto
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		
		System.out.println("/////////////////Datos del empleado////////////////// ");
		empleado.mostrarDatos();
		
		// aumento del empleado
		empleado.darAumento();
		
		
		// mostrar los datos despues del aumento
		System.out.println("/////////////////Datos finales/////////////////");
		empleado.mostrarDatos();
		scanner.close();
		
		
		
	}

}
