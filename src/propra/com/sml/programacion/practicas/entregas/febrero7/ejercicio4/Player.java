package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

import java.util.Random;

public class Player {
	String[] possibleNames = {"Oliver","Benji","Bruce","Tom","Mark","Ed","Julian","Dani","Philip","James","Jason","Axel","Shawn","Byron","Xavier","Nathan","Caleb"};
	String[] possibleSurnames = {" Evans"," Blaze"," Froste"," Love"," Foster"," Swift"," Atom"," Price"," Harper"," Baker"," Lenders"," Warner"," Ross"," Melow"," Callahan","Derrick"};
	Random selector = new Random();
	private static int value;
	private static String name;
	public Player() {
		value=(selector.nextInt(1500000)+400000);
		name=(possibleNames[selector.nextInt(possibleNames.length)]+possibleSurnames[selector.nextInt(possibleSurnames.length)]);
	}
	public static int getValue() {
		return value;
	}
	public static void setValue(int value) {
		Player.value = value;
	}
	public static String getName() {
		return name;
	}
}
