package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	Ex3Graphics menu = new Ex3Graphics(1);
	public static void main (String [] args) {
		
	}
	public static void useProcess(Process process) {
		process.processUsed();
		if(process.ended()) {
			process=null;
		}
}
class Process {
	private String name;
	private int duration;
	public Process() {
		name=JOptionPane.showInputDialog("¿Cómo se llama el proceso que vas a añadir?");
		duration=Integer.parseInt(JOptionPane.showInputDialog("¿Cúantos ciclos del procesador necesita?"));
	}
	public void processUsed() {
		duration--;
	}
	public boolean ended() {
		boolean ended=false;
		if(duration<1) {
			ended=true;
		}
		return ended;
	}
}
}
