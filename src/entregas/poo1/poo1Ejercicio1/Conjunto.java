package entregas.poo1.poo1Ejercicio1;

import java.util.ArrayList;

public class Conjunto {
	private ArrayList<Integer> elements = new ArrayList<>();
	public void addElement(Integer element) { //Works perfectly, need GUI
		if(!checkExist(element)) {
			elements.add(element);
		}
	}
	public void delElement(Integer element) { //Works perfectly, need GUI
		if(checkExist(element)) {
			elements.remove(element);
		}
	}
	public Conjunto union(Conjunto comparation) { //Works perfectly, need GUI
		Conjunto aux = new Conjunto();
		aux.elements.addAll(comparation.elements);
		for(Integer element : elements) {
			aux.addElement(element);
		}
		return aux;
	}
	public Conjunto intersect(Conjunto comparation) { //Need to get FIXED
		Conjunto aux = new Conjunto();
		for(Integer compElement : comparation.elements) {
			if(this.checkExist(compElement)) {
				aux.addElement(compElement);
			}
		}
		return aux;
	}
	public Conjunto difference(Conjunto comparation) { //Need to get FIXED
		Conjunto aux = new Conjunto();
		aux.elements.addAll(elements);
		for(Integer delElement : comparation.elements) {
			aux.delElement(delElement);
		}
		return aux;
	}
	public boolean checkExist(Integer element) { //Works perfectly
		return elements.contains(element);
	}
	public boolean checkSubElement(Conjunto comparation) {
		return elements.containsAll(comparation.elements);
	}
	public boolean checkEquals(Conjunto comparation) {
		return elements.size()==comparation.elements.size() && checkSubElement(comparation);
	}		
	public void showElements() {
		if(elements.size()==0) {
			System.out.println("El conjunto está vacío");
		} else {
			for(Integer element : elements) {
				System.out.print("el"+element+" ");
			}
			System.out.println("");
		}
	}
}
