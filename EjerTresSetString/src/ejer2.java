import java.util.*;

public class ejer2 {
	public static void main(String[] args) {
		String[] cosas={"este","monta�a","letra","bajo","frio","bajo","bajo","aleatorio"};
		HashSet<String> conjuntoHashSet=new HashSet<String>();		
		LinkedHashSet<String> conjuntoLinked=new LinkedHashSet<String>();		
		TreeSet<String> conjuntoTree=new TreeSet<String>();		
		int n;
		int cuantos=(int)(Math.random() * (16 - 1) + 1);
		Leer.mostrarEnPantalla("Se van a generar "+cuantos+" datos");
		Leer.mostrarEnPantalla("Insertando:");
		for (int i = 0; i < cuantos; i++) {
			n=(int)(Math.random() * (8 - 0) + 0);
			System.out.printf(cosas[n]+" * ");
			conjuntoHashSet.add(cosas[n]);
			conjuntoLinked.add(cosas[n]);
			conjuntoTree.add(cosas[n]);
		}
		Leer.mostrarEnPantalla("\nValores de objHashSet:");
		for (String i: conjuntoHashSet) {
			System.out.printf(i+" ");
		}
		Leer.mostrarEnPantalla("\nValores de objLinkHashSet:");
		for (String i: conjuntoLinked) {
			System.out.printf(i+" ");
		}
		Leer.mostrarEnPantalla("\nValores de objTreeSet:");
		for (String i: conjuntoTree) {
			System.out.printf(i+" ");
		}
		System.out.println("\nValores de objHashSet: "+conjuntoHashSet);
		System.out.println("Valores de objLinkHashSet: "+conjuntoLinked);
		System.out.println("Valores de objTreeSet: "+conjuntoTree);
	}
}
