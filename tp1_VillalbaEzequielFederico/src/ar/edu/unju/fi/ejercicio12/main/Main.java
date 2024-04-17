package ar.edu.unju.fi.ejercicio12.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Persona persona = new Persona();
		System.out.println("Ingrese nombre de la persona: ");
		String nombre = scanner.next();
		
		System.out.println("INgrese su fecha de nacimiento (dd/mm/yyyy)");
		String fechaDeNacimientoString = scanner.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar fechaNacimiento = Calendar.getInstance();
		
		
		try {
			fechaNacimiento.setTime(sdf.parse(fechaDeNacimientoString));
		} catch (ParseException e) {
			System.out.println("Formato de fecha incorrecto.");
		}
		
		persona.getNombre();
		persona.getFechaDeNacimiento();
		
		
		scanner.close();
		
		
		
		
		
		
	}

}
