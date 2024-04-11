package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {

	private int dni;
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String provincia;
	
	
	public Persona(int dni, String nombre, LocalDate fechaDeNacimiento, String provincia) {
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


	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
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
		LocalDate ahora = LocalDate.now();
		return ahora.getYear() - fechaDeNacimiento.getYear();
		
	}
	
	public boolean esMayorDeEdad()
	{
		return calcularLaEdad()>=18;
	}
	
	public void mostrarDatos() 
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
