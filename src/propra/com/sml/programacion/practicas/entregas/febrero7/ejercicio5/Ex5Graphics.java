package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio5;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ex5Graphics extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private static final int HEIGHT = (int) (0.95*Toolkit.getDefaultToolkit().getScreenSize().height); //Coge el 95% del alto de la pantalla
	private static final int WIDTH = (int) (Toolkit.getDefaultToolkit().getScreenSize().width);        //Coge el 100% del ancho de la pantalla
	private Font menuFont = new Font("Verdana", Font.BOLD, WIDTH/120); //Crea la fuente del menú Verdana,negrita,tamaño adaptado a la pantalla
	private Color menuColor = new Color(170,119,184); //Crea un color para los botones
	private JButton addProcess = new JButton("Añadir un proceso a la cola"); //Crea un botón para el JFrame
	private JButton allowProcess = new JButton("Permitir el acceso de un proceso"); //Crea un botón para el JFrame
	private JButton exit = new JButton("Salir"); //Crea un botón para el JFrame
	public Ex5Graphics() {
		setTitle("Menú Procesador RR Quantum 1"); //Le pone el titulo de menú al JFrame
		setSize(WIDTH/6,HEIGHT/6); //Le da el tamaño de 1/6 del alto y ancho de la pantalla al JFrame
		setLocationRelativeTo(null); //Centra el JFrame en la pantalla
		setLayout(new GridLayout(3,1)); //Pone el Layout del JFrame para organizar los elementos
		buildMenu(); //Añade los botones al JFrame con su formato dado
		setResizable(false); //Fija el tamaño del JFrame
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Especifica lo que debe hacer el JFrame cuando le des a cerrar
	}
	public void buildMenu() {
		setMenuButtons(addProcess); //Formatea los botones 
		setMenuButtons(allowProcess);
		setMenuButtons(exit);
		add(addProcess); //Añade los botones con formato al JFrame
		add(allowProcess);
		add(exit);
	}
	public void setMenuButtons(JButton button) { //Formatea los botones
		button.setBackground(menuColor); //Les da el color de fondo
		button.setFont(menuFont); //Les añade la fuente
		button.setFocusPainted(false); //Les quita el resaltado al fijarlos
		button.setBorder(BorderFactory.createRaisedBevelBorder()); //Les cambia el borde
		button.addActionListener(this); //Les añade el ActionListener de esta clase
	}
	@Override
	public void actionPerformed(ActionEvent e) { //Es el ActionListener de la clase
		if(e.getSource()==addProcess) { //Si pulsas el botón de añadir:
			setVisible(false); //Esconde el menú
			Ejercicio5.addProcess(); //Añade el proceso a los ArrayList de la otra clase
			JOptionPane.showMessageDialog(null, "Proceso añadido a la cola: "+Ejercicio5.process.get(Ejercicio5.process.size()-1)+"\nDuración del proceso: "+Ejercicio5.processDuration.get(Ejercicio5.processDuration.size()-1));
			 //La linea de arriba le dice al usuario que se ha añadido el proceso
			setVisible(true); //Vuelve a mostrar el menú
		} 
		if(e.getSource()==allowProcess) { //Si pulsas el botón de pemitir el acceso:
			setVisible(false);  //Esconde el menú
			Ejercicio5.processDone(); //Borra el proceso de las ArrayList de la otra clase, sino hay procesos se avisa al usuario
			setVisible(true); //Vuelve a mostrar el menú
		}  
		if(e.getSource()==exit) { //Si se pulsa el botón de salir:
			JOptionPane.showMessageDialog(null, "Ha seleccionado salir, el programa se apagará"); //Se informa al usuario que va a apagarse el sistema
			Ejercicio5.off(); //Apaga el sistema
		}
	}
}

