package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class Ex4Graphics extends JFrame implements ActionListener {
	private static final int HEIGHT = (int) (Toolkit.getDefaultToolkit().getScreenSize().height);
	private static final int WIDTH = (int) (Toolkit.getDefaultToolkit().getScreenSize().width);
	private static final long serialVersionUID = 1L;
	private Font northSouthFont = new Font("Verdana", Font.BOLD, WIDTH/120);
	private Font eastCenterFont = new Font("Verdana", Font.BOLD, WIDTH/90);
	private Font westCenterFont = new Font("Verdana", Font.BOLD, WIDTH/150);
	private Font infoFont = new Font("Verdana", Font.BOLD, WIDTH/80);
	private Font infoFont2 = new Font("Verdana", Font.BOLD, WIDTH/60);
	private Font centerButtonFont = new Font("Verdana", Font.BOLD, WIDTH/70);
	ArrayList<Player> boughtPlayers = new ArrayList<Player>(); 
	ArrayList<Player> avaliablePlayers = new ArrayList<Player>(); 
	JTextField northLeftText = new JTextField();
	JTextField northRightText = new JTextField();
	JTextField playerBought1 = new JTextField();
	JTextField playerBought2 = new JTextField();
	JTextField playerBought3 = new JTextField();
	JTextField playerBought4 = new JTextField();
	JTextField playerBought5 = new JTextField();
	JTextField playerBought6 = new JTextField();
	JTextField playerBought7 = new JTextField();
	JTextField playerBought8 = new JTextField();
	JTextField playerBought9 = new JTextField();
	JTextField playerBought10 = new JTextField();
	JTextField playerBought11 = new JTextField();
	JButton buyButton = new JButton("Comprar");
	JButton sellButton = new JButton("Vender");
	JButton helpButton = new JButton("Ayuda");
	JButton infoButton = new JButton("Info");
	JTextField lastAction = new JTextField();
	JTextField actionDone = new JTextField();
	JTextField cuantityAction = new JTextField();
	JButton exitButton = new JButton("Salir");
	JTextField playerAvaliable1 = new JTextField();
	JTextField playerAvaliable2 = new JTextField();
	JTextField playerAvaliable3 = new JTextField();
	JTextField playerAvaliable4 = new JTextField();
	JTextField playerAvaliable5 = new JTextField();
	JTextField playerAvaliable6 = new JTextField();
	JTextField playerAvaliable7 = new JTextField();
	JTextField playerAvaliable8 = new JTextField();
	JTextField playerAvaliable9 = new JTextField();
	JTextField playerAvaliable10 = new JTextField();
	JTextField playerAvaliable11 = new JTextField();
	JTextField playerAvaliable12 = new JTextField();
	JTextField playerAvaliable13 = new JTextField();
	JTextField playerAvaliable14 = new JTextField();
	JTextField playerAvaliable15 = new JTextField();
	JTextField playerAvaliable16 = new JTextField();
	JTextField playerAvaliable17 = new JTextField();
	JTextField playerAvaliable18 = new JTextField();
	JTextField playerAvaliable19 = new JTextField();
	JTextField playerAvaliable20 = new JTextField();
	JTextField playerAvaliable21 = new JTextField();
	JTextField playerAvaliable22 = new JTextField();
	JTextField playerAvaliable23 = new JTextField();
	JTextField playerAvaliable24 = new JTextField();
	JTextField playerAvaliable25 = new JTextField();
	myClub myClub = new myClub();
	JFrame infoFrame = new JFrame();
	JTextField info1 = new JTextField();
	JTextField info2 = new JTextField();
	JTextField info3 = new JTextField();
	JTextField info4 = new JTextField();
	JTextField info5 = new JTextField();
	JTextField info6 = new JTextField();
	JTextField info7 = new JTextField();
	JTextField info8 = new JTextField();
	JButton exitInfoButton = new JButton("Volver al mercado");
	JFrame helpFrame = new JFrame();
	JTextArea help = new JTextArea();
	JButton exitHelpButton = new JButton("Volver al mercado");
	public Ex4Graphics() {
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setUndecorated(true);
		setExtendedState(MAXIMIZED_BOTH);
	}
	public void initBlank(JTextField field) {
		field.setEditable(false);
		field.setBackground(this.getBackground());
		field.setBorder(null);
	}
	public void createNorth() {
		JPanel north = new JPanel(new GridLayout(2,2));
		JTextField blank = new JTextField();
		JTextField blank2 = new JTextField();
		JTextField blank3 = new JTextField();
		JTextField blank4 = new JTextField();
		JTextField blank5 = new JTextField();
		northLeftText.setFont(northSouthFont);
		northLeftText.setText("     Nombre del Club: "+myClub.getClubName());
		northRightText.setFont(northSouthFont);
		northRightText.setText("Dinero disponible: "+myClub.getFormatMoney()+"€     ");
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
		center.add(createEastLabels());
		center.add(createCenterButtons());
		center.add(createWestLabels());
		add(center,BorderLayout.CENTER);
	}
	public JPanel createEastLabels() {
		JPanel east = new JPanel(new GridLayout(13,1));
		JTextField blank = new JTextField();
		playerBought1.setFont(eastCenterFont);
		playerBought2.setFont(eastCenterFont);
		playerBought3.setFont(eastCenterFont);
		playerBought4.setFont(eastCenterFont);
		playerBought5.setFont(eastCenterFont);
		playerBought6.setFont(eastCenterFont);
		playerBought7.setFont(eastCenterFont);
		playerBought8.setFont(eastCenterFont);
		playerBought9.setFont(eastCenterFont);
		playerBought10.setFont(eastCenterFont);
		playerBought11.setFont(eastCenterFont);
		initBlank(playerBought1);
		initBlank(playerBought2);
		initBlank(playerBought3);
		initBlank(playerBought4);
		initBlank(playerBought5);
		initBlank(playerBought6);
		initBlank(playerBought7);
		initBlank(playerBought8);
		initBlank(playerBought9);
		initBlank(playerBought10);
		initBlank(playerBought11);
		initBlank(blank);
		east.add(playerBought1);
		east.add(playerBought2);
		east.add(playerBought3);
		east.add(playerBought4);
		east.add(playerBought5);
		east.add(playerBought6);
		east.add(playerBought7);
		east.add(playerBought8);
		east.add(playerBought9);
		east.add(playerBought10);
		east.add(playerBought11);
		east.add(blank);
		east.setBorder(new TitledBorder("Plantilla"));
		return east;
	}
	public JPanel createWestLabels() {
		JPanel west = new JPanel(new GridLayout(26,1));
		playerAvaliable1.setFont(westCenterFont);
		playerAvaliable2.setFont(westCenterFont);
		playerAvaliable3.setFont(westCenterFont);
		playerAvaliable4.setFont(westCenterFont);
		playerAvaliable5.setFont(westCenterFont);
		playerAvaliable6.setFont(westCenterFont);
		playerAvaliable7.setFont(westCenterFont);
		playerAvaliable8.setFont(westCenterFont);
		playerAvaliable9.setFont(westCenterFont);
		playerAvaliable10.setFont(westCenterFont);
		playerAvaliable11.setFont(westCenterFont);
		playerAvaliable12.setFont(westCenterFont);
		playerAvaliable13.setFont(westCenterFont);
		playerAvaliable14.setFont(westCenterFont);
		playerAvaliable15.setFont(westCenterFont);
		playerAvaliable16.setFont(westCenterFont);
		playerAvaliable17.setFont(westCenterFont);
		playerAvaliable18.setFont(westCenterFont);
		playerAvaliable19.setFont(westCenterFont);
		playerAvaliable20.setFont(westCenterFont);
		playerAvaliable21.setFont(westCenterFont);
		playerAvaliable22.setFont(westCenterFont);
		playerAvaliable23.setFont(westCenterFont);
		playerAvaliable24.setFont(westCenterFont);
		playerAvaliable25.setFont(westCenterFont);
		initBlank(playerAvaliable1);
		initBlank(playerAvaliable2);
		initBlank(playerAvaliable3);
		initBlank(playerAvaliable4);
		initBlank(playerAvaliable5);
		initBlank(playerAvaliable6);
		initBlank(playerAvaliable7);
		initBlank(playerAvaliable8);
		initBlank(playerAvaliable9);
		initBlank(playerAvaliable10);
		initBlank(playerAvaliable11);
		initBlank(playerAvaliable12);
		initBlank(playerAvaliable13);
		initBlank(playerAvaliable14);
		initBlank(playerAvaliable15);
		initBlank(playerAvaliable16);
		initBlank(playerAvaliable17);
		initBlank(playerAvaliable18);
		initBlank(playerAvaliable19);
		initBlank(playerAvaliable20);
		initBlank(playerAvaliable21);
		initBlank(playerAvaliable22);
		initBlank(playerAvaliable23);
		initBlank(playerAvaliable24);
		initBlank(playerAvaliable25);
		west.add(playerAvaliable1);
		west.add(playerAvaliable2);
		west.add(playerAvaliable3);
		west.add(playerAvaliable4);
		west.add(playerAvaliable5);
		west.add(playerAvaliable6);
		west.add(playerAvaliable7);
		west.add(playerAvaliable8);
		west.add(playerAvaliable9);
		west.add(playerAvaliable10);
		west.add(playerAvaliable11);
		west.add(playerAvaliable12);
		west.add(playerAvaliable13);
		west.add(playerAvaliable14);
		west.add(playerAvaliable15);
		west.add(playerAvaliable16);
		west.add(playerAvaliable17);
		west.add(playerAvaliable18);
		west.add(playerAvaliable19);
		west.add(playerAvaliable20);
		west.add(playerAvaliable21);
		west.add(playerAvaliable22);
		west.add(playerAvaliable23);
		west.add(playerAvaliable24);
		west.add(playerAvaliable25);
		west.setBorder(new TitledBorder("Jugadores Disponibles"));
		return west;
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
		initBlank(lastAction);
		initBlank(actionDone);
		initBlank(cuantityAction);
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
		centerButtons.add(lastAction);
		centerButtons.add(actionDone);
		centerButtons.add(cuantityAction);
		centerButtons.add(blank15);
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
		JTextField blank5 = new JTextField();
		JTextField blank4 = new JTextField();
		JTextField blank = new JTextField();
		JTextField blank2 = new JTextField();
		JTextField blank3 = new JTextField();
		initBlank(blank5);
		initBlank(blank4);
		initBlank(blank);
		initBlank(blank2);
		initBlank(blank3);
		south.add(blank);
		south.add(blank2);
		south.add(blank3);
		south.add(blank5);
		south.add(blank4);
		add(south,BorderLayout.SOUTH);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int index;
		if(e.getSource()==buyButton) {
			index=Integer.parseInt(JOptionPane.showInputDialog("Inserta el número del jugador que quieres comprar"));
			if(index>avaliablePlayers.size() || (index-1)<0) {
				JOptionPane.showMessageDialog(null, "No existe el jugador "+(index)+" en el mercado");
			}
			if(avaliablePlayers.get(index-1).getValue()<myClub.getClubMoney()) {
				if(boughtPlayers.size()<12) {
					myClub.buyPlayer(avaliablePlayers.get(index-1).getValue());
					northRightText.setText("Dinero disponible: "+myClub.getFormatMoney()+"€     ");
					boughtPlayers.add(avaliablePlayers.get(index-1));
					avaliablePlayers.remove(index-1);
					resetAvaliablePlayers();
					fillBoughtPlayers();
					fillAvaliablePlayers();
				} else {
					JOptionPane.showMessageDialog(null, "Tu plantilla está llena");
				}
			} else {
				JOptionPane.showMessageDialog(null, "No tienes suficiente dinero para comprar a ");
			}
		} 
		if(e.getSource()==sellButton) {
			if(boughtPlayers.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Tu plantilla está vacía");
			} else {
				index=Integer.parseInt(JOptionPane.showInputDialog("Inserta el número del jugador que quieres vender"));
				if(index>boughtPlayers.size() || index<0) {
					JOptionPane.showMessageDialog(null, "No existe el jugador "+(index)+" en tu plantilla");
				}
				myClub.sellPlayer(boughtPlayers.get(index-1).getValue());
				northRightText.setText("Dinero disponible: "+myClub.getFormatMoney()+"€     ");
				avaliablePlayers.add(boughtPlayers.get(index-1));
				boughtPlayers.remove(index-1);
				resetBoughtPlayers();
				fillAvaliablePlayers();
				fillBoughtPlayers();
			}
		} 
		if(e.getSource()==infoButton) {
			resetInfoFrame();
			fillInfoFrame();
			infoFrame.setVisible(true);
		} 
		if(e.getSource()==helpButton) {
			helpFrame.setVisible(true);
		} 
		if(e.getSource()==exitButton) {
			System.exit(0);
		} 
		if(e.getSource()==exitInfoButton) {
			infoFrame.setVisible(false);
		}
		if(e.getSource()==exitHelpButton) {
			helpFrame.setVisible(false);
		}
	}
	public void fillAvaliable() {
		for(int i=0;i<25;i++) {
			avaliablePlayers.add(new Player());
		}
	}
	public void fillAvaliablePlayers() {
		if(avaliablePlayers.size()>0) {
			playerAvaliable1.setText("1. "+avaliablePlayers.get(0).getPosition()+"   "+avaliablePlayers.get(0).getName()+"   "+avaliablePlayers.get(0).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>1) {
			playerAvaliable2.setText("2. "+avaliablePlayers.get(1).getPosition()+"   "+avaliablePlayers.get(1).getName()+"   "+avaliablePlayers.get(1).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>2) {
			playerAvaliable3.setText("3. "+avaliablePlayers.get(2).getPosition()+"   "+avaliablePlayers.get(2).getName()+"   "+avaliablePlayers.get(2).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>3) {
			playerAvaliable4.setText("4. "+avaliablePlayers.get(3).getPosition()+"   "+avaliablePlayers.get(3).getName()+"   "+avaliablePlayers.get(3).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>4) {
			playerAvaliable5.setText("5. "+avaliablePlayers.get(4).getPosition()+"   "+avaliablePlayers.get(4).getName()+"   "+avaliablePlayers.get(4).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>5) {
			playerAvaliable6.setText("6. "+avaliablePlayers.get(5).getPosition()+"   "+avaliablePlayers.get(5).getName()+"   "+avaliablePlayers.get(5).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>6) {
			playerAvaliable7.setText("7. "+avaliablePlayers.get(6).getPosition()+"   "+avaliablePlayers.get(6).getName()+"   "+avaliablePlayers.get(6).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>7) {
			playerAvaliable8.setText("8. "+avaliablePlayers.get(7).getPosition()+"   "+avaliablePlayers.get(7).getName()+"   "+avaliablePlayers.get(7).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>8) {
			playerAvaliable9.setText("9. "+avaliablePlayers.get(8).getPosition()+"   "+avaliablePlayers.get(8).getName()+"   "+avaliablePlayers.get(8).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>9) {
			playerAvaliable10.setText("10. "+avaliablePlayers.get(9).getPosition()+"   "+avaliablePlayers.get(9).getName()+"   "+avaliablePlayers.get(9).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>10) {
			playerAvaliable11.setText("11. "+avaliablePlayers.get(10).getPosition()+"   "+avaliablePlayers.get(10).getName()+"   "+avaliablePlayers.get(10).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>11) {
			playerAvaliable12.setText("12. "+avaliablePlayers.get(11).getPosition()+"   "+avaliablePlayers.get(11).getName()+"   "+avaliablePlayers.get(11).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>12) {
			playerAvaliable13.setText("13. "+avaliablePlayers.get(12).getPosition()+"   "+avaliablePlayers.get(12).getName()+"   "+avaliablePlayers.get(12).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>13) {
			playerAvaliable14.setText("14. "+avaliablePlayers.get(13).getPosition()+"   "+avaliablePlayers.get(13).getName()+"   "+avaliablePlayers.get(13).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>14) {
			playerAvaliable15.setText("15. "+avaliablePlayers.get(14).getPosition()+"   "+avaliablePlayers.get(14).getName()+"   "+avaliablePlayers.get(14).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>15) {
			playerAvaliable16.setText("16. "+avaliablePlayers.get(15).getPosition()+"   "+avaliablePlayers.get(15).getName()+"   "+avaliablePlayers.get(15).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>16) {
			playerAvaliable17.setText("17. "+avaliablePlayers.get(16).getPosition()+"   "+avaliablePlayers.get(16).getName()+"   "+avaliablePlayers.get(16).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>17) {
			playerAvaliable18.setText("18. "+avaliablePlayers.get(17).getPosition()+"   "+avaliablePlayers.get(17).getName()+"   "+avaliablePlayers.get(17).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>18) {
			playerAvaliable19.setText("19. "+avaliablePlayers.get(18).getPosition()+"   "+avaliablePlayers.get(18).getName()+"   "+avaliablePlayers.get(18).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>19) {
			playerAvaliable20.setText("20. "+avaliablePlayers.get(19).getPosition()+"   "+avaliablePlayers.get(19).getName()+"   "+avaliablePlayers.get(19).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>20) {
			playerAvaliable21.setText("21. "+avaliablePlayers.get(20).getPosition()+"   "+avaliablePlayers.get(20).getName()+"   "+avaliablePlayers.get(20).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>21) {
			playerAvaliable22.setText("22. "+avaliablePlayers.get(21).getPosition()+"   "+avaliablePlayers.get(21).getName()+"   "+avaliablePlayers.get(21).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>22) {
			playerAvaliable23.setText("23. "+avaliablePlayers.get(22).getPosition()+"   "+avaliablePlayers.get(22).getName()+"   "+avaliablePlayers.get(22).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>23) {
			playerAvaliable24.setText("24. "+avaliablePlayers.get(23).getPosition()+"   "+avaliablePlayers.get(23).getName()+"   "+avaliablePlayers.get(23).getFormatValue()+" €");
		}
		if(avaliablePlayers.size()>24) {
			playerAvaliable25.setText("25. "+avaliablePlayers.get(24).getPosition()+"   "+avaliablePlayers.get(24).getName()+"   "+avaliablePlayers.get(24).getFormatValue()+" €");
		}
	}
	public void resetAvaliablePlayers() {
		playerAvaliable1.setText("");
		playerAvaliable2.setText("");
		playerAvaliable3.setText("");
		playerAvaliable4.setText("");
		playerAvaliable5.setText("");
		playerAvaliable6.setText("");
		playerAvaliable7.setText("");
		playerAvaliable8.setText("");
		playerAvaliable9.setText("");
		playerAvaliable10.setText("");
		playerAvaliable11.setText("");
		playerAvaliable12.setText("");
		playerAvaliable13.setText("");
		playerAvaliable14.setText("");
		playerAvaliable15.setText("");
		playerAvaliable16.setText("");
		playerAvaliable17.setText("");
		playerAvaliable18.setText("");
		playerAvaliable19.setText("");
		playerAvaliable20.setText("");
		playerAvaliable21.setText("");
		playerAvaliable22.setText("");
		playerAvaliable23.setText("");
		playerAvaliable24.setText("");
		playerAvaliable25.setText("");
	}
	public void fillBoughtPlayers() {
		if(boughtPlayers.size()>0) {
			playerBought1.setText("1. "+boughtPlayers.get(0).getPosition()+"   "+boughtPlayers.get(0).getName()+"   "+boughtPlayers.get(0).getFormatValue()+" €");
		}
		if(boughtPlayers.size()>1) {
			playerBought2.setText("2. "+boughtPlayers.get(1).getPosition()+"   "+boughtPlayers.get(1).getName()+"   "+boughtPlayers.get(1).getFormatValue()+" €");
		}
		if(boughtPlayers.size()>2) {
			playerBought3.setText("3. "+boughtPlayers.get(2).getPosition()+"   "+boughtPlayers.get(2).getName()+"   "+boughtPlayers.get(2).getFormatValue()+" €");
		}
		if(boughtPlayers.size()>3) {
			playerBought4.setText("4. "+boughtPlayers.get(3).getPosition()+"   "+boughtPlayers.get(3).getName()+"   "+boughtPlayers.get(3).getFormatValue()+" €");
		}
		if(boughtPlayers.size()>4) {
			playerBought5.setText("5. "+boughtPlayers.get(4).getPosition()+"   "+boughtPlayers.get(4).getName()+"   "+boughtPlayers.get(4).getFormatValue()+" €");
		}
		if(boughtPlayers.size()>5) {
			playerBought6.setText("6. "+boughtPlayers.get(5).getPosition()+"   "+boughtPlayers.get(5).getName()+"   "+boughtPlayers.get(5).getFormatValue()+" €");
		}
		if(boughtPlayers.size()>6) {
			playerBought7.setText("7. "+boughtPlayers.get(6).getPosition()+"   "+boughtPlayers.get(6).getName()+"   "+boughtPlayers.get(6).getFormatValue()+" €");
		}
		if(boughtPlayers.size()>7) {
			playerBought8.setText("8. "+boughtPlayers.get(7).getPosition()+"   "+boughtPlayers.get(7).getName()+"   "+boughtPlayers.get(7).getFormatValue()+" €");
		}
		if(boughtPlayers.size()>8) {
			playerBought9.setText("9. "+boughtPlayers.get(8).getPosition()+"   "+boughtPlayers.get(8).getName()+"   "+boughtPlayers.get(8).getFormatValue()+" €");
		}
		if(boughtPlayers.size()>9) {
			playerBought10.setText("10. "+boughtPlayers.get(9).getPosition()+"   "+boughtPlayers.get(9).getName()+"   "+boughtPlayers.get(9).getFormatValue()+" €");
		}
		if(boughtPlayers.size()>10) {
			playerBought11.setText("11. "+boughtPlayers.get(10).getPosition()+"   "+boughtPlayers.get(10).getName()+"   "+boughtPlayers.get(10).getFormatValue()+" €");
		}
	}
	public void resetBoughtPlayers() {
		playerBought1.setText("");
		playerBought2.setText("");
		playerBought3.setText("");
		playerBought4.setText("");
		playerBought5.setText("");
		playerBought6.setText("");
		playerBought7.setText("");
		playerBought8.setText("");
		playerBought9.setText("");
		playerBought10.setText("");
		playerBought11.setText("");
	}
	public void initInfoFrame() {
		infoFrame.setSize(WIDTH/4, (int) (HEIGHT*0.99));
		infoFrame.setLocationRelativeTo(null);
		infoFrame.setUndecorated(true);
		infoFrame.setLayout(new GridLayout(9,1));
		initBlank(info1);
		initBlank(info2);
		initBlank(info3);
		initBlank(info4);
		initBlank(info5);
		initBlank(info6);
		initBlank(info7);
		initBlank(info8);
		info1.setFont(infoFont);
		info2.setFont(infoFont2);
		info3.setFont(infoFont2);
		info4.setFont(infoFont2);
		info5.setFont(infoFont2);
		info6.setFont(infoFont2);
		info7.setFont(infoFont2);
		info8.setFont(infoFont2);
		exitInfoButton.setFont(infoFont2);
		exitInfoButton.addActionListener(this);
		infoFrame.add(info1);
		infoFrame.add(info2);
		infoFrame.add(info3);
		infoFrame.add(info4);
		infoFrame.add(info5);
		infoFrame.add(info6);
		infoFrame.add(info7);
		infoFrame.add(info8);
		infoFrame.add(exitInfoButton);
	}
	public void fillInfoFrame() {
		int list=0;
		int index=0;
		boolean error=true;
		while(error) {
			list=Integer.parseInt(JOptionPane.showInputDialog("¿Quieres información de un jugador del club o de un jugador del mercado?\n1=Club          2=Mercado"));
			if(list>2 || list<1) {
				JOptionPane.showMessageDialog(null,"Inserta 1 o 2 porfavor");
			}
			else if(list==1 && boughtPlayers.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Tu plantilla está vacía");
				list=0;
			} else {
				error=false;
				if(error==false) {
					index=Integer.parseInt(JOptionPane.showInputDialog("Inserta el número del jugador para ver su información"));
					while(list==1 && (index>boughtPlayers.size() || index<1)) {
						JOptionPane.showMessageDialog(null, "No existe el jugador "+(index)+" en tu plantilla");
						index=Integer.parseInt(JOptionPane.showInputDialog("Inserta el número del jugador para ver su información"));
					}
					while(list==2 && (index>avaliablePlayers.size() || index<1)) {
						JOptionPane.showMessageDialog(null, "No existe el jugador "+(index)+" en el mercado");
						index=Integer.parseInt(JOptionPane.showInputDialog("Inserta el número del jugador para ver su información"));
					}
				}
			}
		}
		if(list==1) {
			info1.setText("Jugador: "+boughtPlayers.get(index-1).getName());
			if(avaliablePlayers.get(index-1).getPosition().equalsIgnoreCase("POR")) {
				info2.setText("ESTIRADA: "+boughtPlayers.get(index-1).getSkills(0));
				info3.setText("PARADAS: "+boughtPlayers.get(index-1).getSkills(1));
				info4.setText("REFLEJOS: "+boughtPlayers.get(index-1).getSkills(2));
				info5.setText("VELOCIDAD: "+boughtPlayers.get(index-1).getSkills(3));
				info6.setText("SAQUE: "+boughtPlayers.get(index-1).getSkills(4));
				info7.setText("POSICIONAMIENTO: "+boughtPlayers.get(index-1).getSkills(5));
				info8.setText("MEDIA: "+boughtPlayers.get(index-1).getAvg());
			} else {
				info2.setText("RITMO: "+boughtPlayers.get(index-1).getSkills(0));
				info3.setText("TIRO: "+boughtPlayers.get(index-1).getSkills(1));
				info4.setText("PASE: "+boughtPlayers.get(index-1).getSkills(2));
				info5.setText("REGATE: "+boughtPlayers.get(index-1).getSkills(3));
				info6.setText("DEFENSA: "+boughtPlayers.get(index-1).getSkills(4));
				info7.setText("FÍSICO: "+boughtPlayers.get(index-1).getSkills(5));
				info8.setText("MEDIA: "+boughtPlayers.get(index-1).getAvg());
			}
		} if(list==2) {
			info1.setText("Jugador: "+avaliablePlayers.get(index-1).getName());
			if(avaliablePlayers.get(index-1).getPosition().equalsIgnoreCase("POR")) {
				info2.setText("ESTIRADA: "+avaliablePlayers.get(index-1).getSkills(0));
				info3.setText("PARADAS: "+avaliablePlayers.get(index-1).getSkills(1));
				info4.setText("REFLEJOS: "+avaliablePlayers.get(index-1).getSkills(2));
				info5.setText("VELOCIDAD: "+avaliablePlayers.get(index-1).getSkills(3));
				info6.setText("SAQUE: "+avaliablePlayers.get(index-1).getSkills(4));
				info7.setText("POSICIONAMIENTO: "+avaliablePlayers.get(index-1).getSkills(5));
				info8.setText("MEDIA: "+avaliablePlayers.get(index-1).getAvg());
			} else {
				info2.setText("RITMO: "+avaliablePlayers.get(index-1).getSkills(0));
				info3.setText("TIRO: "+avaliablePlayers.get(index-1).getSkills(1));
				info4.setText("PASE: "+avaliablePlayers.get(index-1).getSkills(2));
				info5.setText("REGATE: "+avaliablePlayers.get(index-1).getSkills(3));
				info6.setText("DEFENSA: "+avaliablePlayers.get(index-1).getSkills(4));
				info7.setText("FÍSICO: "+avaliablePlayers.get(index-1).getSkills(5));
				info8.setText("MEDIA: "+avaliablePlayers.get(index-1).getAvg());
			}
		}
	}
	public void resetInfoFrame() {
		info1.setText("");
		info2.setText("");
		info3.setText("");
		info4.setText("");
		info5.setText("");
		info6.setText("");
		info7.setText("");
	}
	public void initHelpFrame() {
		String helpText=fillHelpText();
		helpFrame.setSize(WIDTH/4, (int) (HEIGHT*0.99));
		helpFrame.setLocationRelativeTo(null);
		helpFrame.setUndecorated(true);
		helpFrame.setLayout(new FlowLayout());
		help.setEditable(false);
		help.setBackground(this.getBackground());
		help.setBorder(null);
		help.setText(helpText);
		exitHelpButton.setSize(WIDTH/4, (int) (HEIGHT*0.20));
		exitHelpButton.addActionListener(this);
		helpFrame.add(help);
		helpFrame.add(exitHelpButton);
	}
	public String fillHelpText() {
		String text="";
		String indentation="    ";
		String nextLine="\n"+indentation;
		text+=nextLine+"Bienvenido a la ayuda:";
		text+=nextLine+indentation+"Jugadores:";
		text+=nextLine+indentation+indentation+"Cada jugador tiene:";
		text+=nextLine+indentation+indentation+indentation+"- Identificador";
		text+=nextLine+indentation+indentation+indentation+"- Posición";
		text+=nextLine+indentation+indentation+indentation+"- Nombre y Apellidos";
		text+=nextLine+indentation+indentation+indentation+"- Precio";
		text+=nextLine+indentation+indentation+indentation+"- Variables (tiro, defensa, estirada...)";
		text+=nextLine+indentation+indentation+"Para comprar jugadores existe el botón de 'Comprar'";
		text+=nextLine+indentation+indentation+"Para vender jugadores 'Vender'";
		text+=nextLine+indentation+indentation+"Para ver las variables de cada jugador existe el botón de 'Info'";
		return text;
	}
}
