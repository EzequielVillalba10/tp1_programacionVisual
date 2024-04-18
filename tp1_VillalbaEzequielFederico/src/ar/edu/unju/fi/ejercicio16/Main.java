package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] array = new String [5];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Ingrese nombre: ");
			array[i] = scanner.next();
		}
		
		int j=0;
		while(j<array.length)
		{
			System.out.println("Posicion: ["+j+"]  ||  Valor: "+array[j]);
			j++;
		}
		System.out.println("El tamaño del array es: "+array.length);
		
		byte indice;
		do
		{
			System.out.println("Ingrese indice para eliminar un alemento: ");
			indice = scanner.nextByte();
			
			}while(indice<0 || indice >array.length);
		for(int k=indice; k<array.length-1;k++)
		{
			array[k] = array[k+1];
		}
		array[array.length-1] = null;
		System.out.println("////////////////////////////////////");
		System.out.println("ARREGLO DESPUES DEL ELEMENTO ELIMINADO");
		for (int l=0; l<array.length; l++)
		{
			System.out.println("Posicion: ["+l+"]  ||  Valor: "+array[l]);
			
		}
		
	}

}
