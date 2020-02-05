package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

import java.text.DecimalFormat;
import java.util.Random;

public class Player {
	private static String[] possibleNames = {"Oliver","Benji","Bruce","Tom","Mark","Ed","Julian","Dani","Philip","James","Jason","Axel","Shawn","Byron","Xavier","Nathan","Caleb"};
	private static String[] possibleSurnames = {" Evans"," Blaze"," Froste"," Love"," Foster"," Swift"," Atom"," Price"," Harper"," Baker"," Lenders"," Warner"," Ross"," Melow"," Callahan"," Derrick"};
	private int[] skills = new int[6];
	private Random selector = new Random();
	private int value;
	private String name;
	private String position;
	public Player() {
		fillValue();
		fillName();
		fillPosition();
		fillSkills();
	}
	private void fillValue() {
		value=(selector.nextInt(1500000)+300000);
	}
	private void fillName() {
		name=(possibleNames[selector.nextInt(possibleNames.length)]+possibleSurnames[selector.nextInt(possibleSurnames.length)]);
	}
	private void fillPosition() {
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
	private void fillSkills() {
		for(int i=0;i<6;i++) {
			skills[i]=selector.nextInt(80)+20;
		}
	}
	public String getFormatValue() {
		DecimalFormat addPoints = new DecimalFormat("###,###,###,###");
		return addPoints.format(value);
	}
	public int getValue() {
		return value;
	}
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}
	public int getSkills(int index) {
		return skills[index];
	}
	public int getAvg() {
		int avg=0;
		for(int i=0;i<6;i++) {
			avg+=skills[i];
		}
		avg=avg/6;
		return avg;
	}
}
