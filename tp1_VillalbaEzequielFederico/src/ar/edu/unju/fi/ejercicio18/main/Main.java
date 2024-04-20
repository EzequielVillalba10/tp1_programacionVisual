package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

import java.util.Scanner;

public class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Pais> paises = new ArrayList<>();
		ArrayList<DestinoTuristico> destinos = new ArrayList<>();
		sc = new Scanner(System.in);
		
		int opcion=0;
		do {
			System.out.println("=========================");
			System.out.println("1) Alta de destino turistico");
			System.out.println("2) Mostrar todos los destinos turisticos");
			System.out.println("3) Modificar el pais de un destino turistico");
			System.out.println("4) Limpiar el ArrayList de destino turisticos");
			System.out.println("5) Eliminar un destino turistico");
			System.out.println("7) Mostrar todos los paises");
			System.out.println("8) Mostrar los destinos turisticos que pertenecen a un pais");
			System.out.println("9) SALIR");
			System.out.println("=======================================");
			System.out.println("Ingrese una opcion: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				
			case 2:
				
			case 3:
				
			case 4:
			
			case 5:
				
			case 6:
				
			case 7: 
				
			case 8:
				
			case 9:
				
			default:
				
				
			}
			
			
			
			
			
		}while(opcion!=9);
	}

}
