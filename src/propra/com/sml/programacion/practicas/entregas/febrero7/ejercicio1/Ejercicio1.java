package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio1;

import java.awt.FlowLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import propra.com.sml.programacion.utilities.graphics.Frame;

public class Ejercicio1 {
	public static void main (String[] args) {
//		int nTimes=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas palabras quieres ordenar?"));
//		String[] unorderedWords = new String[nTimes];
//		for(int i=0;i<nTimes;i++) {
//			unorderedWords[i]=JOptionPane.showInputDialog("Inserta una palabra a añadir");
//		}
		int width;
		JOptionPane.showMessageDialog(null, "He ordenado tus palabras, a la izquierda lo desordenado, a la derecha lo ordenado");
		Frame unordered = new Frame("Palabras desordenadas");
		Frame ordered = new Frame("Palabras ordenadas");
		JPanel unorderedP = new JPanel(new FlowLayout());
		JPanel orderedP = new JPanel(new FlowLayout());
		orderedP.add(new JTextField("Patata"));
		ordered.add(orderedP);
		unordered.add(unorderedP);
		width=ordered.getWIDTH();
		unordered.setLocation(0,0);			//Coloca ambos frames alineados
		ordered.setLocation(width,0);       //  el uno con el otro 

	}
}
