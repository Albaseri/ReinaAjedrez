package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Posicion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {

	}

	public static void mostrarMenu() {

		System.out.println("1.Crear reina por defecto.");
		System.out.println("2.Crear reina eligiendo el color.");
		System.out.println("3.Mover");
		System.out.println("4.Salir.");
	}

	public static int elegirOpcionMenu() {
		int op;
		do {
			System.out.print("Introduce una de las cuatro opciones del menú: ");
			op = Entrada.entero();
		} while (op < 1 || op > 4);

		return op;
	}

	public static Color elegirColor() {
		Color color = null;
		int opColor;
		do {
			System.out.println("Elige el color de la reina:");
			System.out.println("1.Blanco");
			System.out.println("2.Negro");
			opColor = Entrada.entero();
		} while (opColor < 1 || opColor > 2);

		switch (opColor) {
		case 1:
			System.out.println("Has elegido el color 'BLANCO'");
			color = color.BLANCO;
			break;
		case 2:
			System.out.println("Has elegido el color 'NEGRO'");
			color = color.NEGRO;
			break;
		}
		return color;
	}

	public static void mostrarMenuDirecciones() {
		System.out.println("Elige una dirección para mover: ");

		System.out.println("1.Pulsa para mover al NORTE");
		System.out.println("2.Pulsa para mover al NORESTE");
		System.out.println("3.Pulsa para mover al ESTE");
		System.out.println("4.Pulsa para mover al SURESTE");
		System.out.println("5.Pulsa para mover al SUR");
		System.out.println("6.Pulsa para mover al SUROESTE");
		System.out.println("7.Pulsa para mover al OESTE");
		System.out.println("8.Pulsa para mover al NOROESTE");
	}

	public static Direccion elegirDireccion() {
		Direccion direccion = null;
		int opD;
		do {
			opD = Entrada.entero();

		} while (opD < 1 || opD > 8);

		switch (opD) {
		case 1:
			System.out.println("Has elegido la dirección 'NORTE'");
			direccion = Direccion.NORTE;
			break;
		case 2:
			System.out.println("Has elegido la dirección 'NORESTE'");
			direccion = Direccion.NORESTE;
			break;
		case 3:
			System.out.println("Has elegido la dirección 'ESTE'");
			direccion = Direccion.ESTE;
			break;
		case 4:
			System.out.println("Has elegido la dirección 'SURESTE'");
			direccion = Direccion.SURESTE;
			break;

		case 5:
			System.out.println("Has elegido la dirección 'SUR'");
			direccion = Direccion.SUR;
			break;

		case 6:
			System.out.println("Has elegido la dirección 'SUROESTE'");
			direccion = Direccion.SUROESTE;
			break;

		case 7:
			System.out.println("Has elegido la dirección 'OESTE'");
			direccion = Direccion.OESTE;
			break;

		case 8:
			System.out.println("Has elegido la dirección 'NOROESTE'");
			direccion = Direccion.NOROESTE;
			break;

		}
		return direccion;
	}

	public static int elegirPasos() {
		int pasos;
		System.out.print("Elige los pasos que deseas dar:");
		pasos = Entrada.entero();
		return pasos;
	}

	public static void despedirse() {
		System.out.println("Buena jugada, ¡hasta la próxima!");
	}
}
