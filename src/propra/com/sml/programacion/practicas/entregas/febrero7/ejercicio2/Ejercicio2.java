package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio2;

import java.util.Random;

public class Ejercicio2 {
	static Random selector = new Random(); //Creo mi objeto random para poder usarlo en toda la clase
	static String[] companies = {"IBM","Ubisoft","Microsoft","Mojang","Bethesda","Electronic Arts","Nintendo","Konami","Activision","Valve"}; //Pequeña base de datos de nombres de compañías
	static String[] employees = {"Juan","María","Sergio","Federico","Amy","Pablo","Leandro","Susana","Lorena","Julio","Beatriz","Julia","Paula","Adrián","James","David","Nuria","Pedro","Anabel","Luisa","Juanjo"}; //Pequeña base de datos de nombres de empleados
	static int[][][] cube = new int[3][4][6]; //Creo el cubo para llenar los salarios con un hueco extra para almacenar la media
	static String[][] auxEmployees = new String[3][4]; //Creo un array auxiliar para guardar los nombres de los empleados de las empresas
	static String company1=""; //Creo los nombres de las empresas, y los inicializo vacíos
	static String company2="";
	static String company3="";
	static String nextLine="\n"; //Creo esta variable, ya que la voy a usar mucho y me ahorra tiempo
	static String indentation="         "; //Creo esta variable, ya que la voy a usar mucho y me ahorra tiempo
	static int sumSalaries;
	public static void main(String[] args) {
		fillSalaries(); //Llena el cubo con los salarios
		fillCompanies(); //Da nombre a las compañías
		fillEmployees(); //Llena el array de empleados
		initFrame(); //Muestra las empresas, empleados y sueldos
	}
	public static void initFrame() {
		Ex2Graphics window = new Ex2Graphics(); //Creo mi objeto de mi clase Ex2Graphics
		fillGraphics(window);
		window.setVisible(true);
	}
	public static void fillSalaries() { //Lleno el cubo con salarios aleatorios entre 1000€ y 4500€
		for(int i=0;i<cube.length;i++) {
			for(int j=0;j<cube[0].length;j++) {
				sumSalaries=0; //Es la variable que usaré para ir añadiendo los sueldos para calcular la media
				for(int k=0;k<cube[0][0].length;k++) { 
					if(k==(cube[0][0].length-1)) { //Si el bucle está en la última posición introduce la media en vez de sueldo
						cube[i][j][k]=sumSalaries/5; 
					} else {
						cube[i][j][k]=selector.nextInt(3501)+1000; //Introduce un salario aleatorio entre 1000€ y 4500€
						sumSalaries+=cube[i][j][k]; //Suma ese salario aleatorio para calcular la media posteriormente
					}
				}
			}
		}
	}
	public static void fillCompanies() { //Llena el nombre de las empresas 
		String constant=indentation+"- Empresa: "; //Creo esta variable, ya que la voy a usar varias veces y me ahorra tiempo
		while (company1.equals(company2) || company2.equals(company3) || company1.equals(company3)) { //Si los nombres son iguales vuelve a asignar nombres
			company1=constant+companies[selector.nextInt(companies.length)]; //Asigna aleatoriamente los nombres de entre los definidos al principio de la clase en el array companies
			company2=constant+companies[selector.nextInt(companies.length)];
			company3=constant+companies[selector.nextInt(companies.length)];
		}
	}
	public static void fillEmployees() { //Llena el nombre de los empleados
		String name1;
		String name2;
		String name3;
		String name4;
		for(int i=0;i<auxEmployees.length;i++) { //Va llenando de una en una las filas del array auxiliar de empleados (cada fila es una empresa) con nommbres aleatorios del array employees
			name1="";
			name2="";
			name3="";
			name4="";
			while (name1.equals(name2) || name1.equals(name3) || name1.equals(name4) || name2.equals(name3) || name2.equals(name4) || name3.equals(name4)) { //Si los nombres son iguales vuelve a asignar nombres
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
	public static void fillGraphics(Ex2Graphics window) { //Llena tres textos con la información de las empresas y sus empleados
		String text1="";
		String text2="";
		String text3="";
		String constant=nextLine+indentation+indentation+"- "; //Creo esta variable, ya que la voy a usar varias veces y me ahorra tiempo

		text1 = nextLine + company1;
		text2 = company2;
		text3 = company3;
		for (int j = 0; j < auxEmployees[0].length; j++) { // Llena con márgenes los tres textos
			for (int k = 0; k < cube[0][0].length; k++) {
				if (k == (cube[0][0].length - 1)) {
					text1 += "ha cobrado de media: " + cube[0][j][k] + "€";
					text2 += "ha cobrado de media: " + cube[1][j][k] + "€";
					text3 += "ha cobrado de media: " + cube[2][j][k] + "€";
				} else if (k == 0) {
					text1 += constant + auxEmployees[0][j] + " ha ganado: " + cube[0][j][k] + "€, ";
					text2 += constant + auxEmployees[1][j] + " ha ganado: " + cube[1][j][k] + "€, ";
					text3 += constant + auxEmployees[2][j] + " ha ganado: " + cube[2][j][k] + "€, ";
				} else {
					text1 += cube[0][j][k] + "€, ";
					text2 += cube[1][j][k] + "€, ";
					text3 += cube[2][j][k] + "€, ";
				}
			}
		}
		text1+=nextLine+indentation+indentation+findMaxAvg(0); //Añade la media máxima
		text2+=nextLine+indentation+indentation+findMaxAvg(1);
		text3+=nextLine+indentation+indentation+findMaxAvg(2);
		window.setTextArea(text1, text2, text3); //Añade los textos al JFrame
	}
	public static String findMaxAvg(int nCompany) { //Devuelve la media entre los empleados de la misma empresa en forma de texto con formato para añadirlo al texto
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

