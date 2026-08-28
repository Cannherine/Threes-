package primerTP;

public class Ficha {
//	IREP: 	el 1 no se puede sumar con si mismo
//			el 2 no se puede sumar con si mismo
	private int numero;
	private int fila;
	private int columna;
	private String color;
	
	public Ficha(int numero, int fila, int columna, String color) {
		this.numero = numero;
		this.fila = fila;
		this.columna = columna;
	}
	
	public void actualizarNumero(int suma) {
		this.numero = suma;
	}
	
	public void actualizarColor(String color) {
		this.color = color;
	}
	
	
	// GETTERS & SETTERS
	
	protected int getNumero() {
		return numero;
	}

	protected void setNumero(int numero) {
		this.numero = numero;
	}

	protected int getFila() {
		return fila;
	}

	protected void setFila(int fila) {
		this.fila = fila;
	}

	protected int getColumna() {
		return columna;
	}

	protected void setColumna(int columna) {
		this.columna = columna;
	}

	protected String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}
	
	
}
