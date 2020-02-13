package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

import java.text.DecimalFormat;
import java.util.Random;

public class Player { //Cada jugador tiene nombre y apellidos, valor(€), habilidades y posición en el campo
	private static String[] possibleNames = {"Oliver","Benji","Bruce","Tom","Mark","Ed","Julian","Dani","Philip","James","Jason","Axel","Shawn","Byron","Xavier","Nathan","Caleb"};
	private static String[] possibleSurnames = {" Evans"," Blaze"," Froste"," Love"," Foster"," Swift"," Atom"," Price"," Harper"," Baker"," Lenders"," Warner"," Ross"," Melow"," Callahan"," Derrick"};
	private int[] skills = new int[6]; //Los nombres y apellidos son de Oliver y Benji e Inazuma Eleven (como curiosidad :P)
	private Random selector = new Random();
	private int value;
	private String name;
	private String position;
	public Player() { //Inicializa el jugador aleatoriamente
		fillValue();
		fillName();
		fillPosition();
		fillSkills();
	}
	private void fillValue() { //Inicializa el valor del jugador aleatoriamente
		value=(selector.nextInt(1300000)+300000);
	}
	private void fillName() { //Inicializa nombre y apellidos del jugador aleatoriamente
		name=(possibleNames[selector.nextInt(possibleNames.length)]+possibleSurnames[selector.nextInt(possibleSurnames.length)]);
	}
	private void fillPosition() { //Inicializa la posición en el campo del jugador aleatoriamente
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
	private void fillSkills() { //Inicializa las habilidades del jugador aleatoriamente
		for(int i=0;i<6;i++) {
			skills[i]=selector.nextInt(80)+20;
		}
	}
	public String getFormatValue() { //Devuelve el valor del jugador con éste formato: 000.000.000.000
		DecimalFormat addPoints = new DecimalFormat("###,###,###,###");
		return addPoints.format(value);
	}
	public int getValue() { //Devuelve el valor del jugador
		return value;
	}
	public String getName() { //Devuelve el nombre del jugador
		return name;
	}
	public String getPosition() {  //Devuelve la posición del jugador
		return position;
	}
	public int getSkills(int index) {  //Devuelve las habilidades del jugador
		return skills[index];
	}
	public int getAvg() { //Hace la media de las habilidades del jugador y la devuelve
		int avg=0;
		for(int i=0;i<6;i++) {
			avg+=skills[i];
		}
		avg=avg/6;
		return avg;
	}
}
