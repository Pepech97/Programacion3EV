import java.util.*;

public class ejer6 {
	public static void main(String[] args) {
		TreeSet<String> conjuntoTree=new TreeSet<String>();
		String n = "";
		while(!n.equals("*")) {
			n=Leer.pedirCadena("");
			conjuntoTree.add(n);
		}
		System.out.println(conjuntoTree);
		int cuantas;
		do {
			cuantas=Leer.pedirEntero("Cuantas palabras quieres sacar");
		} while (cuantas>conjuntoTree.size());
		for (String i : conjuntoTree) {
			if(cuantas!=0){
				System.out.println(i);
			}else{
				break;
			}
			cuantas--;
		}
	}
	}

