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
		String[][] words = new String[2][nWords];
		initFrame(unordered,1);
		initFrame(ordered,2);
		fillWords(words);
		showWords(words,0,unordered);
		orderWords(words);
		//Aquí falta el método para ordenar las palabras
		JOptionPane.showMessageDialog(null, "Voy a ordenar tus palabras");
		showWords(words,1,ordered);
	}
	public static void initFrame(JFrame frame, int nFrame) {
		int height = (int)(0.95*Toolkit.getDefaultToolkit().getScreenSize().height);
		int width = (int)(0.25*Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setSize(width,height);
		if (nFrame==1) {
			frame.setLocation(0, 0);
			frame.setTitle("Palabras Desordenadas");
		} else {
			frame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width-width, 0);
			frame.setTitle("Palabras Ordenadas");
		}
	}
	public static void fillWords(String[][] matrix) {
		int columns = matrix[0].length;
		for(int i=0;i<columns;i++) {
			matrix[0][i] = JOptionPane.showInputDialog("¿Qué palabra introducimos?");
		}
	}
	public static void showWords(String[][] matrix, int row, JFrame window) {
		int columns = matrix[0].length;
		Font comic =new Font("Dialog", Font.BOLD, 13);
		String words = "\n";
		for(int i=0;i<columns;i++) {
			words+="         "+matrix[row][i]+"\n";
		}
		JTextArea tWords = new JTextArea(words);
		tWords.setFont(comic);
		tWords.setEditable(false);
		window.add(tWords);
		window.setVisible(true);
	}
	public static void orderWords(String[][] matrix) {
		int columns = matrix[0].length;
		int[][] aux = new int[2][columns];
		int min, minimun=-999;
		String auxWord;
		
		for(int i=0;i<columns;i++) {
			auxWord="";
			for(int j=0;j<matrix[0][i].length();j++) {
				auxWord+="a";
			}
			aux[0][i]=matrix[0][i].compareToIgnoreCase(auxWord);
		}
		for(int i=0;i<columns;i++) {
			rightMove(aux);
			min=(findMin(aux,minimun,i));
			aux[0][i]=min;
			minimun=min;
		}
		for(int i=0;i<columns;i++) {
			matrix[1][i]=matrix[0][aux[1][i]];
		}		
	}
	public static void rightMove(int[][] array) {
		int columns = array.length;
		for(int i=0;i<columns-1;i++) {
			array[1][i+1]=array[1][i];
		}
	}
	public static int findMin(int[][] array,int ignoreMinimun,int alreadyOrdered) {
		int columns = array.length;
		int min=999;
		for(int i=alreadyOrdered,j=0;i<columns-1;i++,j++) {
			if(array[0][i]<min && array[0][i]>=ignoreMinimun) {
				min=array[0][i];
			}
		}
		return min;
	}

}
