package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		for (int i=0; i <= 2; i++)
		{
			Pizza pizza = new Pizza();
			System.out.println("Ingrese el diametro de la pizza (20,30,40): ");
			int diametro = scanner.nextInt();
			if (diametro >= 20 && diametro <=40)
			{
			pizza.setDiametro(diametro);
			
			System.out.println("La pizza lleva ingredientes especiales? (s/n)");
			System.out.println("Si la opcion es SI inrese el caracter 's' de lo contrario ingree cualquier otra tecla");
			String opcion = scanner.next();
			if (opcion == "s")
			{
				pizza.IngredientesEspeciales(true);
			}
			else
			{
				pizza.IngredientesEspeciales(false);
			}
			
			
			pizza.calcularPrecio();
			pizza.calcularArea();
			
			pizza.mostrarDatos();
			}
			else
			{
				System.out.println("ERROR EL DIAMETRO NO ES VALIDO");
			}
	}
		scanner.close();

}
}
