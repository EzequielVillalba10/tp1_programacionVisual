package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;


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
		DestinoTuristico destinoTuristico = new DestinoTuristico();
		if (destinos == null)
		{
			destinos = new ArrayList<>();
		}
		System.out.println("Ingrese el codigo del destino turistico: ");
		destinoTuristico.setCantidadDias(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Ingrese el nombre del destino turistico: ");
		destinoTuristico.setNombre(sc.next());
		
		System.out.println("Ingrese el precio del destino turistico: ");
		destinoTuristico.setPrecio(sc.nextDouble());
		
		System.out.println("Ingrese la cantidad de dias: ");
		destinoTuristico.setCantidadDias(sc.nextInt());
		
		System.out.println("Ingrese codigo de Pais: "); // necesitamos un objeto, para eso necesitamos el codigo del chofer para buscar en el arraylist para obtener el objeto!!!
		String codigoPais = sc.next();
		Pais paises = buscarPais(codigoPais);
		if(paises == null)
		{
			System.out.println("El pais no existe");
		}
		else
		{
			destinoTuristico.setPais(paises);
			destinos.add(destinoTuristico);
			System.out.println("Se agrego el objeto pais....");
		}
	}
	
	
	public static Pais buscarPais(String codigoPais) {
		Pais paisEncontrado = null;
		for (Pais pais: paises) {
			if (pais.getCodigo()==codigoPais)
			{
				paisEncontrado=pais;
				break;
			}
		}
		return paisEncontrado;
	}
	
}
