package propra.com.sml.programacion.practicas.entregas.poo1.ejerciciopoo1;

public class EjercicioPoo1 {
	static Conjunto a = new Conjunto();
	static Conjunto b = new Conjunto();
	public static void main(String[] args) {
		a.addElement(20);
		a.addElement(30);
		a.addElement(20);
		a.addElement(400);
		a.addElement(20000);
		b.addElement(20);
		b.addElement(20000);
		a.showElements();
		a.showUnion(b);
		a.showIntersect(b);
	}
}
