package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ex4Graphics extends JFrame implements ActionListener {
	private static final int HEIGHT = (int) (Toolkit.getDefaultToolkit().getScreenSize().height);
	private static final int WIDTH = (int) (Toolkit.getDefaultToolkit().getScreenSize().width);
	private static final long serialVersionUID = 1L;
	private Font northSouthFont = new Font("Verdana", Font.BOLD, WIDTH/120);
	private Font centerButtonFont = new Font("Verdana", Font.BOLD, WIDTH/70);
	JButton buyButton = new JButton("Comprar");
	JButton sellButton = new JButton("Vender");
	JButton helpButton = new JButton("Ayuda");
	JButton infoButton = new JButton("Info");
	JButton exitButton = new JButton("Exit");
	public Ex4Graphics() {
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setUndecorated(true);
		setExtendedState(MAXIMIZED_BOTH);
		createNorth();
		createCenter();
		createSouth();
		setVisible(true);
	}
	public void initBlank(JTextField field) {
		field.setEditable(false);
		field.setBackground(this.getBackground());
		field.setBorder(null);
	}
	public void createNorth() {
		JPanel north = new JPanel(new GridLayout(2,2));
		JTextField northLeftText = new JTextField();
		JTextField northRightText = new JTextField();
		JTextField blank = new JTextField();
		JTextField blank2 = new JTextField();
		JTextField blank3 = new JTextField();
		JTextField blank4 = new JTextField();
		JTextField blank5 = new JTextField();
		northLeftText.setFont(northSouthFont);
		northLeftText.setText("     Nombre del Club: "+Club.getClubName());
		northRightText.setFont(northSouthFont);
		northRightText.setText("Dinero disponible: "+Club.getClubMoney()+"€     ");
		northRightText.setHorizontalAlignment(SwingConstants.RIGHT);
		initBlank(northRightText);
		initBlank(northLeftText);
		initBlank(blank);
		initBlank(blank2);
		initBlank(blank3);
		initBlank(blank4);
		initBlank(blank5);
		north.add(northLeftText);
		north.add(blank);
		north.add(blank2);
		north.add(northRightText);
		north.add(blank3);
		north.add(blank4);
		north.add(blank5);
		add(north,BorderLayout.NORTH);
	}
	public void createCenter() {
		JPanel center = new JPanel(new GridLayout(1,3));
		JTextArea centerWestText = new JTextArea("Jugadores Libres");
		JTextArea centerEastText = new JTextArea("Plantilla");
		center.add(centerEastText);
		center.add(createCenterButtons());
		center.add(centerWestText);
		add(center,BorderLayout.CENTER);
	}
	public JPanel createCenterButtons() {
		JPanel centerButtons = new JPanel(new GridLayout(8,3,0,HEIGHT/50));
		JTextField blank = new JTextField();
		JTextField blank2 = new JTextField();
		JTextField blank3 = new JTextField();
		JTextField blank4 = new JTextField();
		JTextField blank5 = new JTextField();
		JTextField blank6 = new JTextField();
		JTextField blank7 = new JTextField();
		JTextField blank8 = new JTextField();
		JTextField blank9 = new JTextField();
		JTextField blank10 = new JTextField();
		JTextField blank11 = new JTextField();
		JTextField blank12 = new JTextField();
		JTextField blank13 = new JTextField();
		JTextField blank14 = new JTextField();
		JTextField blank15 = new JTextField();
		JTextField blank16 = new JTextField();
		JTextField blank17 = new JTextField();
		JTextField blank18 = new JTextField();
		buyButton.setFont(centerButtonFont);
		sellButton.setFont(centerButtonFont);
		helpButton.setFont(centerButtonFont);
		infoButton.setFont(centerButtonFont);
		exitButton.setFont(centerButtonFont);
		initBlank(blank);
		initBlank(blank2);
		initBlank(blank3);
		initBlank(blank4);
		initBlank(blank5);
		initBlank(blank6);
		initBlank(blank7);
		initBlank(blank8);
		initBlank(blank9);
		initBlank(blank10);
		initBlank(blank11);
		initBlank(blank12);
		initBlank(blank13);
		initBlank(blank14);
		initBlank(blank15);
		initBlank(blank16);
		initBlank(blank17);
		initBlank(blank18);
		centerButtons.add(blank);
		centerButtons.add(blank2);
		centerButtons.add(blank3);
		centerButtons.add(blank4);
		centerButtons.add(buyButton);
		centerButtons.add(blank5);
		centerButtons.add(blank6);
		centerButtons.add(sellButton);
		centerButtons.add(blank7);
		centerButtons.add(blank8);
		centerButtons.add(blank9);
		centerButtons.add(blank10);
		centerButtons.add(blank11);
		centerButtons.add(infoButton);
		centerButtons.add(blank12);
		centerButtons.add(blank13);
		centerButtons.add(helpButton);
		centerButtons.add(blank14);
		centerButtons.add(blank15);
		centerButtons.add(blank16);
		centerButtons.add(blank17);
		centerButtons.add(blank18);
		centerButtons.add(exitButton);
		buyButton.addActionListener(this);
		sellButton.addActionListener(this);
		infoButton.addActionListener(this);
		helpButton.addActionListener(this);
		exitButton.addActionListener(this);
		return centerButtons;
	}
	public void createSouth() {
		JPanel south = new JPanel(new GridLayout(2,3,WIDTH/100,0));
		JTextField lastAction = new JTextField();
		JTextField lastActionName = new JTextField();
		JTextField blank = new JTextField();
		JTextField blank2 = new JTextField();
		JTextField blank3 = new JTextField();
		initBlank(lastAction);
		initBlank(lastActionName);
		initBlank(blank);
		initBlank(blank2);
		initBlank(blank3);
		south.add(blank);
		south.add(blank2);
		south.add(blank3);
		south.add(lastAction);
		south.add(lastActionName);
		add(south,BorderLayout.SOUTH);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==buyButton) {
			System.out.println("Buy");
		} 
		if(e.getSource()==sellButton) {
			System.out.println("Sell");
		} 
		if(e.getSource()==infoButton) {
			System.out.println("Info");
		} 
		if(e.getSource()==helpButton) {
			System.out.println("Help");
		} 
		if(e.getSource()==exitButton) {
			System.exit(0);
		} 
		
	}
}
