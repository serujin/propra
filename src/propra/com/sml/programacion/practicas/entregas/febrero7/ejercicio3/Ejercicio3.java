package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	static Ex3Graphics menu = new Ex3Graphics(1);
	static Ex3Graphics	running = new Ex3Graphics(2);
	static ArrayList<String> process = new ArrayList<String>();
	public static void main (String [] args) {
		menu.setVisible(true);
	}
	public static void addProcess() {
		String name;
		name=JOptionPane.showInputDialog("Introduce el nombre del proceso a añadir:");
		process.add(name+".exe");
	}
	public static void processDone() {
		running.setTitle("Ejecutando proceso: "+process.get(0));
		running.setVisible(true);
		for(int i=1;i<process.size();i++) {
			process.set(i-1,process.get(i));
		}
		process.remove(process.size()-1);
	}
	public static void off() {
		System.exit(0);
	}
}
