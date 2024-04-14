package ar.edu.unju.fi.ejercicio9.main;


import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		for (int i= 0; i <= 2; i++)
		{

			Producto productos = new Producto();
			System.out.println("DATOS DEL PRODUCTO");
			System.out.println("Nombre: ");
			String nombre = scanner.next();
			System.out.println("Codigo: ");
			int codigo = scanner.nextInt();
			System.out.println("Precio:");
			double precio = scanner.nextDouble();
			System.out.println("Ingrese el descuento del producto (RANGO 0 -50) (%): ");
			int descuento = scanner.nextInt();
			
			// enviar valores
			
			productos.setNombre(nombre);
			productos.setCodigo(codigo);
			productos.setPrecio(precio);
			productos.setDescuento(descuento);
			
			//Mostrar los datos ingresados
			
			System.out.println("Producto "+i +":" );
			System.out.println("Nombre: "+ productos.getNombre());
			System.out.println("Codigo: "+productos.getClass());
			System.out.println("Precio: $"+productos.getPrecio());
			System.out.println("El descuento del producto es: %"+productos.getDescuento());
			System.out.println("Precio final del producto: $"+productos.calcularDescuento());

			
			
			
		}
		
		
		scanner.close();
	}

}
