package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio3;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex3Graphics extends JFrame {
	static final int HEIGHT = (int) (0.95*Toolkit.getDefaultToolkit().getScreenSize().height);
	static final int WIDTH = (int) (Toolkit.getDefaultToolkit().getScreenSize().width);
	private static final long serialVersionUID = 1L;
	Font menuFont = new Font("Verdana", Font.BOLD, WIDTH/120);
	Color menuColor = new Color(185,214,214);
	public Ex3Graphics(int nFrame) {
		switch (nFrame) {
		case 1:
			setTitle("Menú");
			setSize(WIDTH/6,HEIGHT/5);
			setLocationRelativeTo(null);
			setLayout(new GridLayout(3,1));
			buildMenu();
			break;
		case 2:
			break;
		}
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void buildMenu() {
		JButton addProcess = new JButton("Añadir un proceso a la cola");
		JButton allowProcess = new JButton("Permitir el acceso de un proceso");
		JButton exit = new JButton("Salir");
		setMenuButtons(addProcess);
		setMenuButtons(allowProcess);
		setMenuButtons(exit);
		add(addProcess);
		add(allowProcess);
		add(exit);
	}
	public void setMenuButtons(JButton button) {
		button.setBackground(menuColor);
		button.setFont(menuFont);
		button.setFocusPainted(false);
		button.setBorder(BorderFactory.createRaisedBevelBorder());
	}
}
