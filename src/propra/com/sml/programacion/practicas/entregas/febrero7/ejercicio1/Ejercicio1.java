package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio1;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ejercicio1 {
	static JFrame ordered = new JFrame();
	static JFrame unordered = new JFrame();
	
	public static void main (String[] args) {
		int nWords = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas palabras vas a introducir?"));
		String[] words = new String[nWords];
		initFrame(unordered,1);
		initFrame(ordered,2);
		fillWords(words);
		showWords(words,0,unordered);
		ordenate(words);
		JOptionPane.showMessageDialog(null, "Voy a ordenar tus palabras");
		showWords(words,1,ordered);
	}
	public static void initFrame(JFrame frame, int nFrame) { //Método para inicializar los frames
		int height = (int)(0.95*Toolkit.getDefaultToolkit().getScreenSize().height);
		int width = (int)(0.25*Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setSize(width,height);
		frame.setResizable(false);
		if (nFrame==1) {
			frame.setLocation(0, 0);
			frame.setTitle("Palabras Desordenadas");
		} else {
			frame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width-width, 0);
			frame.setTitle("Palabras Ordenadas");
		}
	}
	public static void fillWords(String[] words) {
		int columns = words.length;
		for(int i=0;i<columns;i++) {
			words[i] = JOptionPane.showInputDialog("¿Qué palabra introducimos?");
		}
	}
	public static void showWords(String[] array, int row, JFrame window) {
		int columns = array.length;
		Font comic =new Font("Dialog", Font.BOLD, 13);
		String words = "\n";
		for(int i=0;i<columns;i++) {
			words+="         "+array[i]+"\n";
		}
		JTextArea tWords = new JTextArea(words);
		tWords.setFont(comic);
		tWords.setEditable(false);
		window.add(tWords);
		window.setVisible(true);
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
