package Threes;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Component;
import javax.swing.border.BevelBorder;

public class Interfaz {

	private JFrame frame;
	private Tablero tablero;
	private Logica logica;
	private JPanel[][] casillas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		
		tablero = new Tablero();
		
		initialize();
		
	}
	private void actualizarTablero() {

	    for (int fila = 0; fila < 4; fila++) {
	        for (int columna = 0; columna < 4; columna++) {

	            casillas[fila][columna].removeAll();
	            Ficha ficha = tablero.obtenerFicha(fila, columna);
	            
	            if (ficha != null) {

	                JLabel etiqueta = new JLabel(String.valueOf(ficha.getNumero()));
	                
	                etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
	                etiqueta.setVerticalAlignment(SwingConstants.CENTER);
	                etiqueta.setFont(new Font("Arial", Font.BOLD, 40));
	                etiqueta.setForeground(Color.WHITE);

	                casillas[fila][columna].add(etiqueta, BorderLayout.CENTER);
	            }

	            casillas[fila][columna].revalidate();
	            casillas[fila][columna].repaint();
	            
	        }
	    }
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

	    frame = new JFrame();
	    frame.setBounds(100, 100, 898, 872);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);


	    frame.setFocusable(true);

	    JPanel principal = new JPanel();

	    principal.setBounds(200, 200, 484, 436);
	    principal.setBorder(new LineBorder(new Color(128, 128, 255), 3));
	    principal.setBackground(new Color(128, 128, 192));

	    principal.setLayout(new GridLayout(4, 4, 4, 4));

	    frame.getContentPane().add(principal);

	    casillas = new JPanel[4][4];

	    crearCasilleros(principal);

	    actualizarTablero();

	    frame.setFocusable(true);
		
		JPanel panelSur = new JPanel();
		panelSur.setBounds(0, 635, 884, 200);
		FlowLayout fl_panelSur = (FlowLayout) panelSur.getLayout();
		fl_panelSur.setVgap(100);
		fl_panelSur.setHgap(20);
		frame.getContentPane().add(panelSur);
		
		JPanel panelOeste = new JPanel();
		panelOeste.setBounds(0, 200, 200, 436);
		FlowLayout fl_panelOeste = (FlowLayout) panelOeste.getLayout();
		fl_panelOeste.setHgap(100);
		frame.getContentPane().add(panelOeste);
		
		JPanel panelEste = new JPanel();
		panelEste.setBounds(684, 200, 200, 436);
		frame.getContentPane().add(panelEste);
		panelEste.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Puntaje");
		lblNewLabel_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 128, 128), new Color(0, 128, 128), new Color(0, 128, 128), new Color(0, 128, 128)));
		lblNewLabel_1.setBackground(new Color(0, 128, 128));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBounds(62, 26, 61, 34);
		panelEste.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Maximo");
		lblNewLabel_2.setBounds(77, 137, 46, 14);
		panelEste.add(lblNewLabel_2);
		
		JPanel panelNorte = new JPanel();
		panelNorte.setBounds(0, 0, 884, 200);
		frame.getContentPane().add(panelNorte);
		panelNorte.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THREES!");
		lblNewLabel.setFont(new Font("Snap ITC", Font.BOLD, 40));
		lblNewLabel.setBounds(327, 138, 229, 52);
		panelNorte.add(lblNewLabel);
		frame.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyPressed(KeyEvent e) {

	            switch (e.getKeyCode()) {

	                case KeyEvent.VK_RIGHT:
	                    tablero.moverDerecha();
	                    break;

	                case KeyEvent.VK_LEFT:
	                    tablero.moverIzquierda();
	                    break;
	                    
	                case KeyEvent.VK_UP:
	                    tablero.moverArriba();
	                    break;
	                    
	                case KeyEvent.VK_DOWN:
	                    tablero.moverAbajo();
	                    break;


	            }

	            actualizarTablero();
	        }
		});
	}
	private void crearCasilleros(JPanel principal) {
		for (int fila = 0; fila < 4; fila++) {
		    for (int columna = 0; columna < 4; columna++) {

		        casillas[fila][columna] = new JPanel();

		        casillas[fila][columna].setBackground(Color.BLACK);

		        casillas[fila][columna].setBorder(
		            new LineBorder(Color.YELLOW, 4)
		        );
		        casillas[fila][columna].setLayout(new BorderLayout());
		        principal.add(casillas[fila][columna]);
		    }
		}
	}
}


