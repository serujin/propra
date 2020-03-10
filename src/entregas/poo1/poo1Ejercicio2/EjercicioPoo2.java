package entregas.poo1.poo1Ejercicio2;

public class EjercicioPoo2 {
	
	public static void main(String[] args) {
		Vector3D a = new Vector3D(); //Vector3D can be created with chosen values too
		Vector3D b = new Vector3D(); //using the other constructor: new Vector3D(x,y,z)
		Vector3D aux;
		System.out.println("V1:");
		a.showVector();
		System.out.println("\nV2:");
		b.showVector();
		System.out.println("\nV1+V2:");
		aux = a.sumVectors(b);
		aux.showVector();
		System.out.println("\nV1-V2:");
		aux = a.subsVectors(b);
		aux.showVector();
		System.out.println("\nV1xV2:");
		aux = a.vectorialProductVectors(b);
		aux.showVector();
		System.out.println("\nV1.V2:");
		a.scalarProductVectors(b);
	}
}
