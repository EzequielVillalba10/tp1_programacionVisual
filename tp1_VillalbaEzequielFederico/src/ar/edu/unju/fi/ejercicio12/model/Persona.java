package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNacimiento;
	
	
	
	
	
	

	public Persona(String nombre, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public int calcularLaEdad()
	{
		Calendar hoy = Calendar.getInstance(); // obtener la fecha de hoy
		int edad = hoy.get((Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR)); // Obtener el año de ambas fechas
		if (hoy.get(Calendar.DAY_OF_YEAR)<fechaNacimiento.get(Calendar.DAY_OF_YEAR)) // Condicion para verificar si la persona no ha pasado su cumpleaños en el año actual
		{
			edad--; // si cumple la condicion de arriba significa que no ha pasado su cumpleaños en el año por ende se le resta 1 año
		}
		return edad;
		
	}
	
	public String obtenerSigno() {
		int mes = fechaNacimiento.get(Calendar.MONTH) + 1 ; 
		int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		
		String signo="nada";
		
		if ((mes == 3 && dia>= 21) || (mes == 4 && dia <= 19))
		{
			signo = "Aries";
		}
		if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20 ))
		{
			signo = "Tauro";
		}
		if ((mes ==5 && dia >= 21) || (mes == 6 && dia <= 20))
		{
			signo ="Geminis";
		}
		if ((mes ==6 && dia >= 21) || (mes == 7 && dia <= 22))
		{
			signo ="Cancer";
		}
		if ((mes ==7 && dia >= 23) || (mes == 8 && dia <= 22))
		{
			signo ="Leo";
		}
		if ((mes ==8 && dia >= 23) || (mes == 9 && dia <= 22))
		{
			signo ="Virgo";
		}
		if ((mes ==9 && dia >= 23) || (mes == 10 && dia <= 22))
		{
			signo ="Libra";
		}
		if ((mes ==10 && dia >= 23) || (mes == 11 && dia <= 21))
		{
			signo ="Escorpio";
		}
		if ((mes ==11 && dia >= 22) || (mes == 12 && dia <= 21))
		{
			signo ="Sagitario";
		}
		if ((mes ==12 && dia >= 22) || (mes == 1 && dia <= 19))
		{
			signo ="Capricornio";
		}
		if ((mes ==1 && dia >= 20) || (mes == 2 && dia <= 18))
		{
			signo ="Acuario";
		}
		if ((mes ==2 && dia >= 19) || (mes == 3 && dia <= 20))
		{
			signo ="Piscis";
		}
		return signo;
	}
	
	public String obtenerEstacion() {
        int mes = fechaNacimiento.get(Calendar.MONTH);
        String estacion = "nada";

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes inválido";
                break;
        }

        return estacion;
    }
	
	
	
}
