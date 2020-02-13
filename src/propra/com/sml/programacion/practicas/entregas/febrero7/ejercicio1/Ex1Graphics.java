package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio1;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Ex1Graphics extends JFrame {
	static final int HEIGHT = (int)(0.95*Toolkit.getDefaultToolkit().getScreenSize().height); //Obtiene el 95% del alto de la pantalla 
	static final int WIDTH = (int)(0.25*Toolkit.getDefaultToolkit().getScreenSize().width);   //Obtiene el 25% del ancho de la pantalla
	private static final long serialVersionUID = 1L; 
	public Ex1Graphics(int nFrame) {
		setSize(WIDTH,HEIGHT); //Da el tamaño al frame que se instancia
		setResizable(false);   //Configura que su tamaño es invariable
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Indica que debe apagar el programa si se cierra el JFrame
		if (nFrame==1) { //Si el constructor recibe un 1, coloca el JFrame en 1/4 de la pantalla horizontalmente ([x]-[]-[]-[]) y le da el título de palabras desordenadas
			setLocation(0, 0);
			setTitle("Palabras Desordenadas");
		} else { //Si el constructor no recibe un 1, coloca el JFrame en 4/4 de la pantalla horizontalmente ([]-[]-[]-[x]) y le da el título de palabras ordenadas
			setLocation(Toolkit.getDefaultToolkit().getScreenSize().width-WIDTH, 0); //Ejemplo: 1080-0,25*1080=(3/4)*1080=810
			setTitle("Palabras Ordenadas");
		}
	}
	public void showWords(String[] array, int row) { //Llena una JTextArea con todas las palabras introducidas en un array y las muestra en un JFrame 
		int columns = array.length;
		Font wordsFont =new Font("Verdana", Font.BOLD, WIDTH/25); //Define la fuente de la letra Dialog,negrita,(tamaño adaptable en función de la pantalla)
		String words = "\n";
		for(int i=0;i<columns;i++) { //Llena un texto con márgenes para añadir al JTextArea 
			words+="     "+array[i]+"\n";
		}
		JTextArea tWords = new JTextArea(words); //Crea una zona de texto con el texto creado anteriormente para añadir al JFrame
		tWords.setFont(wordsFont); //Cambia la fuente del texto en el JTextArea
		tWords.setEditable(false); //Configura que no se pueda cambiar el texto
		add(tWords); //Añade el JTextArea al JFrame
		setVisible(true); //Muestra el JFrame
	}
}
