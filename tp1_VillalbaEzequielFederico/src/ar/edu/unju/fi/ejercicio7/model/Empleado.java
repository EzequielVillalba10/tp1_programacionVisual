package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {

	String nombre;
	private int legajo;
	private double salario;
	private final double salarioMinimo = 210000.00;
	private final double aumentoPorMeritos = 20000.00;
	public Empleado(String nombre, int legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		
		if (salario>=salarioMinimo)
		{
			this.salario = salario;
		}
		else
		{
			this.salario = salarioMinimo;
		}
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public void darAumento() {
		salario = salario + aumentoPorMeritos;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre del empleado: "+nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("Salario $: "+salario);
		
	}
	
	
}
