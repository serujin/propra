package entregas.poo1.poo1Ejercicio1;

public class EjercicioPoo1 {
	static Conjunto<Integer> a = new Conjunto<>(); //El conjunto podría ser de cualquier tipo, pero he elegido Integer por el ejercicio 1
	static Conjunto<Integer> b = new Conjunto<>();
	static Conjunto<Integer> aux = new Conjunto<>();
	public static void main(String[] args) {
		System.out.println("Casos de prueba addElements");
		addElementsTestCases();
		a.showElements();
		b.showElements();
		System.out.println("\nCasos de prueba delElements");
		delElementsTestCases();
		System.out.println("\nCasos de prueba union");
		unionTestCases();
		System.out.println("\nCasos de prueba intersect");
		intersectTestCases();
		System.out.println("\nCasos de prueba difference");
		differenceTestCases();
		System.out.println("\nCasos de prueba subElement");
		subElementTestCases();
		System.out.println("\nCasos de prueba equals");
		equalsTestCases();
	}
	public static void addElementsTestCases() {
		for(int i=1,j=4;i<7;i++,j++) {
			a.addElement(i);
			b.addElement(j);
		}
	}
	public static void delElementsTestCases() {
		a.delElement(30);
		a.showElements();
		a.delElement(2);
		a.showElements();
		addElementsTestCases(); //Just to restart the elements
	}
	public static void unionTestCases() {
		aux = a.union(b);
		aux.showElements();
		aux = a.union(a);
		aux.showElements();
	}
	public static void intersectTestCases() {
		aux = a.intersect(b);
		aux.showElements();
		aux = a.intersect(a);
		aux.showElements();
	}
	public static void differenceTestCases() {
		aux = a.difference(b);
		aux.showElements();
		aux = a.difference(a);
		aux.showElements();
	}
	public static void subElementTestCases() {
		Conjunto<Integer> x = new Conjunto<>();
		x.addElement(1);
		x.addElement(3);
		x.addElement(6);
		System.out.println(a.checkSubElement(x));
		System.out.println(b.checkSubElement(x));
	}
	public static void equalsTestCases() {
		Conjunto<Integer> x = new Conjunto<>();
		Conjunto<Integer> y = new Conjunto<>();
		x.addElement(1);
		x.addElement(3);
		x.addElement(6);
		y.addElement(6);
		y.addElement(3);
		y.addElement(1);
		System.out.println(x.checkEquals(y));
		System.out.println(a.checkEquals(b));
	}
}

