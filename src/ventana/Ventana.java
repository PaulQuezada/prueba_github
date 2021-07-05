package ventana;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	public Ventana() {
		this.setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Título juego");
		setLocationRelativeTo(null);
		iniciarComponentes();
	}
	
	private void  iniciarComponentes() {
		
		JPanel panel=new JPanel();
		this.getContentPane().add(panel);
		panel.setBackground(Color.BLACK);
	}

}	