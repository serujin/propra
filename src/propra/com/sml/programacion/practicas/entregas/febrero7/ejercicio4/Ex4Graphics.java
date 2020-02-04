package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ex4Graphics extends JFrame {
	private static final int HEIGHT = (int) (Toolkit.getDefaultToolkit().getScreenSize().height);
	private static final int WIDTH = (int) (Toolkit.getDefaultToolkit().getScreenSize().width);
	private static final long serialVersionUID = 1L;
	private Font northFont = new Font("Verdana", Font.BOLD, WIDTH/120);
	private String northSpace="";
	public Ex4Graphics(Club club) {
		setSize(WIDTH/2,HEIGHT/2);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setUndecorated(true);
		createNorth(club);
		setVisible(true);
	}
	public void createNorth(Club club) {
		JPanel north = new JPanel(new GridLayout(1,1));
		createNorthSpaced();
		JTextArea northLeftText = new JTextArea("\n     Nombre del Club: "+Club.getClubName());
		JTextArea northRightText = new JTextArea("\n"+northSpace+"Dinero disponible: "+Club.getClubMoney()+"€\n");
		northLeftText.setFont(northFont);
		northRightText.setFont(northFont);
		northLeftText.setEditable(false);
		northRightText.setEditable(false);
		northLeftText.setBackground(this.getBackground());
		northRightText.setBackground(this.getBackground());
		north.add(northLeftText);
		north.add(northRightText);
		add(north,BorderLayout.NORTH);
	}
	public void createNorthSpaced() {
		for(int i=0;i<WIDTH/70;i++) {
			northSpace+=" ";
		}
	}
	public void createCenter() {
//		JPanel center = new JPanel(new BorderLayout());
//		JTextArea centerWestText = new JTextArea();
//		JTextArea centerEastText = new JTextArea();
	}
}
