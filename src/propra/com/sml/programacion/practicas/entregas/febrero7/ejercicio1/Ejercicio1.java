package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	static Ex1Graphics unordered = new Ex1Graphics(1); //Crea el JFrame para las palabras ordenadas
	static Ex1Graphics ordered = new Ex1Graphics(2);   //Crea el JFrame para las palabras desordenadas
	
	public static void main (String[] args) {
		int nWords = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas palabras vas a introducir?")); //Pide el número de palabras a introducir
		String[] words = new String[nWords];  //Crea un array con dimensión el número de palabras
		fillWords(words);                     //Va llenando el array de palabras con lo que le introduce el usuario
		unordered.showWords(words,0);		  //Muestra el JFrame con las palabras en el orden tal y como se han introducido
		ordenate(words);                      //Ordena las palabras
		JOptionPane.showMessageDialog(null, "Voy a ordenar tus palabras"); //Le dice al usuario que lo va a ordenar (aunque ya esté hecho, es por que el usuario se entere)
		ordered.showWords(words,1);           //Muestra el JFrame con las palabras ordenadas
	}
	public static void fillWords(String[] words) { //Va llenando el array con las palabras que se introducen por el JOptionPane
		int columns = words.length;            
		for(int i=0;i<columns;i++) {
			words[i] = JOptionPane.showInputDialog("¿Qué palabra introducimos?");
		}
	}
	public static void ordenate(String[] array) { //Me inspiré en el algoritmo de burbuja
		int disorder,comparation;  
		int columns = array.length;
		boolean disordered=true;
		String aux;
		while(disordered) { //Mientras que hay una sola palabra desordenada esto sigue corriendo
			disorder=0;
			for(int i=1;i<columns;i++) {
				comparation=array[i].compareToIgnoreCase(array[i-1]); //Compara cada palabra con la anterior
				if(comparation<0) { //Si es menor que cero, está antes en el diccionario, por lo que las cambia una con la otra (a-b ---> b-a)
					disorder++; //Indica que hay desorden en el array
					aux=array[i];
					array[i]=array[i-1];
					array[i-1]=aux;
				}
			}
			if(disorder==0) { //Si hay 0 palabras desordenadas, no necesitamos ordenar mas
				disordered=false;
			}
		}
	}
}
