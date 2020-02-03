package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	static Ex1Graphics unordered = new Ex1Graphics(1);
	static Ex1Graphics ordered = new Ex1Graphics(2);
	
	public static void main (String[] args) {
		int nWords = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas palabras vas a introducir?"));
		String[] words = new String[nWords];
		fillWords(words);
		unordered.showWords(words,0);
		ordenate(words);
		JOptionPane.showMessageDialog(null, "Voy a ordenar tus palabras");
		ordered.showWords(words,1);
	}
	public static void fillWords(String[] words) {
		int columns = words.length;
		for(int i=0;i<columns;i++) {
			words[i] = JOptionPane.showInputDialog("¿Qué palabra introducimos?");
		}
	}
	public static void ordenate(String[] array) { //Me inspiré en el algoritmo de burbuja
		int disorder,comparation;
		int columns = array.length;
		boolean disordered=true;
		String aux;
		while(disordered) {
			disorder=0;
			for(int i=1;i<columns;i++) {
				comparation=array[i].compareToIgnoreCase(array[i-1]);
				if(comparation<0) {
					disorder++;
					aux=array[i];
					array[i]=array[i-1];
					array[i-1]=aux;
				}
			}
			if(disorder==0) {
				disordered=false;
			}
		}
	}
}
