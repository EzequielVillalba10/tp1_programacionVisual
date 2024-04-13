package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.util.Date;

public class Persona {

	private int dni;
	private String nombre;
	private int fechaDeNacimiento;
	private String provincia;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(int dni, String nombre, int fechaDeNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = provincia;	
	}
	


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(int fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	// metodo para mostrar la edad de la perosna
	

	public int calcularLaEdad() {
		int ahora = 24;
		int esMayorDeEdad = ahora - fechaDeNacimiento;
		return esMayorDeEdad;
	}
	
	public boolean esMayorDeEdad()
	{
		return calcularLaEdad()>=18;
	}
	
	public void mostrarDatos(int dni, String nombre) 
	{
		System.out.println("DNI: "+ dni);
		System.out.println("Nombre: "+nombre);
		System.out.println("Fecha de nacimiento: "+fechaDeNacimiento);
		System.out.println("Provincia: "+provincia);
		if (esMayorDeEdad())
		{
			System.out.println("La persona es mayor de edad");
		}
		else
		{
			System.out.println("La persona es menor de edad");
		}
	}
	
}
