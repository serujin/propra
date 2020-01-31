package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio2;

import java.awt.Toolkit;
import java.util.Random;

public class Ejercicio2 {
	public static void main(String[] args) {
		String[] company = {"IBM","Ubisoft","Microsoft","Mojang","Bethesda","Electronic Arts","Nintendo","Konami","Activision","Valve"};
		String[] employees = {"Juan","María","Sergio","Federico","Amy","Pablo","Leandro","Susana","Lorena","Julio","Beatriz","Julia","Paula","Adrián","James","David"};
		String[][][] cube = new String[3][4][5];
		int height = (int) (0.5*0.95*Toolkit.getDefaultToolkit().getScreenSize().height);
		int width = (int) (0.5*Toolkit.getDefaultToolkit().getScreenSize().width);
		fillCube(cube);
		Ex2Graphics window = new Ex2Graphics(width,height,cube,company,employees);
		window.setVisible(true);
	}
	public static void fillCube(String[][][] cube) {
		Random selector = new Random();
		for(int i=0;i<cube.length;i++) {
			for(int j=0;j<cube[0].length;j++) {
				for(int k=0;k<cube[0][0].length;k++) {
					cube[i][j][k]=Integer.toString(selector.nextInt(3501)+1000);
				}
			}
		}
	}
	public static void showCube(String[][][] cube) {
		for(int i=0;i<cube.length;i++) {
			
			for(int j=0;j<cube[0].length;j++) {
				
				for(int k=0;k<cube[0][0].length;k++) {
					
				}
			}
		}
	}

}

