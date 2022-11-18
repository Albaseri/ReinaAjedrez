package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {

	private static Reina reina;

	public static void main(String[] args) {

		int aux;
		do {
			Consola.mostrarMenu();
			aux = Consola.elegirOpcionMenu();
			ejecutarOpcion(aux);
		} while (aux != 4);

	}

	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			crearReinaDefecto();
			mostrarReina();
			break;
		case 2:
			crearReinaColor();
			mostrarReina();

			break;
		case 3:
			if (reina == null) {
				System.out.println("Primero debes crear reina.");

			} else {
				mover();
				mostrarReina();
			}

			break;
		case 4:
			Consola.despedirse();
			break;
		}

	}

	private static void crearReinaDefecto() {
		reina = new Reina();
	}

	private static void crearReinaColor() {
		reina = new Reina(Consola.elegirColor());
	}

	private static void mover() {

		try {
			Consola.mostrarMenuDirecciones();

			reina.mover(Consola.elegirDireccion(), Consola.elegirPasos());
		} catch (IllegalArgumentException | OperationNotSupportedException | NullPointerException e) {
			System.out.println(e.getMessage());

		}

	}

	private static void mostrarReina() {
		System.out.println(reina);

	}
}
