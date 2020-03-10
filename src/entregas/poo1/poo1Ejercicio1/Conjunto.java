package entregas.poo1.poo1Ejercicio1;

import java.util.ArrayList;

public class Conjunto<T> { 
	private ArrayList<T> elements = new ArrayList<>();
	/**
	 * This method add the element only if it's not on the ArrayList
	 * @param element --> The element to add 
	 */
	public void addElement(T element) { 
		if(!checkExist(element)) {
			elements.add(element);
		}
	}
	/**
	 * This method remove the element only if it's on the ArrayList
	 * @param element --> The element to remove
	 */
	public void delElement(T element) { 
		if(checkExist(element)) {
			elements.remove(element);
		}
	}
	/**
	 * This method returns a Conjunto with the addition of two Conjunto
	 * @param comparison --> The other Conjunto to add
	 * @return A new Conjunto
	 */
	public Conjunto<T> union(Conjunto<T> comparison) { 
		Conjunto<T> aux = new Conjunto<>();
		aux.elements.addAll(comparison.elements);
		for(T element : elements) {
			aux.addElement(element);
		}
		return aux;
	}
	/**
	 * This method make the intersect between two Conjunto
	 * @param comparison --> The other Conjunto to intersect with
	 * @return A new Conjunto
	 */
	public Conjunto<T> intersect(Conjunto<T> comparison) { 
		Conjunto<T> aux = new Conjunto<>();
		for(T compElement : comparison.elements) {
			if(this.checkExist(compElement)) {
				aux.addElement(compElement);
			}
		}
		return aux;
	}
	/**
	 * This method returns a Conjunto with the subtraction of two Conjunto
	 * @param comparison --> The other Conjunto to subtract 
	 * @return A new Conjunto
	 */
	public Conjunto<T> difference(Conjunto<T> comparison) { 
		Conjunto<T> aux = new Conjunto<>();
		aux.elements.addAll(elements);
		for(T delElement : comparison.elements) {
			aux.delElement(delElement);
		}
		return aux;
	}
	/**
	 * This method check if an element exist on the Conjunto
	 * @param element --> The element to check
	 * @return -->  True if the element exist
	 */
	public boolean checkExist(T element) { 
		return elements.contains(element);
	}
	/**
	 * This method check if other Conjunto is sub-element of this
	 * @param comparison --> The Conjunto to check
	 * @return -->  True if the comparison Conjunto is sub-element
	 */
	public boolean checkSubElement(Conjunto<T> comparison) {
		return elements.containsAll(comparison.elements);
	}
	/**
	 * This method check if other Conjunto is equals to this
	 * @param comparison --> The Conjunto to check
	 * @return -->  True if the two Conjunto are equals (the order doesn't matter)
	 */
	public boolean checkEquals(Conjunto<T> comparison) {
		return elements.size()==comparison.elements.size() && checkSubElement(comparison);
	}		
	/**
	 * This method check if the Conjunto is empty, if it's the method show on console that is empty,
	 *  if not this method show on console the Conjunto with the specified format on the exercise
	 */
	public void showElements() {
		if(elements.isEmpty()) {
			System.out.println("El conjunto está vacío");
		} else {
			for(T element : elements) {
				System.out.print("el"+element+" ");
			}
			System.out.println("");
		}
	}
}
