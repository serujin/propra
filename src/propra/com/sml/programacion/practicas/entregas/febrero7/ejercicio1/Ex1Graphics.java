package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio1;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Ex1Graphics extends JFrame {
	static final int HEIGHT = (int)(0.95*Toolkit.getDefaultToolkit().getScreenSize().height);
	static final int WIDTH = (int)(0.25*Toolkit.getDefaultToolkit().getScreenSize().width);
	private static final long serialVersionUID = 1L;
	public Ex1Graphics(int nFrame) {
		setSize(WIDTH,HEIGHT);
		setResizable(false);
		setLocation(WIDTH/2,HEIGHT/2);
		setTitle("Empresas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		if (nFrame==1) {
			setLocation(0, 0);
			setTitle("Palabras Desordenadas");
		} else {
			setLocation(Toolkit.getDefaultToolkit().getScreenSize().width-WIDTH, 0);
			setTitle("Palabras Ordenadas");
		}
	}
	public void showWords(String[] array, int row) {
		int columns = array.length;
		Font comic =new Font("Dialog", Font.BOLD, WIDTH/25);
		String words = "\n";
		for(int i=0;i<columns;i++) {
			words+="         "+array[i]+"\n";
		}
		JTextArea tWords = new JTextArea(words);
		tWords.setFont(comic);
		tWords.setEditable(false);
		add(tWords);
		setVisible(true);
	}
}
