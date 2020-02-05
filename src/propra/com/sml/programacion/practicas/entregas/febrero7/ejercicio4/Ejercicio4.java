package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		Ex4Graphics menu = new Ex4Graphics();
		menu.createNorth();
		menu.createCenter();
		menu.createSouth();
		menu.fillAvaliable();
		menu.fillAvaliablePlayers();
		menu.initInfoFrame();
		menu.initHelpFrame();
		menu.setVisible(true);
	}
 }

