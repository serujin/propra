package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio3 {
	static Ex3Graphics menu = new Ex3Graphics(); //Creo un objeto de mi clase Ex3Graphics
	static ArrayList<String> process = new ArrayList<String>(); //Creo un ArrayList de procesos 
	public static void main (String [] args) {
		menu.setVisible(true); //Muestro el menú
	}
	public static void addProcess() { //Es el método que añade procesos
		String name; 
		if(process.size()<100) { //Si hay menos de 100 procesos el programa añade el proceso introducido junto con ".exe" :P
			name=JOptionPane.showInputDialog("Introduce el nombre del proceso a añadir:"); 
			process.add(name+".exe");
		} else { //Si hay mas de 100 procesos le dice al usuario que no hay hueco para mas
			JOptionPane.showMessageDialog(null, "Hay 100 procesos en cola, no hay hueco para mas"); 
		}
	}
	public static void processDone() { //Ejecuta los procesos y los quita del ArrayList de procesos
		if(process.isEmpty()) { //Si no hay procesos en cola le dice al usuario que no hay procesos
			JOptionPane.showMessageDialog(null, "No has introducido ningún proceso");
		} else { //Si hay procesos le dice al usuario que se ha acabado de ejecutar el proceso primer proceso que se añadió y lo elimina
			JOptionPane.showMessageDialog(null, "Se ha acabado de ejecutar el proceso: "+Ejercicio3.process.get(0));
			process.remove(0);
		}	
	}
	public static void off() { //Simplemente apaga el programa
		System.exit(0);
	}
}
