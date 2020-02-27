package entregas.poo1.poo1Ejercicio1;

public class EjercicioPoo1 {
	static Conjunto a = new Conjunto();
	static Conjunto b = new Conjunto();
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
		Conjunto aux = new Conjunto();
		aux = a.union(b);
		aux.showElements();
		aux = a.union(a);
		aux.showElements();
	}
	public static void intersectTestCases() {
		Conjunto aux = new Conjunto();
		aux = a.intersect(b);
		aux.showElements();
		aux = a.intersect(a);
		aux.showElements();
	}
	public static void differenceTestCases() {
		Conjunto aux = new Conjunto();
		aux = a.difference(b);
		aux.showElements();
		aux = a.difference(a);
		aux.showElements();
	}
	
}

