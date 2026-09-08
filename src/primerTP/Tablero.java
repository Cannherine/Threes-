package Threes;

import java.util.Random;

public class Tablero {

    private Ficha[][] fichas;
    private Random random;
    //private int puntaje=0;
    //private int maximo
    public Tablero() {

        fichas = new Ficha[4][4];
        random = new Random();
        //puntaje=0;
        //maximo=0
        inicializarFichas();
    }

    private void inicializarFichas() {

        int fichasCreadas = 0;

        while (fichasCreadas < 9) {

            int numero = random.nextInt(3) + 1;

            int fila = random.nextInt(4);

            int columna = random.nextInt(4);

            if (fichas[fila][columna] == null) {

                colocarFicha(numero, fila, columna);

                fichasCreadas++;
            }
        }
    }

    public void colocarFicha(int numero, int fila, int columna) {
        fichas[fila][columna] = new Ficha(numero);
    }

    public Ficha obtenerFicha(int fila, int columna) {
        return fichas[fila][columna];
    }
    public void moverDerecha() {
    	for (int fila = 0; fila < 4; fila++) {

            for (int col = 2; col >= 0; col--) {

                if (fichas[fila][col] != null) {

                    if (fichas[fila][col + 1] == null) {
                        fichas[fila][col + 1] = fichas[fila][col];
                        fichas[fila][col] = null;
                    }
                }
            }
        }
    }
   public void moverIzquierda() {

       for (int fila = 0; fila < 4; fila++) {
           for (int col = 1; col < 4; col++) {
               if (fichas[fila][col-1] == null) {
            	   fichas[fila][col-1] = fichas[fila][col];
            	   fichas[fila][col] = null;
               }
           }
       }
   }
   public void moverArriba() {
	    for (int col = 0; col < 4; col++) {
	        for (int fila = 1; fila < 4; fila++) {
	             

	            if (fichas[fila][col] != null) {
	                 if(fichas[fila - 1][col]==null) {
	                	 fichas[fila - 1][col] = fichas[fila][col];
	                	 fichas[fila][col] = null;
	                 }      
	        }
	    }
	}
}
   public void moverAbajo() {
	    for (int col = 0; col < 4; col++) {
	        for (int fila = 2; fila >= 0; fila--) {

	            if (fichas[fila][col] != null) {
	                 if(fichas[fila + 1][col]==null) {
	                	 fichas[fila + 1][col] = fichas[fila][col];
	                	 fichas[fila][col] = null;
	                 }      
	        }
	    }
	}
}
}