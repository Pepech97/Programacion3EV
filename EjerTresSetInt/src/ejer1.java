import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ejer1 {

	public static void main(String[] args) {
		HashSet<Integer> conjuntoHashSet=new HashSet<Integer>();		
		LinkedHashSet<Integer> conjuntoLinked=new LinkedHashSet<Integer>();		
		TreeSet<Integer> conjuntoTree=new TreeSet<Integer>();		
		int n;
		int cuantos=(int)(Math.random() * (16 - 1) + 1);
		Leer.mostrarEnPantalla("Se van a generar "+cuantos+" datos");
		Leer.mostrarEnPantalla("Insertando:");
		do {
			n=(int)(Math.random() * (8001 - 1000) + 1000);
			System.out.printf(n+" * ");
			conjuntoHashSet.add(n);
			conjuntoLinked.add(n);
			conjuntoTree.add(n);
		} while (conjuntoHashSet.size()<cuantos);
		Leer.mostrarEnPantalla("\nValores de objHashSet:");
		for (Integer i: conjuntoHashSet) {
			System.out.printf(i+" ");
		}
		Leer.mostrarEnPantalla("\nValores de objLinkHashSet:");
		for (Integer i: conjuntoLinked) {
			System.out.printf(i+" ");
		}
		Leer.mostrarEnPantalla("\nValores de objTreeSet:");
		for (Integer i: conjuntoTree) {
			System.out.printf(i+" ");
		}
		System.out.println("\nValores de objHashSet: "+conjuntoHashSet);
		System.out.println("Valores de objLinkHashSet: "+conjuntoLinked);
		System.out.println("Valores de objTreeSet: "+conjuntoTree);
	}

}
