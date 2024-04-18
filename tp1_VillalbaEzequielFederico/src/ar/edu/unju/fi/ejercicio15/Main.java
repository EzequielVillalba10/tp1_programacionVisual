package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=1;
		Scanner scanner = new Scanner(System.in);
		while (numero < 5 || numero >10)
		{
		System.out.println("Ingrese numero en el rango comprendido [5,10]");
		numero=scanner.nextInt();
		if (numero <5 || numero > 10)
		{
			System.out.println("ERROR!!! El numero ingresado se encuentra fuera del rango solicitado!!!");
		}
		
		} // finalizacion del bucle	
		
		String [] array = new String [numero];
		
		for(int i=0; i<array.length;i++) // INGRESO DE NOMBRES DE MANERA ITERATIVA
		{
			System.out.println("Ingrese nombre: ");
			array[i] = scanner.next();
		}
		for(int j=0; j<array.length;j++) // MOSTRAR DATOS
		{
			System.out.println("Posicion: ["+j+"]  ||  Valor: "+array[j]);
		}
		System.out.println("//////////////////////////");
		System.out.println("MOSTRAR A LA INVERSA");
		for(int k=array.length-1; k>=0;k--) // MOSTRAR DATOS
		{
			
			System.out.println("Valor: "+array[k]);
			
		}
		System.out.println("///////////////////////");
		scanner.close();
	}

}
