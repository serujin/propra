package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio2;

import java.util.Random;

public class Ejercicio2 {
	static Random selector = new Random();
	static String[] company = {"IBM","Ubisoft","Microsoft","Mojang","Bethesda","Electronic Arts","Nintendo","Konami","Activision","Valve"};
	static String[] employees = {"Juan","María","Sergio","Federico","Amy","Pablo","Leandro","Susana","Lorena","Julio","Beatriz","Julia","Paula","Adrián","James","David","Nuria","Pedro","Anabel","Luisa","Juanjo"};
	static int[][][] cube = new int[3][4][6];
	static String[][] auxEmployees = new String[3][4];
	static String company1="";
	static String company2="";
	static String company3="";
	static String nextLine="\n";
	static String indentation="         ";
	static int sumSalaries;
	public static void main(String[] args) {
		fillSalaries();
		fillCompanies();
		fillEmployees();
		initFrame();
	}
	public static void initFrame() {
		Ex2Graphics window = new Ex2Graphics();
		fillGraphics(window);
		window.setVisible(true);
	}
	public static void fillSalaries() {
		for(int i=0;i<cube.length;i++) {
			for(int j=0;j<cube[0].length;j++) {
				sumSalaries=0;
				for(int k=0;k<cube[0][0].length;k++) {
					if(k==(cube[0][0].length-1)) {
						cube[i][j][k]=sumSalaries/5;
					} else {
						cube[i][j][k]=selector.nextInt(3501)+1000;
						sumSalaries+=cube[i][j][k];
					}
				}
			}
		}
	}
	public static void fillCompanies() {
		String constant=indentation+"- Empresa: ";
		while (company1.equals(company2) || company2.equals(company3) || company1.equals(company3)) {
			company1=constant+company[selector.nextInt(company.length)];
			company2=constant+company[selector.nextInt(company.length)];
			company3=constant+company[selector.nextInt(company.length)];
		}
	}
	public static void fillEmployees() {
		String name1;
		String name2;
		String name3;
		String name4;
		for(int i=0;i<auxEmployees.length;i++) {
			name1="";
			name2="";
			name3="";
			name4="";
			while (name1.equals(name2) || name1.equals(name3) || name1.equals(name4) || name2.equals(name3) || name2.equals(name4) || name3.equals(name4)) {
				name1=employees[selector.nextInt(employees.length)];
				name2=employees[selector.nextInt(employees.length)];
				name3=employees[selector.nextInt(employees.length)];
				name4=employees[selector.nextInt(employees.length)];
			}
			auxEmployees[i][0]=name1;
			auxEmployees[i][1]=name2;
			auxEmployees[i][2]=name3;
			auxEmployees[i][3]=name4;
		}
	}
	public static void fillGraphics(Ex2Graphics window) {
		String text1="";
		String text2="";
		String text3="";
		String constant=nextLine+indentation+indentation+"- ";
		for(int i=0;i<auxEmployees.length;i++) {
			text1=nextLine+company1;
			text2=company2;
			text3=company3;
			for(int j=0;j<auxEmployees[0].length;j++) {
				for(int k=0;k<cube[0][0].length;k++) {
					if(k==(cube[0][0].length-1)) {
						text1+="ha cobrado de media: "+cube[0][j][k]+"€";
						text2+="ha cobrado de media: "+cube[1][j][k]+"€";
						text3+="ha cobrado de media: "+cube[2][j][k]+"€";
					} else if(k==0) {
						text1+=constant+auxEmployees[0][j]+" ha ganado: "+cube[0][j][k]+"€, ";
						text2+=constant+auxEmployees[1][j]+" ha ganado: "+cube[1][j][k]+"€, ";
						text3+=constant+auxEmployees[2][j]+" ha ganado: "+cube[2][j][k]+"€, ";
					} else {
						text1+=cube[0][j][k]+"€, ";
						text2+=cube[1][j][k]+"€, ";
						text3+=cube[2][j][k]+"€, ";
					}
				}
			}
		} 
		text1+=nextLine+indentation+indentation+findMaxAvg(0);
		text2+=nextLine+indentation+indentation+findMaxAvg(1);
		text3+=nextLine+indentation+indentation+findMaxAvg(2);
		window.setTextArea(text1, text2, text3);
	}
	public static String findMaxAvg(int nCompany) {
		int maxAvg=-999999;
		String returnValue="";
		for(int i=0;i<cube[0].length;i++) {
			if(cube[nCompany][i][5]>maxAvg) {
				maxAvg=cube[nCompany][i][5];
				returnValue="El empleado que mas ha cobrado es "+auxEmployees[nCompany][i]+", que ha cobrado: "+maxAvg+"€ (situado en la posición: ["+nCompany+"]["+i+"]["+5+"])";
			}
		}
		return returnValue;
	}
}

