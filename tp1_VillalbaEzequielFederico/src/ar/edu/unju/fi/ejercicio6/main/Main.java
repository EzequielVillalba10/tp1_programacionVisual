package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.model.Persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RegistrarPersona();
		
	}
	
	public static void RegistrarPersona()
	{
		int numPersonas=0;
		Scanner scanner = new Scanner(System.in);
		while (numPersonas <= 2)
		{
		
		Persona persona1 = new Persona();
		System.out.println("Ingrese DNI: ");
		int dni = scanner.nextInt();
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.next();
		System.out.println("Fecha de Nacimiento");
		System.out.println("Ingrese dia");
		int dia = scanner.nextInt();
		System.out.println("Ingrese mes");
		int mes = scanner.nextInt();
		System.out.println("INgrese año");
		int anio = scanner.nextInt();
		
		
		
		Persona persona = new Persona(dni,nombre,anio,"jujuy");
		
		numPersonas++;
		persona.mostrarDatos(dni, nombre);
		//persona.mostrarDatos(persona.getDni(), persona.getNombre(), persona.getFechaDeNacimiento());
		
	
		}
		scanner.close();
		
		
		
		
		}
	
	
	

}
