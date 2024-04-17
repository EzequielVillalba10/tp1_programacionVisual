package ar.edu.unju.fi.ejercicio12.main;
import ar.edu.unju.fi.ejercicio12.model.Persona;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Date;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese nombre de la persona: ");
		String nombre = scanner.next();
	
		System.out.println("INGRESE FECHA DE NACIMIENTO");
		System.out.println("Ingrese dia: ");
		int dia = scanner.nextInt();
		System.out.println("Ingrese mes: ");
		int mes = scanner.nextInt() -1 ;
		System.out.println("Ingrese año: ");
		int año = scanner.nextInt();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendar = new GregorianCalendar();
		
		calendar.set(año, mes-1, dia);
		Date fechaNacimiento = calendar.getTime();
		String fecha = sdf.format(fechaNacimiento);
		Persona persona = new Persona(nombre,calendar);
		
		// MOSTRANDO LOS DATOS
		System.out.println("Nombre: "+persona.getNombre());
		System.out.println("Fecha de Nacimiento: "+fecha);
		System.out.println("Edad: "+persona.calcularLaEdad()+" años");
		//System.out.println("Signo del zodiaco: "+persona.obtenerSigno());
		//System.out.println("Estacion: "+persona.obtenerEstacion());
		
		scanner.close();
	
	}

}
