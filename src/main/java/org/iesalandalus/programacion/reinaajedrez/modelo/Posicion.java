package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {

	private static int MIN_F = 1;
	private static int MAX_F = 8;
	private static char MIN_C = 'a';
	private static char MAX_C = 'h';
	private int fila;
	private char columna;

//getters and setters
	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		if (fila < MIN_F) {
			throw new IllegalArgumentException("La posición introducida es menor que el mínimo permitido");
		} else if (fila > MAX_F) {

			throw new IllegalArgumentException("La posición introducida es mayor que el mínimo permitido");
		}
		this.fila = fila;

	}

	public char getColumna() {
		return columna;
	}

//los métodos sets mandan las escepcionez
	private void setColumna(char columna) {
		if (columna < MIN_C) {
			throw new IllegalArgumentException("La posición introducida es menor que el mínimo permitido");
		} else if (columna > MAX_C) {

			throw new IllegalArgumentException("La posición introducida es mayor que el mínimo permitido");
		}
		this.columna = columna;
	}

//llamo a los métodos set de cada atributo
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);

	}

	public Posicion(Posicion posicion) {

	}

}
