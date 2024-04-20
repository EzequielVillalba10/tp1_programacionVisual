package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;
import ar.edu.unju.fi.model.Chofer;

import java.util.Scanner;

public class Main {
	private static Scanner sc;
	private static ArrayList<Pais> paises;
	private static ArrayList<DestinoTuristico> destinos ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
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
			case 1:altaDestinoTuristico();break;
				
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

	/**
	 * precargar paises
	 */
	public static void precargarPaises(){
		if (paises == null)
		{
			paises = new ArrayList<>();
		}
		paises.add(new Pais("AAA111","Argentina"));
		paises.add(new Pais("BBB222","Brasil"));
		paises.add(new Pais("CCC333","Colombia"));
		paises.add(new Pais("DDD444","Dinamarca"));
		paises.add(new Pais("EEE555","Estados Unidos"));
		paises.add(new Pais("FFF666","Francia"));
		
	}
	
	
	public static void altaDestinoTuristico() {
		if (destinos == null)
		{
			destinos = new ArrayList<>();
		}
		System.out.println("Ingrese el codigo del destino turistico: ");
		String codigoDestino = sc.next();
		sc.nextLine();
		
		System.out.println("Ingrese el nombre del destino turistico: ");
		String nombreDestino = sc.next();
		
		System.out.println("Ingrese el precio del destino turistico: ");
		double precioDestino = sc.nextDouble();
		
		System.out.println("Ingrese la cantidad de dias: ");
		int dias = sc.nextInt();
		
		destinos.add(codigoDestino,nombreDestino,precioDestino,"acavapais",dias)
	}
}
