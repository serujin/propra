package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio2;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Ex2Graphics extends JFrame{
	static final int HEIGHT = (int) (0.5*0.95*Toolkit.getDefaultToolkit().getScreenSize().height); //Obtengo la mitad del 95% de la altura de la pantalla 
	static final int WIDTH = (int) (0.5*Toolkit.getDefaultToolkit().getScreenSize().width);        //Obtengo la mitad de la anchura de la pantalla
	private static final long serialVersionUID = 1L;
	public Ex2Graphics() {
		setSize(WIDTH,HEIGHT); //Da el tamaño al JFrame
		setResizable(false); //Fija el tamaño del JFrame
		setLocationRelativeTo(null); //Lo pone en medio de la pantalla
		setTitle("Empresas"); //Le da el título de empresas
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Define la acción al cerrar la ventana
		setLayout(new GridLayout(3,1)); //Le da un layout para ordenar los componentes
	}
	public void setTextArea(String area1, String area2, String area3) {
		JTextArea text1 = new JTextArea(area1); //Crea 3 JTextArea con el texto facilitado
		JTextArea text2 = new JTextArea(area2);
		JTextArea text3 = new JTextArea(area3);
		text1.setEditable(false); //Hace que los textos no se puedan editar
		text2.setEditable(false);
		text3.setEditable(false);
		Font textFont =new Font("Verdana", Font.BOLD, WIDTH/70); //Crea la fuente de texto para darle a los JTextArea Verdana,Negrita,tamaño adaptable a pantalla
		text1.setFont(textFont); //Da la fuente a cada JTextArea
		text2.setFont(textFont);
		text3.setFont(textFont);
		add(text1); //Añade los JTextArea al JFrame
		add(text2);
		add(text3);
	}
}
