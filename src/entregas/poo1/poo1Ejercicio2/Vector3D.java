package entregas.poo1.poo1Ejercicio2;

import java.util.Random;

public class Vector3D {
	private int x;
	private int y;
	private int z;
	/**
	 * Create a Vector3D with x, y and z values between -10 and 10
	 */
	public Vector3D() { 
		Random r = new Random();
		x=-10+r.nextInt(21);
		y=-10+r.nextInt(21);
		z=-10+r.nextInt(21);
	}
	/**
	 * Create a Vector3D with the values chosen by the user
	 * @param x --> x selected value
	 * @param y --> y selected value
	 * @param z --> z selected value
	 */
	public Vector3D(int x, int y, int z) { 
		this.x=x;
		this.y=y;
		this.z=z;
	}
	/**
	 * This method shows the Vector3D on console
	 */
	public void showVector() { 
		System.out.println("<"+x+","+y+","+z+">");
	}
	/**
	 * This method returns a Vector3D with the addition of two Vector3D
	 * @param v2 --> The other Vector3D to add
	 * @return A new Vector3D
	 */
	public Vector3D sumVectors(Vector3D v2) { 
		return new Vector3D(x+v2.x,y+v2.y,z+v2.z);
	}
	/**
	 * This method returns a Vector3D with the subtraction of two Vector3D
	 * @param v2 --> The other Vector3D to subtract
	 * @return A new Vector3D
	 */
	public Vector3D subsVectors(Vector3D v2) {
		return new Vector3D(x-v2.x,y-v2.y,z-v2.z);
	}
	/**
	 * This method shows the scalar product of two Vector3D
	 * @param v2 --> The other vector to calculate with
	 */
	public void scalarProductVectors(Vector3D v2) { 
		System.out.println(x*v2.x+y*v2.y+z*v2.z);
	}
	/**
	 * This method returns a Vector3D with the vector product of two Vector3D
	 * @param v2 --> The other vector to calculate with 
	 * @return A new Vector3D
	 */
	public Vector3D vectorialProductVectors(Vector3D v2) { 
		int x3 = this.y*v2.z-this.z*v2.y;
		int y3 = this.z*v2.x-this.x*v2.z;
		int z3 = this.x*v2.y-this.y*v2.x;
		return new Vector3D(x3,y3,z3);
	}
}
