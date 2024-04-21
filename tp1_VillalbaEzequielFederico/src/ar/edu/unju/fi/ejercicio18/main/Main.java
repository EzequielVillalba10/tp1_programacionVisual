package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

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
		precargarPaises();
		destinos = new ArrayList<>();
		do {
			System.out.println("=========================");
			System.out.println("1) Alta de destino turistico");
			System.out.println("2) Mostrar todos los destinos turisticos");
			System.out.println("3) Modificar el pais de un destino turistico");
			System.out.println("4) Limpiar el ArrayList de destino turisticos");
			System.out.println("5) Eliminar un destino turistico");
			System.out.println("6) Mostrar todos los destinos ordenados por nombre");
			System.out.println("7) Mostrar todos los paises");
			System.out.println("8) Mostrar los destinos turisticos que pertenecen a un pais (segun ingrese el usuario)");
			System.out.println("9)SALIR");
			System.out.println("=======================================");
			System.out.println("Ingrese una opcion: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:altaDestinoTuristico();break;
				
			case 2:mostrarDestinosTuristicos();break;
				
			case 3:modificarPaisDeDestino();break;
				
			case 4:destinos.clear();break;
			
			case 5:eliminarDestinoTuristico();break;
				
			case 6:mostratDestinosPorNombre();break;
				
			case 7: mostrarPaises();break;
				
			case 8:mostrarDestinos();break;
				
			case 9:System.out.println("SALIENDO DEL PROGRAMA");break;
				
			default:
				System.out.println("opcion incorrecta....");
				
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
		
		System.out.println("Ingrese el codigo del destino turistico: ");
		destinoTuristico.setCodigo(sc.next());
		
		System.out.println("Ingrese el nombre del destino turistico: ");
		destinoTuristico.setNombre(sc.next());
		
		System.out.println("Ingrese el precio del destino turistico: ");
		destinoTuristico.setPrecio(sc.nextDouble());
		
		System.out.println("Ingrese la cantidad de dias: ");
		destinoTuristico.setCantidadDias(sc.nextInt());
		
		System.out.println("Ingrese codigo de Pais: "); // necesitamos un objeto, para eso necesitamos el codigo del chofer para buscar en el arraylist para obtener el objeto!!!
		String codigoPais = sc.next();
		Pais pais = buscarPais(codigoPais);
		if(pais == null)
		{
			System.out.println("El pais no existe");
		}
		else
		{
			destinoTuristico.setPais(pais);
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
	
	
	public static void mostrarDestinosTuristicos()
	{
		System.out.println("-------------Lita de destinos-----------");
		destinos.forEach(d->System.out.println(d));
	}
	
	
	public static void modificarPaisDeDestino()
	{
		System.out.println("=========MODIFICAR PAIS DE DESTINO============");
		System.out.println("Ingrese codigo del Destino Turistico: ");
		String codigo = sc.next();
		
		for(DestinoTuristico destino: destinos)
		{
			if(destino.getCodigo().equals(codigo))
			{
				System.out.println("Ingrese nuevo nombre de pais para el destino turistico: ");
				String nombreNuevo = sc.next();
				DestinoTuristico destinoturistico = buscarDestino(nombreNuevo);
				destino.setNombre(nombreNuevo);
				System.out.println("Se modifico el nombre del destino");
			}
		}
	}
	
	public static DestinoTuristico buscarDestino(String codigo) {
		DestinoTuristico destinoEncontrado = null;
		for (DestinoTuristico destino: destinos) {
			if (destino.getNombre()==codigo)
			{
				destinoEncontrado=destino;
				break;
			}
		}
		return destinoEncontrado;
	}
	
	public static void eliminarDestinoTuristico()
	{
		System.out.println("Ingrese codigo de destino Turistico: ");
		String codigo = sc.next();
		Iterator<DestinoTuristico> iterator = destinos.iterator(); //paquete java.util
		if(!destinos.isEmpty())
		{
		while (iterator.hasNext()) {
			DestinoTuristico destino = iterator.next(); //devuelve el objeto taxi que esta en la lista, el primero que encuentre
			if (destino.getCodigo().equals(codigo))
			{
				iterator.remove(); // elimina el elementoooooooo
				System.out.println("Se el destino con el codigo: "+codigo);
			}
		}
		}
		else
		{
			System.out.println("Lista de destinos vacias!!!");
		}
	}

	
	
	public static void mostratDestinosPorNombre()
	{
		destinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
		destinos.forEach(nom->System.out.println(nom.toString()));
	}
	
	public static void mostrarPaises() {
		System.out.println("-------------Lista de PAISES-----------");
		paises.forEach(p->System.out.println(p));
	}
	
	public static void mostrarDestinos()
	{
		DestinoTuristico destinoEncontrado = null;
		System.out.println("Ingrese el codigo Pais: ");
		String codigo = sc.next();
		for (DestinoTuristico destino: destinos) {
			if (destino.getPais().getCodigo()==codigo)
			{
				destinoEncontrado = destino;	
				mostrarDestino(destino);
			}
		}
		
	}
	
	public static void mostrarDestino(DestinoTuristico destino)
	{
		System.out.println("DestinoTuristico [codigo=" + destino.getCodigo() + ", nombre=" + destino.getNombre() + ", precio=" + destino.getPrecio() + ", pais=" + destino.getPais()
				+ ", cantidadDias=" + destino.getCantidadDias() + "]");
	}
}
