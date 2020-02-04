package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

import java.util.Random;

public class Player {
	private static String[] possibleNames = {"Oliver","Benji","Bruce","Tom","Mark","Ed","Julian","Dani","Philip","James","Jason","Axel","Shawn","Byron","Xavier","Nathan","Caleb"};
	private static String[] possibleSurnames = {" Evans"," Blaze"," Froste"," Love"," Foster"," Swift"," Atom"," Price"," Harper"," Baker"," Lenders"," Warner"," Ross"," Melow"," Callahan","Derrick"};
	private static int[] skills = new int[6];
	private static Random selector = new Random();
	private static int value;
	private static String name;
	private static String position;
	public Player() {
		fillValue();
		fillName();
		fillPosition();
		fillSkills();
	}
	private static void fillValue() {
		value=(selector.nextInt(1500000)+400000);
	}
	private static void fillName() {
		name=(possibleNames[selector.nextInt(possibleNames.length)]+possibleSurnames[selector.nextInt(possibleSurnames.length)]);
	}
	private static void fillPosition() {
		int positionValue=selector.nextInt(101);
		if(positionValue<11) {
			position="POR";
		}
		if(positionValue<41 && positionValue>10) {
			position="DEF";
		}
		if(positionValue<71 && positionValue>40) {
			position="MDC";
		}
		if(positionValue<101 && positionValue>70) {
			position="DEL";
		}
	}
	private static void fillSkills() {
		for(int i=0;i<6;i++) {
			skills[i]=selector.nextInt(80)+20;
		}
	}
	public static int getValue() {
		return value;
	}
	public static String getName() {
		return name;
	}
	public static String getPosition() {
		return position;
	}
}
