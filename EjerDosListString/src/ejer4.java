import java.util.*;

public class ejer4 {
	public static void main(String[] args) {
		String[] cosas={"este","monta�a","letra","bajo","frio","bajo","bajo","aleatorio"};
		ArrayList<String> conjuntoArrayList=new ArrayList<String>();		
		LinkedList<String> conjuntoLinked=new LinkedList<String>();
		int n;
		int cuantos=(int)(Math.random() * (16 - 1) + 1);
		Leer.mostrarEnPantalla("Se van a generar "+cuantos+" datos");
		Leer.mostrarEnPantalla("Insertando:");
		for (int i = 0; i < cuantos; i++) {
			n=(int)(Math.random() * (8 - 0) + 0);
			System.out.printf(cosas[n]+" * ");
			conjuntoArrayList.add(cosas[n]);
			conjuntoLinked.add(cosas[n]);
		}
		Leer.mostrarEnPantalla("\nValores de objArrayList:");
		for (String i: conjuntoArrayList) {
			System.out.printf(i+" ");
		}
		Leer.mostrarEnPantalla("\nValores de objLinkedList:");
		for (String i: conjuntoLinked) {
			System.out.printf(i+" ");
		}
		System.out.println("\nValores de objArrayList: "+conjuntoArrayList);
		System.out.println("Valores de objLinkedList: "+conjuntoLinked);

	}

}
