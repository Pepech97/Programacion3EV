import java.util.*;

public class ejer5 {
	public static void main(String[] args) {
		TreeSet<Integer> conjuntoTree=new TreeSet<Integer>();
		int n = 0;
		while(n!=-9999) {
			n=Leer.pedirEntero("");
			conjuntoTree.add(n);
		}
		System.out.println(conjuntoTree);
	}

}
