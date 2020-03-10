package entregas.poo1.poo1ejercicio3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EjercicioPoo3 {
	public static void main(String[] args) {
		String players = selectPlayers();
		initGraphics(players);
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
		window.add(board);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(Board.SIZE * 4, Board.SIZE * 4);
		window.setLocationRelativeTo(null);
		window.setUndecorated(true);
		window.setVisible(true);
	}
}
