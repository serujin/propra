package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class myClub {
	private static int money;
	private ArrayList<String> clubPlayers;
	public static String name;

	public myClub() {
		money=10000000;
		name=JOptionPane.showInputDialog("¿Cómo se llama el club?");
	}
	public String getClubName() {
		return name;
	}
	public int getClubMoney() {
		return money;
	}
	public ArrayList<String> getClubPlayers() {
		return clubPlayers;
	}
	public void setClubPlayers(ArrayList<String> clubPlayers) {
		this.clubPlayers = clubPlayers;
	}
	public void buyPlayer(int moneySpent) {
		money-=moneySpent;
	}
	public void sellPlayer(int moneyReceived) {
		money+=moneyReceived;
	}
	public String getFormatMoney() {
		DecimalFormat addPoints = new DecimalFormat("###,###,###,###");
		return addPoints.format(money);
	}
}