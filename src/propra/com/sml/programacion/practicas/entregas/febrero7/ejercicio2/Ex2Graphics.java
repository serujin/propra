package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio2;

import java.awt.BorderLayout;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Ex2Graphics extends JFrame{
	private static final long serialVersionUID = 1L;
	public Ex2Graphics(int width, int height, String[][][] cube, String[] company, String[] employees) {
		setSize(width,height);
		setResizable(false);
		setLocation(width/2,height/2);
		setTitle("Empresas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		int paneHeight = height/3;
		Random selector = new Random();
		String textP1="";
		String textP2="";
		String textP3="";
		int avg=0;
		while (textP1.equals(textP2) || textP2.equals(textP3) || textP1.equals(textP3)) {
			textP1="\n Empresa: "+company[selector.nextInt(company.length)];
			textP2="\n\n\n\n Empresa: "+company[selector.nextInt(company.length)];
			textP3="\n Empresa: "+company[selector.nextInt(company.length)];
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				avg+=Integer.valueOf(cube[0][i][j]);
			}
			avg=avg/5;
			textP1+="\n     "+employees[selector.nextInt(employees.length)]+" ha cobrado: "+cube[0][i][0]+"€ , "+cube[0][i][1]+"€ , "+cube[0][i][2]+"€ , "+cube[0][i][3]+"€ , "+cube[0][i][4]+"€ , de media: "+avg+"€";
			avg=0;
			for(int j=0;j<5;j++) {
				avg+=Integer.valueOf(cube[1][i][j]);
			}
			avg=avg/5;
			textP2+="\n     "+employees[selector.nextInt(employees.length)]+" ha cobrado: "+cube[1][i][0]+"€ , "+cube[1][i][1]+"€ , "+cube[1][i][2]+"€ , "+cube[1][i][3]+"€ , "+cube[1][i][4]+"€ , de media: "+avg+"€";
			avg=0;
			for(int j=0;j<5;j++) {
				avg+=Integer.valueOf(cube[2][i][j]);
			}
			avg=avg/5;
			textP3+="\n     "+employees[selector.nextInt(employees.length)]+" ha cobrado: "+cube[2][i][0]+"€ , "+cube[2][i][1]+"€ , "+cube[2][i][2]+"€ , "+cube[2][i][3]+"€ , "+cube[2][i][4]+"€ , de media: "+avg+"€";
		}
		textP3+="\n";
		JTextArea text1 = new JTextArea(textP1);
		JTextArea text2 = new JTextArea(textP2);
		JTextArea text3 = new JTextArea(textP3);
		text1.setSize(width, paneHeight);
		text2.setSize(width, paneHeight);
		text3.setSize(width, paneHeight);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		add(text1,BorderLayout.NORTH);
		add(text2,BorderLayout.CENTER);
		add(text3,BorderLayout.SOUTH);
	}
}
