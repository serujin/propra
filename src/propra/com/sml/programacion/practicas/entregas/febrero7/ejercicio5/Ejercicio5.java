package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio5;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio5 { //He reutilizado casi el 90% del ejercicio 3
	static Ex5Graphics menu = new Ex5Graphics(); //Creo un objeto de mi clase Ex5Graphics
	static ArrayList<String> process = new ArrayList<String>(); //Creo un ArrayList de procesos
	static ArrayList<Integer> processDuration = new ArrayList<Integer>(); //Creo un ArrayList de duración de procesos
	public static void main (String [] args) {
		menu.setVisible(true); //Muestro el menú
	}
	public static void addProcess() { //Es el método que añade procesos
		String name;
		int duration;
		if(process.size()<100) { //Si hay menos de 100 procesos el programa añade el proceso introducido junto con ".exe" :P
			name=JOptionPane.showInputDialog("Introduce el nombre del proceso a añadir:");
			process.add(name+".exe");
			duration=Integer.parseInt(JOptionPane.showInputDialog("Introduce la duración del proceso a añadir:"));
			processDuration.add(duration); //Añade también la duración del mismo
		} else { //Si hay mas de 100 procesos le dice al usuario que no hay hueco para mas
			JOptionPane.showMessageDialog(null, "Hay 100 procesos en cola, no hay hueco para mas");
		}
	}
	public static void processDone() { //Ejecuta un ciclo de los procesos y, si acaban, los quita del ArrayList de procesos y duración
		if(process.isEmpty()) { //Si no hay procesos en cola le dice al usuario que no hay procesos
			JOptionPane.showMessageDialog(null, "No has introducido ningún proceso");
		} else { //Si hay procesos le dice al usuario que se ha acabado de ejecutar un ciclo del primer proceso añadido y le resta uno a su duración
			String name=process.get(0);                                                                       
			int duration=processDuration.get(0);
			duration--; //Resta 1 a la duración
 			process.remove(0); //Borra el proceso de la primera posición
			processDuration.remove(0); //Borra el proceso de la primera posición
			if(duration>0) { //Si le quedan ciclos de procesamiento al proceso, se añade al final de la cola 
				JOptionPane.showMessageDialog(null, "Se ha acabado de ejecutar un ciclo del proceso: "+name+"\nQuedan "+duration+" ciclos de procesamiento restantes");
				process.add(name);
				processDuration.add(duration);
			} else { //Sino, no se añade a la cola
				JOptionPane.showMessageDialog(null, "Se ha acabado de ejecutar el proceso: "+name);
			}
		}	
	}
	public static void off() { //Simplemente apaga el programa
		System.exit(0);
	}
}
