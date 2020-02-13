package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

import java.awt.BorderLayout;
import java.awt.Color;
<<<<<<< HEAD
import java.awt.FlowLayout;
=======
>>>>>>> 69ebc59edeaa73652b2cd9194538e5f9833f0fae
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

/*
 * Breve explicación de la interfaz, porque es un poco lío (la primera vez que hago algo con tantas cosas), lo siento de antemano
 * 
 * Cambié el fondo y demás pero JPanel y sus bugs me hacían la vida imposible, por lo que lo tuve que dejar como está :C
 * 
 * Los JTextField vacíos los uso para dar el formato que quiero a los paneles (colocación,tamaños...)
 * 
 * Divido el JFrame en paneles:
 * 		- Norte, incluye:
 * 			- 1 JTextField con Nombre del club + 2 JTextField vacíos + 1 JTextField con Dinero disponible + 3 JTextField vacíos 
 * 
 * 		- Centro, incluye 3 paneles en otro panel contenedor:
 * 			Panel 1 (Plantilla) ---------> Centro/Este incluye: 11 JTextField con los nombres de la plantilla + 1 JTextField vacío  
 * 			Panel 2 (Botones) -----------> Centro/Centro incluye: 4 JTextField vacíos + 1 Botón (comprar) + 2 JTextField + 1 Botón (vender) + 
 * 												5 JTextField vacíos + 1 Botón (info) + 2 JTextField vacíos + 3 JTextField con la última acción +
 * 												1 JTextField vacío +  1 Botón (salir) 
 * 			Panel 3 (Jugadores libres) --> Centro/Oeste incluye: 25 JTextField con los nombres de los jugadores libres
 * 
 *      - Sur, incluye: 
 *      	- 5 JTextField vacíos
 *      
 *      JFrame
 *      ------------------------------------------------------------------------------------------------------------------------------------------
 *     |   Nombre Club                     |                                  |                                 |     Dinero                      |
 * 	   |------------------------------------------------------------------------------------------------------------------------------------------|
 *     |                                   |                                  |                                 |                                 |
 *     |------------------------------------------------------------------------------------------------------------------------------------------|
 *     | Plantilla                                          | Botones   |           |          | Jugadores Libres                                 |
 *     |                                                    |           |           |          |                                                  |
 *     |                                                    |-----------|-----------|----------|                                                  |
 *     |                                                    |           |  Comprar  |          |                                                  |
 *     |                                                    |           |           |          |                                                  |
 *     |                                                    |-----------|-----------|----------|                                                  |
 *     |                                                    |           |  Vender   |          |                                                  |
 *     |                                                    |           |           |          |                                                  |
 *     |                                                    |-----------|-----------|----------|                                                  |
 *     |                                                    |           |           |          |                                                  |
 *     |                                                    |           |           |          |                                                  |
 *     |                                                    |-----------|-----------|----------|                                                  |
 *     |                                                    |           |   Info    |          |                                                  |
 *     |                                                    |           |           |          |                                                  |
 *     |                                                    |-----------|-----------|----------|                                                  |
 *     |                                                    |           |  Ayuda    |          |                                                  |
 *     |                                                    |           |           |          |                                                  |
 *     |                                                    |-----------|-----------|----------|                                                  |
 *     |                                                    | Compra o  | Jugador   | Cantidad |                                                  |
 *     |                                                    |  Venta    |           |          |                                                  |
 *     |                                                    |-----------|-----------|----------|                                                  |
 *     |                                                    |           |  Salir    |          |                                                  |
 *     |                                                    |           |           |          |                                                  |
 *     |------------------------------------------------------------------------------------------------------------------------------------------|
 *     |                                   |                                  |                                 |                                 |
 * 	   |------------------------------------------------------------------------------------------------------------------------------------------|
 *     |                                   |                                  |                                 |                                 |
 *      ------------------------------------------------------------------------------------------------------------------------------------------
 *      
 *      
 *      Coloco antes el código con más chicha y después lo de los gráficos
 *      RECOMIENDO PLEGAR TODOS LOS MÉTODOS CON EL SÍMBOLO DE "-" Y 
 *      	DESPUÉS IR MIRANDO 1 A 1 LAS FUNCIONALIDADES
 */

public class Ex4Graphics extends JFrame implements ActionListener {
	private static final int HEIGHT = (int) (Toolkit.getDefaultToolkit().getScreenSize().height); //Obtiene el alto de la pantalla
	private static final int WIDTH = (int) (Toolkit.getDefaultToolkit().getScreenSize().width);   //Obtiene el ancho de la pantalla
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
	String verdana="Verdana";
	private Font northSouthFont = new Font(verdana, Font.BOLD, WIDTH/70);
	private Font eastCenterFont = new Font(verdana, Font.BOLD, WIDTH/90);
	private Font westCenterFont = new Font(verdana, Font.BOLD, WIDTH/110);
	private Font infoFont = new Font(verdana, Font.BOLD, WIDTH/80);
	private Font infoFont2 = new Font(verdana, Font.BOLD, WIDTH/60);
	private Font centerButtonFont = new Font(verdana, Font.BOLD, WIDTH/70);
	private Font helpFont = new Font(verdana, Font.BOLD, WIDTH/90);
	private ArrayList<Player> boughtPlayers = new ArrayList<Player>(); 
	private ArrayList<Player> avaliablePlayers = new ArrayList<Player>(); 
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
	Club myClub = new Club();
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
	String dontExist="No existe el jugador ";
	String insert="Inserta el número del jugador para ver su información";
	String avg="MEDIA: ";
	String moneyAvaliable="Dinero disponible: ";
	String moneySymbol="€";
	CustomBackGround bg = new CustomBackGround();
	Color transparent = new Color(255,255,255,0);
	public Ex4Graphics() {
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setExtendedState(MAXIMIZED_BOTH);
		bg.setLayout(new BorderLayout());
		add(bg);
=======
	private Font northFont = new Font("Verdana", Font.BOLD, WIDTH/120);        //Crea las fuentes Verdana,negrita,tamaños diferentes adaptados a la pantalla
	private Font eastCenterFont = new Font("Verdana", Font.BOLD, WIDTH/90); 
	private Font westCenterFont = new Font("Verdana", Font.BOLD, WIDTH/150);
	private Font infoFont = new Font("Verdana", Font.BOLD, WIDTH/80); 
	private Font infoFont2 = new Font("Verdana", Font.BOLD, WIDTH/60); 
	private Font helpFont = new Font("Verdana", Font.BOLD, WIDTH/90);
	private Font centerButtonFont = new Font("Verdana", Font.BOLD, WIDTH/70); 
	private Color buttonColor = new Color(84,201,71);                          //Crea un color para los botones
	ArrayList<Player> boughtPlayers = new ArrayList<Player>();                 //El ArrayList donde se guardan los jugadores de la plantilla
	ArrayList<Player> avaliablePlayers = new ArrayList<Player>();              //El ArrayList donde se guardan los jugadores del mercado
	Club myClub = new Club();                                                  //Crea un club nuevo
	JFrame infoFrame = new JFrame();                                           //Crea un JFrame para la información de los jugadores
	JFrame helpFrame = new JFrame();                                           //Crea un JFrame para la ayuda
	String lastActionText = "   Última acción:";                               //Creo esta variable, ya que la voy a usar varias veces y me ahorra tiempo y fallos
	String playerActionText = "del jugador: ";                                 //Creo esta variable, ya que la voy a usar varias veces y me ahorra tiempo y fallos
	String moneyActionText = "por el valor de: ";                              //Creo esta variable, ya que la voy a usar varias veces y me ahorra tiempo y fallos
	JButton buyButton = new JButton("Comprar");                                //Crea el botón de comprar
	JButton sellButton = new JButton("Vender");                                //Crea el botón de vender
	JButton infoButton = new JButton("Info");                                  //Crea el botón de info
	JButton helpButton = new JButton("Ayuda");                                 //Crea el botón de ayuda
	JButton exitButton = new JButton("Salir");                                 //Crea el botón de salir
	JButton exitInfoButton = new JButton("Volver al mercado");                 //Crea el botón de volver al mercado del JFrame de info
	JButton exitHelpButton = new JButton("Volver al mercado");                 //Crea el botón de volver al mercado del JFrame de ayuda
	JTextField lastAction = new JTextField();	        //Crea el JTextField para poner la última acción realizada		
	JTextField playerAction = new JTextField();         //Crea el JTextField para poner el jugador que se ha comprado/vendido
	JTextField moneyAction = new JTextField();          //Crea el JTextField para poner por cuanto dinero se ha comprado/vendido
	JTextField northLeftText = new JTextField();        //Crea el JTextField para poner el nombre del club
	JTextField northRightText = new JTextField();       //Crea el JTextField para poner el dinero del club
	JTextField playerBought1 = new JTextField();        //Crea los JTextField para poner los jugadores de la plantilla 
	JTextField playerBought2 = new JTextField();        //Plantilla
	JTextField playerBought3 = new JTextField();        //Plantilla
	JTextField playerBought4 = new JTextField();        //Plantilla
	JTextField playerBought5 = new JTextField();        //Plantilla
	JTextField playerBought6 = new JTextField();        //Plantilla
	JTextField playerBought7 = new JTextField();        //Plantilla
	JTextField playerBought8 = new JTextField();        //Plantilla
	JTextField playerBought9 = new JTextField();        //Plantilla
	JTextField playerBought10 = new JTextField();       //Plantilla
	JTextField playerBought11 = new JTextField();       //Plantilla
	JTextField playerAvaliable1 = new JTextField();     //Crea los JTextField para poner los jugadores del mercado
	JTextField playerAvaliable2 = new JTextField();     //Mercado
	JTextField playerAvaliable3 = new JTextField();     //Mercado
	JTextField playerAvaliable4 = new JTextField();     //Mercado
	JTextField playerAvaliable5 = new JTextField();     //Mercado
	JTextField playerAvaliable6 = new JTextField();     //Mercado
	JTextField playerAvaliable7 = new JTextField();     //Mercado
	JTextField playerAvaliable8 = new JTextField();     //Mercado
	JTextField playerAvaliable9 = new JTextField();     //Mercado
	JTextField playerAvaliable10 = new JTextField();    //Mercado
	JTextField playerAvaliable11 = new JTextField();    //Mercado
	JTextField playerAvaliable12 = new JTextField();    //Mercado
	JTextField playerAvaliable13 = new JTextField();    //Mercado
	JTextField playerAvaliable14 = new JTextField();    //Mercado
	JTextField playerAvaliable15 = new JTextField();    //Mercado
	JTextField playerAvaliable16 = new JTextField();    //Mercado
	JTextField playerAvaliable17 = new JTextField();    //Mercado
	JTextField playerAvaliable18 = new JTextField();    //Mercado
	JTextField playerAvaliable19 = new JTextField();    //Mercado
	JTextField playerAvaliable20 = new JTextField();    //Mercado
	JTextField playerAvaliable21 = new JTextField();    //Mercado
	JTextField playerAvaliable22 = new JTextField();    //Mercado
	JTextField playerAvaliable23 = new JTextField();    //Mercado
	JTextField playerAvaliable24 = new JTextField();    //Mercado
	JTextField playerAvaliable25 = new JTextField();    //Mercado
	JTextField info1 = new JTextField();        //Crea los JTextField para poner las habilidades  de los jugadores 
	JTextField info2 = new JTextField();        //Habilidad
	JTextField info3 = new JTextField();        //Habilidad        
	JTextField info4 = new JTextField();        //Habilidad
	JTextField info5 = new JTextField();        //Habilidad
	JTextField info6 = new JTextField();        //Habilidad
	JTextField info7 = new JTextField();        //Habilidad
	JTextField info8 = new JTextField();        //Habilidad
	JTextArea help = new JTextArea();    //Crea el JTextField para poner el texto de ayuda 
	
	public Ex4Graphics() { //Inicializa el JFrame principal
		setLocationRelativeTo(null); //Lo centra en pantalla
		setLayout(new BorderLayout()); //Le da el layout 
		setUndecorated(true); //Quita el título y los botones
		setExtendedState(MAXIMIZED_BOTH); //Lo extiende a pantalla completa
>>>>>>> 69ebc59edeaa73652b2cd9194538e5f9833f0fae
	}
	public void initBlank(JTextField field) { //Inicializa los JTextField completamente transparentes
		field.setEditable(false);
		field.setBackground(transparent);
		field.setBorder(null);
		field.setForeground(Color.YELLOW);
	}
	@Override
	public void actionPerformed(ActionEvent e) { //Es el ActionListener de la clase
		if(e.getSource()==buyButton) { //Si se pulsa el botón de comprar
			buyPlayer(); //Se compra el jugador (o no, mas adelante se explica)
		} 
		if(e.getSource()==sellButton) { //Si se pulsa el botón de vender 
			sellPlayer(); //Se vende el jugador (o no, mas adelante se explica) 
		} 
		if(e.getSource()==infoButton) { //Si se pulsa el botón de info
			fillInfoFrame();  //Se llena el JFrame con la info del jugador en cuestión
			infoFrame.setVisible(true); //Se muestra el JFrame de la info
		} 
		if(e.getSource()==helpButton) { //Si se pulsa el botón de ayuda 
			helpFrame.setVisible(true); //Se muestra el JFrame de la ayuda
		} 
		if(e.getSource()==exitButton) { //Si se pulsa el botón de salir 
			JOptionPane.showMessageDialog(null, "Ha seleccionado salir, el programa se apagará"); //Se informa al usuario que va a apagarse el sistema
			System.exit(0); //Se apaga el sistema (aplicación)
		} 
		if(e.getSource()==exitInfoButton) { //Si se pulsa el botón de volver en el JFrame de info 
			infoFrame.setVisible(false); //Se oculta el JFrame de info
		}
		if(e.getSource()==exitHelpButton) { //Si se pulsa el botón de volver en el JFrame de info
			helpFrame.setVisible(false); //Se oculta el JFrame de ayuda
		}
	}
	public void buyPlayer() { //Permite comprar jugadores
		int index;
		index=Integer.parseInt(JOptionPane.showInputDialog("Inserta el número del jugador que quieres comprar")); //Pide el jugador a comprar
		if(index>avaliablePlayers.size() || (index-1)<0) {														  //Si no existe da error
			JOptionPane.showMessageDialog(null, "No existe el jugador "+(index)+" en el mercado");                //ERROR Jugador Inexistente
		}
		if(avaliablePlayers.get(index-1).getValue()<myClub.getClubMoney()) {                                      //Si te puedes permitir comprar el jugador
			if(boughtPlayers.size()<12) {                                                                         //Y si la plantilla no está llena
				myClub.buyPlayer(avaliablePlayers.get(index-1).getValue()); //Resta el dinero
				northRightText.setText("Dinero disponible: "+myClub.getFormatMoney()+"€     "); //Cambia el dinero disponible
				boughtPlayers.add(avaliablePlayers.get(index-1)); //Añade el jugador a la plantilla
				lastAction.setText(lastActionText+"   Compra"); //Actualiza el lastAction
				playerAction.setText(playerActionText+avaliablePlayers.get(index-1).getName()); //Actualiza el lastAction
				moneyAction.setText(moneyActionText+avaliablePlayers.get(index-1).getFormatValue()+"€"); //Actualiza el lastAction
				avaliablePlayers.remove(index-1); //Borra el jugador de disponibles
				fillBoughtPlayers();     //LLena los JTextFields de la plantilla para actualizar la compra
				fillAvaliablePlayers();  //LLena los JTextFields del mercado para actualizar la compra
				JOptionPane.showMessageDialog(null, "Se ha comprado a "+boughtPlayers.get(0).getName()+" por "+boughtPlayers.get(0).getFormatValue()+"€");
			} else {
				JOptionPane.showMessageDialog(null, "Tu plantilla está llena");                                    //ERROR Plantilla llena 
			}
		} else {
			JOptionPane.showMessageDialog(null, "No tienes suficiente dinero para comprar a ");                    //ERROR Dinero insuficiente
		}
	}
	public void sellPlayer() { //Permite vender jugadores
		int index;
		if(boughtPlayers.isEmpty()) {                                                                                //Si la plantilla está vacía
			JOptionPane.showMessageDialog(null, "Tu plantilla está vacía");                                          //ERROR Plantilla Vacía
		} else {
			index=Integer.parseInt(JOptionPane.showInputDialog("Inserta el número del jugador que quieres vender")); //Pide el jugador a vender
			if(index>boughtPlayers.size() || (index-1)<0) {															 //Si no existe da error
				JOptionPane.showMessageDialog(null, "No existe el jugador "+(index)+" en tu plantilla");             //ERROR
			}
			myClub.sellPlayer(boughtPlayers.get(index-1).getValue()); //Suma el dinero
			northRightText.setText("Dinero disponible: "+myClub.getFormatMoney()+"€     "); //Cambia el dinero disponible
			avaliablePlayers.add(boughtPlayers.get(index-1)); //Añade el jugador al mercado
			lastAction.setText(lastActionText+"   Venta"); //Actualiza el lastAction
			playerAction.setText(playerActionText+boughtPlayers.get(index-1).getName()); //Actualiza el lastAction
			moneyAction.setText(moneyActionText+boughtPlayers.get(index-1).getFormatValue()+"€"); //Actualiza el lastAction
			boughtPlayers.remove(index-1); //Borra el jugador de la plantilla
			fillAvaliablePlayers(); //LLena los JTextFields del mercado para actualizar la compra
			fillBoughtPlayers();    //LLena los JTextFields de la plantilla para actualizar la compra
			int selled = avaliablePlayers.size()-1;
			JOptionPane.showMessageDialog(null, "Se ha vendido a "+avaliablePlayers.get(selled).getName()+" por "+avaliablePlayers.get(selled).getFormatValue()+"€");
		}
	}
	public void fillAvaliable() { //Llena el ArrayList con 25 objetos de mi clase Player
		for(int i=0;i<25;i++) {
			avaliablePlayers.add(new Player());
		}
	}
	public void fillAvaliablePlayers() { //Simplemente resetea, da formato y llena los textos del mercado
		resetAvaliablePlayers();
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
	public void resetAvaliablePlayers() {  //Simplemente resetea los textos del mercado
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
	public void fillBoughtPlayers() {  //Simplemente resetea, da formato y llena los textos de la plantilla
		resetBoughtPlayers();
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
	public void resetBoughtPlayers() {  //Simplemente resetea los textos de la plantilla
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
	public void fillInfoFrame() { //Simplemente llena el texto de la info del jugador especificado
 		int list=0;
		int index=0;
		boolean error=true;
		while(error) {
			list=Integer.parseInt(JOptionPane.showInputDialog("¿Quieres información de un jugador del club o de un jugador del mercado?\n1=Club"
					+ "          2=Mercado")); //Saca un menú para elegir un jugador de entre los del mercado o los de la plantilla
			if(list>2 || list<1) { //Si la opción es incorrecta se pide insertar de nuevo
				JOptionPane.showMessageDialog(null,"Inserta 1 o 2 porfavor");
			}
			else if(list==1 && boughtPlayers.isEmpty()) { //Si se selecciona la plantilla vacía da error
				JOptionPane.showMessageDialog(null, "Tu plantilla está vacía");
				list=0;
			} else {
				error=false;
				if(error==false) { 
					index=Integer.parseInt(JOptionPane.showInputDialog("Inserta el número del jugador para ver su información"));
					//La línea de arriba pide el número del jugador
					while(list==1 && (index>boughtPlayers.size() || index<1)) { //Si el jugador de la plantilla no existe da error y pide un número de nuevo
						JOptionPane.showMessageDialog(null, "No existe el jugador "+(index)+" en tu plantilla");
						index=Integer.parseInt(JOptionPane.showInputDialog("Inserta el número del jugador para ver su información"));
					}
					while(list==2 && (index>avaliablePlayers.size() || index<1)) { //Si el jugador del mercado no existe da error y pide un número de nuevo
						JOptionPane.showMessageDialog(null, "No existe el jugador "+(index)+" en el mercado");
						index=Integer.parseInt(JOptionPane.showInputDialog("Inserta el número del jugador para ver su información"));
					}
				}
			}
		}
		if(list==1) { //Si el jugador existe en la plantilla llena sus estadísticas
			info1.setText("   Jugador: "+boughtPlayers.get(index-1).getName()+"  "+boughtPlayers.get(index-1).getPosition());
			if(boughtPlayers.get(index-1).getPosition().equalsIgnoreCase("POR")) { //Si es portero no tiene las mismas estadísticas que otros jugadores
				info2.setText("   ESTIRADA: "+boughtPlayers.get(index-1).getSkills(0));
				info3.setText("   PARADAS: "+boughtPlayers.get(index-1).getSkills(1));
				info4.setText("   REFLEJOS: "+boughtPlayers.get(index-1).getSkills(2));
				info5.setText("   VELOCIDAD: "+boughtPlayers.get(index-1).getSkills(3));
				info6.setText("   SAQUE: "+boughtPlayers.get(index-1).getSkills(4));
				info7.setText("   POSICIONAMIENTO: "+boughtPlayers.get(index-1).getSkills(5));
				info8.setText("   MEDIA: "+boughtPlayers.get(index-1).getAvg());
			} else {
				info2.setText("   RITMO: "+boughtPlayers.get(index-1).getSkills(0));
				info3.setText("   TIRO: "+boughtPlayers.get(index-1).getSkills(1));
				info4.setText("   PASE: "+boughtPlayers.get(index-1).getSkills(2));
				info5.setText("   REGATE: "+boughtPlayers.get(index-1).getSkills(3));
				info6.setText("   DEFENSA: "+boughtPlayers.get(index-1).getSkills(4));
				info7.setText("   FÍSICO: "+boughtPlayers.get(index-1).getSkills(5));
				info8.setText("   MEDIA: "+boughtPlayers.get(index-1).getAvg());
			}
		} if(list==2) { //Si el jugador existe en el mercado llena sus estadísticas
			info1.setText("   Jugador: "+avaliablePlayers.get(index-1).getName()+"  "+avaliablePlayers.get(index-1).getPosition());
			if(avaliablePlayers.get(index-1).getPosition().equalsIgnoreCase("POR")) { //Si es portero no tiene las mismas estadísticas que otros jugadores
				info2.setText("   ESTIRADA: "+avaliablePlayers.get(index-1).getSkills(0));
				info3.setText("   PARADAS: "+avaliablePlayers.get(index-1).getSkills(1));
				info4.setText("   REFLEJOS: "+avaliablePlayers.get(index-1).getSkills(2));
				info5.setText("   VELOCIDAD: "+avaliablePlayers.get(index-1).getSkills(3));
				info6.setText("   SAQUE: "+avaliablePlayers.get(index-1).getSkills(4));
				info7.setText("   POSICIONAMIENTO: "+avaliablePlayers.get(index-1).getSkills(5));
				info8.setText("   MEDIA: "+avaliablePlayers.get(index-1).getAvg());
			} else {
				info2.setText("   RITMO: "+avaliablePlayers.get(index-1).getSkills(0));
				info3.setText("   TIRO: "+avaliablePlayers.get(index-1).getSkills(1));
				info4.setText("   PASE: "+avaliablePlayers.get(index-1).getSkills(2));
				info5.setText("   REGATE: "+avaliablePlayers.get(index-1).getSkills(3));
				info6.setText("   DEFENSA: "+avaliablePlayers.get(index-1).getSkills(4));
				info7.setText("   FÍSICO: "+avaliablePlayers.get(index-1).getSkills(5));
				info8.setText("   MEDIA: "+avaliablePlayers.get(index-1).getAvg());
			}
		}
	}
	public String fillHelpText() { //Simplemente llena con formato el texto del JFrame de ayuda
		String text="";
		String nextLine="\n               ";
		text+=nextLine;
		text+=nextLine;
		text+=nextLine;
		text+=nextLine;
		text+=nextLine+"Bienvenido a la ayuda:";
		text+=nextLine;
		text+=nextLine+"Cada jugador tiene:";
		text+=nextLine+"- Identificador";
		text+=nextLine+"- Posición";
		text+=nextLine+"- Nombre y Apellidos";
		text+=nextLine+"- Precio";
		text+=nextLine+"- Variables (tiro, defensa, estirada...)";
		text+=nextLine;
		text+=nextLine+"Para comprar jugadores"+nextLine+"existe el botón de 'Comprar'";
		text+=nextLine;
		text+=nextLine+"Para vender jugadores"+nextLine+"existe el botón de 'Vender'";
		text+=nextLine;
		text+=nextLine+"Para ver las variables de cada"+nextLine+"jugador existe el botón de 'Info'";
		text+=nextLine;
		text+=nextLine;
		text+=nextLine;
		text+=nextLine;
		return text;
	}
    public void createNorth() { //Simplemente crea, da formato y añade el panel de arriba del todo
		JPanel north = new JPanel(new GridLayout(2,2));
		JTextField blank = new JTextField();
		JTextField blank2 = new JTextField();
		JTextField blank3 = new JTextField();
		JTextField blank4 = new JTextField();
		JTextField blank5 = new JTextField();
<<<<<<< HEAD
		northLeftText.setFont(northSouthFont);
		northLeftText.setText("Nombre del Club: "+myClub.getClubName());
		northRightText.setFont(northSouthFont);
		northRightText.setText(moneyAvaliable+myClub.getFormatMoney()+moneySymbol);
		northRightText.setHorizontalAlignment(SwingConstants.RIGHT);
=======
		northLeftText.setFont(northFont);
		northLeftText.setText("     Nombre del Club: "+myClub.getClubName());
		northRightText.setFont(northFont);
		northRightText.setText("Dinero disponible: "+myClub.getFormatMoney()+"€     ");
		northRightText.setHorizontalAlignment(SwingConstants.RIGHT); //Alinea el texto a la derecha
>>>>>>> 69ebc59edeaa73652b2cd9194538e5f9833f0fae
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
		north.setBackground(transparent);
		bg.add(north,BorderLayout.NORTH);
	}
	public void createCenter() {  //Simplemente crea, da formato y añade los paneles del medio
		JPanel center = new JPanel(new GridLayout(1,3));
		center.add(createEastLabels());
		center.add(createCenterButtons());
		center.add(createWestLabels());
		center.setBackground(transparent);
		bg.add(center,BorderLayout.CENTER);
	}
	public JPanel createEastLabels() {  //Simplemente crea, da formato y añade el panel de la plantilla
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
		east.setBackground(transparent);
		return east;
	}
	public JPanel createWestLabels() { //Simplemente crea, da formato y añade el panel del mercado
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
		west.setBackground(transparent);
		return west;
	}
	public JPanel createCenterButtons() { //Simplemente crea, da formato y añade el panel de los botones
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
		lastAction.setFont(westCenterFont);
		playerAction.setFont(westCenterFont);
		moneyAction.setFont(westCenterFont);
		setFormatButtons(buyButton);
		setFormatButtons(sellButton);
		setFormatButtons(infoButton);
		setFormatButtons(helpButton);
		setFormatButtons(exitButton);
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
		initBlank(playerAction);
		initBlank(moneyAction);
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
		centerButtons.add(playerAction);
		centerButtons.add(moneyAction);
		centerButtons.add(blank15);
		centerButtons.add(exitButton);
		buyButton.addActionListener(this);
		sellButton.addActionListener(this);
		infoButton.addActionListener(this);
		helpButton.addActionListener(this);
		exitButton.addActionListener(this);
		centerButtons.setBackground(transparent);
		return centerButtons;
	}
	public void createSouth() { //Simplemente crea, da formato y añade el panel de abajo del todo
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
		south.setBackground(transparent);
		bg.add(south,BorderLayout.SOUTH);
	}
<<<<<<< HEAD
	@Override
	public void actionPerformed(ActionEvent e) {
		int index;
		if(e.getSource()==buyButton) {
			index=Integer.parseInt(JOptionPane.showInputDialog("Inserta el número del jugador que quieres comprar"));
			buyAction(index);
		} 
		if(e.getSource()==sellButton) {
			if(boughtPlayers.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Tu plantilla está vacía");
			} else {
				index=Integer.parseInt(JOptionPane.showInputDialog("Inserta el número del jugador que quieres vender"));
				if(index>boughtPlayers.size() || index<0) {
					JOptionPane.showMessageDialog(null, dontExist+(index)+" en tu plantilla");
				}
				sellPlayer(index);
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
	private void buyAction(int index) {
		if(index>avaliablePlayers.size() || (index-1)<0) {
			JOptionPane.showMessageDialog(null, dontExist+(index)+" en el mercado");
		}
		if(avaliablePlayers.get(index-1).getValue()<myClub.getClubMoney()) {
			if(boughtPlayers.size()<12) {
				buyPlayer(index);
			} else {
				JOptionPane.showMessageDialog(null, "Tu plantilla está llena");
			}
		} else {
			JOptionPane.showMessageDialog(null, "No tienes suficiente dinero para comprar a "+avaliablePlayers.get(index-1).getName());
		}
	}
	private void sellPlayer(int index) {
		myClub.sellPlayer(boughtPlayers.get(index-1).getValue());
		northRightText.setText(moneyAvaliable+myClub.getFormatMoney()+moneySymbol);
		avaliablePlayers.add(boughtPlayers.get(index-1));
		boughtPlayers.remove(index-1);
		resetBoughtPlayers();
		fillAvaliablePlayers();
		fillBoughtPlayers();
	}
	private void buyPlayer(int index) {
		myClub.buyPlayer(avaliablePlayers.get(index-1).getValue());
		northRightText.setText(moneyAvaliable+myClub.getFormatMoney()+moneySymbol);
		boughtPlayers.add(avaliablePlayers.get(index-1));
		avaliablePlayers.remove(index-1);
		resetAvaliablePlayers();
		fillBoughtPlayers();
		fillAvaliablePlayers();
	}
	public void fillAvaliable() {
		for(int i=0;i<25;i++) {
			avaliablePlayers.add(new Player());
		}
	}
	public void fillAvaliablePlayers() {
		fillAvaliable1();
		fillAvaliable2();
		fillAvaliable3();
		fillAvaliable4();
		fillAvaliable5();
	}
	private void fillAvaliable5() {
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
	private void fillAvaliable4() {
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
	}
	private void fillAvaliable3() {
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
	}
	private void fillAvaliable2() {
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
	}
	private void fillAvaliable1() {
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
=======
	public void initInfoFrame() { //Simplemente da formato e inicializa el JFrame de la info de jugadores
		infoFrame.setSize(WIDTH/3, (int) (HEIGHT*0.99));
>>>>>>> 69ebc59edeaa73652b2cd9194538e5f9833f0fae
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
		setFormatButtons(exitInfoButton);
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
<<<<<<< HEAD
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
			}
		}
		index=Integer.parseInt(JOptionPane.showInputDialog(insert));
		index = checkExist(list, index);
		if(list==1) {
			info1.setText("Jugador: "+boughtPlayers.get(index-1).getName());
			if(boughtPlayers.get(index-1).getPosition().equalsIgnoreCase("POR")) {
				fillSkillsBoughtGK(index);
			} else {
				fillSkillsBought(index);
			}
		} if(list==2) {
			info1.setText("Jugador: "+avaliablePlayers.get(index-1).getName());
			if(avaliablePlayers.get(index-1).getPosition().equalsIgnoreCase("POR")) {
				fillSkillsAvaliableGK(index);
			} else {
				fillSkillsAvaliable(index);
			}
		}
	}
	private void fillSkillsAvaliable(int index) {
		info2.setText("RITMO: "+avaliablePlayers.get(index-1).getSkills(0));
		info3.setText("TIRO: "+avaliablePlayers.get(index-1).getSkills(1));
		info4.setText("PASE: "+avaliablePlayers.get(index-1).getSkills(2));
		info5.setText("REGATE: "+avaliablePlayers.get(index-1).getSkills(3));
		info6.setText("DEFENSA: "+avaliablePlayers.get(index-1).getSkills(4));
		info7.setText("FÍSICO: "+avaliablePlayers.get(index-1).getSkills(5));
		info8.setText(avg+avaliablePlayers.get(index-1).getAvg());
	}
	private void fillSkillsAvaliableGK(int index) {
		info2.setText("ESTIRADA: "+avaliablePlayers.get(index-1).getSkills(0));
		info3.setText("PARADAS: "+avaliablePlayers.get(index-1).getSkills(1));
		info4.setText("REFLEJOS: "+avaliablePlayers.get(index-1).getSkills(2));
		info5.setText("VELOCIDAD: "+avaliablePlayers.get(index-1).getSkills(3));
		info6.setText("SAQUE: "+avaliablePlayers.get(index-1).getSkills(4));
		info7.setText("POSICIONAMIENTO: "+avaliablePlayers.get(index-1).getSkills(5));
		info8.setText(avg+avaliablePlayers.get(index-1).getAvg());
	}
	private void fillSkillsBought(int index) {
		info2.setText("RITMO: "+boughtPlayers.get(index-1).getSkills(0));
		info3.setText("TIRO: "+boughtPlayers.get(index-1).getSkills(1));
		info4.setText("PASE: "+boughtPlayers.get(index-1).getSkills(2));
		info5.setText("REGATE: "+boughtPlayers.get(index-1).getSkills(3));
		info6.setText("DEFENSA: "+boughtPlayers.get(index-1).getSkills(4));
		info7.setText("FÍSICO: "+boughtPlayers.get(index-1).getSkills(5));
		info8.setText(avg+boughtPlayers.get(index-1).getAvg());
	}
	private void fillSkillsBoughtGK(int index) {
		info2.setText("ESTIRADA: "+boughtPlayers.get(index-1).getSkills(0));
		info3.setText("PARADAS: "+boughtPlayers.get(index-1).getSkills(1));
		info4.setText("REFLEJOS: "+boughtPlayers.get(index-1).getSkills(2));
		info5.setText("VELOCIDAD: "+boughtPlayers.get(index-1).getSkills(3));
		info6.setText("SAQUE: "+boughtPlayers.get(index-1).getSkills(4));
		info7.setText("POSICIONAMIENTO: "+boughtPlayers.get(index-1).getSkills(5));
		info8.setText(avg+boughtPlayers.get(index-1).getAvg());
	}
	private int checkExist(int list, int index) {
		while(list==1 && (index>boughtPlayers.size() || index<1)) {
			JOptionPane.showMessageDialog(null, dontExist+(index)+" en tu plantilla");
			index=Integer.parseInt(JOptionPane.showInputDialog(insert));
		}
		while(list==2 && (index>avaliablePlayers.size() || index<1)) {
			JOptionPane.showMessageDialog(null, dontExist+(index)+" en el mercado");
			index=Integer.parseInt(JOptionPane.showInputDialog(insert));
		}
		return index;
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
=======
	public void initHelpFrame() { //Simplemente da formato e inicializa el JFrame de ayuda
		String helpText=fillHelpText();
		JTextArea blank = new JTextArea("");
		String blankText = "";
		for(int i=0;i<13;i++) {
			blankText+="\n\n";
		}
		blank.setText(blankText);
>>>>>>> 69ebc59edeaa73652b2cd9194538e5f9833f0fae
		helpFrame.setSize(WIDTH/3, (int) (HEIGHT*0.99));
		helpFrame.setLocationRelativeTo(null);
		helpFrame.setUndecorated(true);
		helpFrame.setLayout(new BorderLayout());
		help.setEditable(false);
		help.setBackground(transparent);
		help.setBorder(null);
		help.setFont(helpFont);
		help.setText(helpText);
		help.setFont(helpFont);
		setFormatButtons(exitHelpButton);
		exitHelpButton.setFont(infoFont2);
		exitHelpButton.addActionListener(this);
		blank.setEditable(false);
		blank.setBackground(null);
		blank.setBorder(null);
		helpFrame.add(help,BorderLayout.NORTH);
		helpFrame.add(exitHelpButton, BorderLayout.CENTER);
		helpFrame.add(blank, BorderLayout.SOUTH);
	}
<<<<<<< HEAD
	public String fillHelpText() {
		String text="";
		String indentation="    ";
		String nextLine="\n";
		text+=nextLine;
		text+=nextLine;
		text+=nextLine;
		text+=nextLine;
		text+=nextLine+"Bienvenido a la ayuda:";
		text+=nextLine+indentation+"Cada jugador tiene:";
		text+=nextLine+indentation+indentation+"- Identificador";
		text+=nextLine+indentation+indentation+"- Posición";
		text+=nextLine+indentation+indentation+"- Nombre y Apellidos";
		text+=nextLine+indentation+indentation+"- Precio";
		text+=nextLine+indentation+indentation+"- Variables (tiro, defensa, estirada...)";
		text+=nextLine;
		text+=nextLine+indentation+"Para comprar jugadores"+nextLine+indentation+"existe el botón de \"Comprar\"";
		text+=nextLine;
		text+=nextLine+indentation+"Para vender jugadores"+nextLine+indentation+"existe el botón de \"Vender\"";
		text+=nextLine;
		text+=nextLine+indentation+"Para ver las variables de cada jugador"+nextLine+indentation+"existe el botón de \"Info\"";
		text+=nextLine;
		text+=nextLine;
		text+=nextLine;
		return text;
=======
	public void setFormatButtons(JButton button) { //Simplemente da formato a los botones
		button.setBackground(buttonColor);
		button.setFocusPainted(false); //Les quita el resaltado al fijarlos
		button.setBorder(BorderFactory.createRaisedBevelBorder()); //Les cambia el borde
>>>>>>> 69ebc59edeaa73652b2cd9194538e5f9833f0fae
	}
	public int getHEIGHT() {
		return HEIGHT;
	}
	public int getWIDTH() {
		return WIDTH;
	}
}
