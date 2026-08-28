package primerTP;

import java.util.Random;

public class Juego {
	private int puntajeActual;
	private int mejorPuntaje;
	boolean existeCombinacion;
	private int siguienteFicha;
	private int[][] grilla = new int[4][4];
	
	public Juego() {
		
	}
	
	private void generarSiguienteFicha() {
		Random random = new Random();
		int ficha = random.nextInt(3) + 1;
		this.siguienteFicha = ficha;
	}
	
	private void posicionarSiguienteFicha() {
		
	}
	
	private void posicionarSiguienteFicha(String direccion){
		
	}
	
	public void actualizarPuntaje(int nuevo) {
		this.puntajeActual = nuevo;
	}

	public void actualizarMejorPuntaje(int nuevo) {
		this.mejorPuntaje = nuevo;
	}
	
	public boolean sePuedeSumar(Ficha ficha1, Ficha ficha2) {
		if(ficha1.getNumero() == ficha2.getNumero())
			return true;
		
		return false;
	}
	
	public boolean sePuedeMover(Ficha ficha, String direccion) {
		return false;
	}
	
	private Ficha estaMasCercaDelBorde(Ficha ficha1, Ficha ficha2) {
		return ficha1;
	}
	private boolean existeCombinacion() {
		return false;
	}
	public int sumarFichas(Ficha ficha1, Ficha ficha2) { //sumarFichas o combinarFichas?
		return 0;
	}
	
	public void actualizarTablero() {
		//el metodo que sera llamado en la interfaz y que contiene el funcionamiento general
	}
	
	public void ganar() {
		//:D
	}
	
	public void perder() {
		//:(
	}
	
}
