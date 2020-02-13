package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		Ex4Graphics menu = new Ex4Graphics(); //Creo mi menú de la clase Ex4Graphics
		menu.createNorth(); //Crea la zona de arriba del JFrame (nombre del club y dinero disponible)
		menu.createCenter(); //Crea la zona del centro del JFrame (plantilla, botones y mercado)
		menu.createSouth(); //Crea la zona de abajo del JFrame (huecos para formatear el JFrame como yo quiero)
		menu.fillAvaliable(); //Llena el ArrayList de objetos de mi clase Player
		menu.fillAvaliablePlayers(); //Llena los JTextField de jugadores disponibles con los objetos del ArrayList
		menu.initInfoFrame(); //Inicializa el JFrame de info de jugadores
  		menu.initHelpFrame(); //Inicializa el JFrame de ayuda
		menu.setVisible(true); //Muestra el menú
	}
 }

