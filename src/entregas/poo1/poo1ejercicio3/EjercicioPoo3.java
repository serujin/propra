package entregas.poo1.poo1ejercicio3;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EjercicioPoo3 {
	public static void main(String[] args) {
		initGraphics(selectPlayers());
	}
	
	private static String selectPlayers() {
		String players = JOptionPane.showInputDialog(null, "¿Cuantas personas van a jugar?\nInserte 1 o 2");
		while (!players.equals("1") && !players.equals("2")) {
			JOptionPane.showMessageDialog(null, "Inserte 1 o 2");
			players = JOptionPane.showInputDialog(null, "¿Cuantas personas van a jugar?\nInserte 1 o 2");
		}
		return players;
	}

	private static void initGraphics(String players) {
		JFrame window = new JFrame();
		Board board = new Board(Integer.valueOf(players));
		double scale = 0.6;
		int size = (int) (Toolkit.getDefaultToolkit().getScreenSize().height * scale);
		window.add(board);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(size, size);
		window.setLocationRelativeTo(null);
		window.setUndecorated(true);
		window.setVisible(true);
	}
}
