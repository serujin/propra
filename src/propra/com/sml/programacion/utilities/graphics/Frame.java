package propra.com.sml.programacion.utilities.graphics;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width/2;
	public static final int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
	public Frame(String title) {
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public int getWIDTH() {
		return WIDTH;
	}
	public int getHEIGHT() {
		return HEIGHT;
	}
}
