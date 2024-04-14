package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private double precio;
	private double area;
	private boolean ingredientesEspeciales;
	private final double adicionalIngredientesEspeciales_20 = 500;
	private final double adicionalIngredientesEspeciales_30 = 750;
	private final double adicionalIngredientesEspeciales_40 = 1000;
	
	
	public Pizza() {
	this.diametro = 0;
	this.precio= 0;
	this.area=0;
	this.ingredientesEspeciales = false;
	}


	public double getDiametro() {
		return diametro;
	}


	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}


	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}


	public double getAdicionalIngredientesEspeciales_20() {
		return adicionalIngredientesEspeciales_20;
	}


	public double getAdicionalIngredientesEspeciales_30() {
		return adicionalIngredientesEspeciales_30;
	}


	public double getAdicionalIngredientesEspeciales_40() {
		return adicionalIngredientesEspeciales_40;
	}
	
	
	
	public void calcularPrecio()
	{
		switch (diametro) 
		{
		case 20:
			if (ingredientesEspeciales)
			{
				precio = 4500 + adicionalIngredientesEspeciales_20;
			}
			else
			{
				precio = 4500;
			}
			break;
		case 30:
			if (ingredientesEspeciales)
			{
				precio = 4800 + adicionalIngredientesEspeciales_30;
			}
			else
			{
				precio = 4800;
			}
			break;
		case 40:
			if (ingredientesEspeciales)
			{
				precio = 5500 + adicionalIngredientesEspeciales_40;

			}
			else
			{
				precio = 5500;
			}
			break;
			default:
				System.out.println("El diametro ingresado no es valido...");
				break;
		}
	}
	
	public void calcularArea()
	{
		area = Math.PI * Math.pow(diametro/2.0, 2);
	}



	
}
