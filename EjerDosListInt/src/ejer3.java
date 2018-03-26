import java.util.*;

public class ejer3 {
	public static void main(String[] args) {
		ArrayList<Integer> conjuntoArrayList=new ArrayList<Integer>();		
		LinkedList<Integer> conjuntoLinked=new LinkedList<Integer>();
		int n;
		int cuantos=(int)(Math.random() * (16 - 1) + 1);
		Leer.mostrarEnPantalla("Se van a generar "+cuantos+" datos");
		Leer.mostrarEnPantalla("Insertando:");
		for (int i = 0; i < cuantos; i++) {
			n=(int)(Math.random() * (16 - 1) + 1);
			System.out.printf(n+" * ");
			conjuntoArrayList.add(n);
			conjuntoLinked.add(n);
		}
		Leer.mostrarEnPantalla("\nValores de objArrayList:");
		for (Integer i: conjuntoArrayList) {
			System.out.printf(i+" ");
		}
		Leer.mostrarEnPantalla("\nValores de objLinkedList:");
		for (Integer i: conjuntoLinked) {
			System.out.printf(i+" ");
		}
		System.out.println("\nValores de objArrayList: "+conjuntoArrayList);
		System.out.println("Valores de objLinkedList: "+conjuntoLinked);
	}

}
