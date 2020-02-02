package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio2;

import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Ex2Graphics extends JFrame{
	static final int HEIGHT = (int) (0.5*0.95*Toolkit.getDefaultToolkit().getScreenSize().height);
	static final int WIDTH = (int) (0.5*Toolkit.getDefaultToolkit().getScreenSize().width);
	private static final long serialVersionUID = 1L;
	public Ex2Graphics() {
		setSize(WIDTH,HEIGHT);
		setResizable(false);
		setLocation(WIDTH/2,HEIGHT/2);
		setTitle("Empresas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,1));
	}
	public void setTextArea(String area1, String area2, String area3) {
		JTextArea text1 = new JTextArea(area1);
		JTextArea text2 = new JTextArea(area2);
		JTextArea text3 = new JTextArea(area3);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		add(text1);
		add(text2);
		add(text3);
	}
}
