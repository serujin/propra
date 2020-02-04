package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Club {
	private static int money;
	private ArrayList<String> clubPlayers;
	public static String name;

	public Club() {
		money=10000000;
		name=JOptionPane.showInputDialog("¿Cómo se llama el club?");
	}
	public static String getClubName() {
		return name;
	}
	public static int getClubMoney() {
		return money;
	}
	public ArrayList<String> getClubPlayers() {
		return clubPlayers;
	}
	public void setClubPlayers(ArrayList<String> clubPlayers) {
		this.clubPlayers = clubPlayers;
	}
}