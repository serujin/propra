package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio3;

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
import javax.swing.JProgressBar;

public class Ex3Graphics extends JFrame implements ActionListener{
	private static final int HEIGHT = (int) (0.95*Toolkit.getDefaultToolkit().getScreenSize().height);
	private static final int WIDTH = (int) (Toolkit.getDefaultToolkit().getScreenSize().width);
	private static final long serialVersionUID = 1L;
	private Font menuFont = new Font("Verdana", Font.BOLD, WIDTH/120);
	private Color menuColor = new Color(185,214,214);
	private JButton addProcess = new JButton("Añadir un proceso a la cola");
	private JButton allowProcess = new JButton("Permitir el acceso de un proceso");
	private JButton exit = new JButton("Salir");
	static JProgressBar running = new JProgressBar(0,100);
	public Ex3Graphics(int nFrame) {
		switch (nFrame) {
		case 1:
			setTitle("Menú");
			setSize(WIDTH/6,HEIGHT/6);
			setLocationRelativeTo(null);
			setLayout(new GridLayout(3,1));
			buildMenu();
			break;
		case 2:
			setSize(WIDTH/4,HEIGHT/5);
			setLocationRelativeTo(null);
			buildRunning();
			break;
		}
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void buildMenu() {
		setMenuButtons(addProcess);
		setMenuButtons(allowProcess);
		setMenuButtons(exit);
		add(addProcess);
		add(allowProcess);
		add(exit);
	}
	public void setMenuButtons(JButton button) {
		button.setBackground(menuColor);
		button.setFont(menuFont);
		button.setFocusPainted(false);
		button.setBorder(BorderFactory.createRaisedBevelBorder());
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addProcess) {
			setVisible(false);
			Ejercicio3.addProcess();
			JOptionPane.showMessageDialog(null, "Proceso añadido a la cola: "+Ejercicio3.process.get(Ejercicio3.process.size()-1));
			setVisible(true);
		} if(e.getSource()==allowProcess) {
			setVisible(false);
			Ejercicio3.processDone();
			setVisible(true);
		} if(e.getSource()==exit) {
			JOptionPane.showMessageDialog(null, "Ha seleccionado salir, el programa se apagará");
			Ejercicio3.off();
		}
	}
	public void buildRunning() {
		add(running);
	}
	public void fillBar() {
		if(running.getValue()==100) {
			JOptionPane.showMessageDialog(null, "Se ha acabado de ejecutar el proceso: "+Ejercicio3.process.get(0));
			setVisible(false);
		}
	}
}

