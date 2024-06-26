package ar.edu.unju.fi.ejercicio17.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	
	private static Scanner sc;
	private static List<Jugador> jugadores; // lista creacion
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc = new Scanner(System.in); // creacion de objeto scanner
		int opcion=0;
		
		do {
			System.out.println("==================================");
			System.out.println("1 - Alta de Jugador");
			System.out.println("2 - Mostrar los datos del jugador ");
			System.out.println("3 - Mostrar todos los jugadores ordenado por apellido");
			System.out.println("4 - Modificar los datos del jugador");
			System.out.println("5 - Eliminar un jugador");
			System.out.println("6 - Mostrar la cantidad de jugadores que tiene la arrayList");
			System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una Nacionalidad");
			System.out.println("8 - Salir");
			System.out.println("==================================");
			System.out.println("Ingrese una opcion: ");
			opcion = sc.nextInt();
			sc.nextLine(); // Borra el baffer del scanner
			
			switch (opcion)
			{
			case 1: precargarJugador();break;
			
			case 2: mostrarJugadores();break;
			
			case 3:mostrarJugadoresPorApellido();break;
				
			case 4:modificarJugador();break;
				
			case 5:eliminarJugador();break;
				
			case 6:mostrarCantidad();break;
				
			case 7:cantidadNacionalidad();break;
				
			case 8: System.out.println("Saliendo del programa");
				break;
				default: System.out.println("OPCION INCORERECTA!!!!");
				
			}
			}while(opcion!=8);
		
	}
	
	/**
	 * Aca se dara de alta ingresando los datos del jugador para cargar en el arraylist
	 */
	public static void precargarJugador() {
		int opcion1=0;
		String posicion="ninguna";
		if (jugadores == null)
		{
			jugadores = new ArrayList<>();
		}
		System.out.println("Ingrese nombre de jugador: ");
		String nombre = sc.next();
		System.out.println("Ingrese apellido de jugador: ");
		String apellido = sc.next();
		System.out.println("Ingrese Nacionalidad de jugador: ");
		String nacionalidad = sc.next();
		System.out.println("Ingrese estatura del jugador: ");
		double estatura = sc.nextDouble();
		System.out.println("Ingrese peso del jugador: ");
		double peso = sc.nextDouble();
		System.out.println("Ingrese posicion: ");
		do {
			System.out.println("----------------------");
			System.out.println("1)Delantero");
			System.out.println("2)Defensa");
			System.out.println("3)Medio");
			System.out.println("4)Arquero");
			System.out.println("-----------------------");
			opcion1 = sc.nextInt();
			if (opcion1 <1 || opcion1 >4)
			{
			System.out.println("ERROR, INGRESE UNA OPCION VALIDA!!!");	
			}
		}while(opcion1<1 || opcion1>4);
		
		switch (opcion1) {
		case 1: posicion = "Delantero";break;
		
		case 2: posicion = "Defensa"; break;
		
		case 3: posicion = "Medio"; break;
		
		case 4: posicion = "Arquero"; break;
		}
		jugadores.add(new Jugador(nombre,apellido,nacionalidad,estatura,peso,posicion));
	}
	
	/**
	 * Etructura para mostrar los datos de los jugadores en el arrayList
	 */
	
	
	public static void mostrarJugadores() {
		
		System.out.println("Ingrese el apellido del jugador a buscar: ");
		String apellido = sc.next();
		System.out.println("Ingrese el nombre del jugador a buscar: ");
		String nombre = sc.next();
		
		Iterator <Jugador> iterator = jugadores.iterator();
		if (jugadores.size()!=0)
		{
			while(iterator.hasNext())
			{
				Jugador jugador = iterator.next();
				
				if (jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre))
				{
					mostrarDatosJugador(jugador);
				}
			}
		}
		else
		{
			System.out.println("LA LISTA ESTA VACIA");
		}
		
		
	}
	
	/**
	 * va a motrar los datos del jugador pasado por parametro
	 * @param jugadores
	 */
	public static void mostrarDatosJugador(Jugador jugadores) {
		System.out.println("===========DATOS DEL JUGADOR=================");
		System.out.println("Nombre del jugador: "+jugadores.getApellido());
		System.out.println("Apellido del jugador: "+jugadores.getNombre());
		System.out.println("Nacionalidad: "+jugadores.getNacionalidad());
		System.out.println("Estatura: "+jugadores.getEstatura()+"cm.");
		System.out.println("Peso: "+jugadores.getPeso()+" kg.");
		System.out.println("Posicion: "+jugadores.getPosicion());
		System.out.println("=============================================");
	}

	/**
	 * mostrara los jugadores ordenados por apellido
	 * 
	 */
	public static void mostrarJugadoresPorApellido(){
		
		jugadores.sort(Comparator.comparing(Jugador::getApellido));
		jugadores.forEach(jug->System.out.println(jug.toString()));
		
	}
	
	/**
	 * Pedira datos para modificar el jugador
	 */
	public static void modificarJugador()
	{
		System.out.println("---------------Modificar el jugador------------------");
		System.out.println("Ingrese Apellido del jugador: ");
		String apellido = sc.next();
		System.out.println("Ingrese Nombre del jugador:");
		String nombre = sc.next();
		Iterator <Jugador> iterator = jugadores.iterator();
		if (!jugadores.isEmpty())
		{
			while(iterator.hasNext())
			{
				Jugador jugador = iterator.next();
				
				if (jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre))
				{
					editarJugador(jugador);
				}
			}
		}
	}
	/**
	 * Procedimiento en la que se muestra una lista
	 * para elegir una opcion en la cual
	 * el usuario indique que dato quiere modificar
	 * del jugador
	 * @param jugadores
	 */
	public static void editarJugador(Jugador jugadores) {
		int opcion=0, opcion2=0;
		String posicion="NINGUNA";
		do {
			System.out.println("1)Editar Nacionalidad: ");
			System.out.println("2)Editar Estatura");
			System.out.println("3)Editar Editar Peso");
			System.out.println("4) Editar posicion");
			System.out.println("5)Salir");
			opcion=sc.nextInt();
			
			switch (opcion)
			{
			case 1: System.out.println("Ingrese nueva nacionalidad: ");
			String nacionalidad=sc.next();
			jugadores.setNacionalidad(nacionalidad);
			break;
			case 2: System.out.println("Ingrese nueva estatura: ");
			double estatura = sc.nextDouble();
			jugadores.setEstatura(estatura);
			break;
			case 3: System.out.println("Ingrese nuevo peso: ");
			double peso = sc.nextDouble();
			jugadores.setPeso(peso);
			case 4: System.out.println("Ingrese nueva posicion");
			System.out.println("1)Delantero");
			System.out.println("2)Medio");
			System.out.println("3)Defensor");
			System.out.println("4)Arquero");
			opcion2 = sc.nextInt();
			if (opcion2 == 1)
			{
				 posicion = "Delantero";
			}
			if (opcion2 == 2)
			{
				 posicion = "Medio";
			}
			if (opcion2 == 3)
			{
				 posicion = "Defensor";
			}
			if (opcion2 == 4)
			{
				 posicion = "Arquero";
			}
			jugadores.setPosicion(posicion);
			
			break;
			
			
			}// cierre del switch
		}while(opcion!=5); // cierre del bucle 
	
		


}
	
	
	/**
	 * Elimina un objeto Jugador
	 * de la lista jugadores
	 */
	public static void eliminarJugador() {
		
		System.out.println("Ingrese apellido del jugador: ");
		String apellido = sc.next();
		System.out.println("Ingrese nombre del jugador: ");
		String nombre = sc.next();
		Iterator<Jugador> iterator = jugadores.iterator(); 
		if(!jugadores.isEmpty())
		{
		while (iterator.hasNext()) {
			Jugador jugadores = iterator.next();  
			if (jugadores.getApellido().equals(apellido) && jugadores.getNombre().equals(nombre))
			{
				iterator.remove(); // 
				System.out.println("Se elimino el jugador: "+apellido+ " "+nombre);
			}
		}
		}
		else
		{
			System.out.println("Lista de jugadores vacia!!!");
		}
	}
	
	/**
	 * Mostrar la cantidad de jugadores que tiene la arraylist
	 */
	
	public static void mostrarCantidad() {
		if (!jugadores.isEmpty())
		{
		System.out.println("Cantidad de elementos: "+jugadores.size());
		}
		else
		{
			System.out.println("No hay ningun jugador registrado en la lista");
		}
	}
	
	public static void cantidadNacionalidad() {
		int acumulador=0;
		System.out.println("Ingrese nacionalidad: ");
		String nacionalidad = sc.next();
		Iterator<Jugador> iterator = jugadores.iterator(); 
		if(!jugadores.isEmpty())
		{
		while (iterator.hasNext()) {
			Jugador jugadores = iterator.next();  
			if (jugadores.getNacionalidad().equals(nacionalidad))
			{
				acumulador=acumulador+1;
			}
		}
		System.out.println("La cantidad de jugadores con esa Nacionalidad es de: "+acumulador);
		}
		
	}
	}