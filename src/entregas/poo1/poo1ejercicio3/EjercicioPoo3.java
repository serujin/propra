package entregas.poo1.poo1ejercicio3;

import javax.swing.JOptionPane;

public class EjercicioPoo3 {
	public static void main(String[] args) {
		String players = JOptionPane.showInputDialog(null, "¿Cuantas personas van a jugar?\nInserte 1 o 2");
		while(!players.equals("1") && !players.equals("2")) {
			JOptionPane.showMessageDialog(null, "Inserte 1 o 2");
			players = JOptionPane.showInputDialog(null, "¿Cuantas personas van a jugar?\nInserte 1 o 2");
		}
		Board tablero = new Board(Integer.valueOf(players));
		tablero.initIcons();
		tablero.initGraphics();
	}
}
