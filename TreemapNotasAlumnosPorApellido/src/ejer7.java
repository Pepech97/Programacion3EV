import java.util.*;

public class ejer7 {
	public static void main(String[] args) {
		TreeMap<Integer,ArrayList<String>> notasalumno=new TreeMap<Integer,ArrayList<String>>();
		String alumnos;
		int n = 0;
		do {
			alumnos=Leer.pedirCadena("Apellido: ( * para acabar)");
			if (!alumnos.equals("*")) {
				n=Leer.pedirEntero("Nota:");
			}
			if (notasalumno.containsKey(n)) {			
				notasalumno.get(n).add(alumnos);
			}else {
				ArrayList<String> arrayalumnos=new ArrayList<>(50);
				arrayalumnos.add(alumnos);
				notasalumno.put(n, arrayalumnos);
			}
		} while (!alumnos.equals("*"));
		for (Integer nota : notasalumno.keySet()) {
			System.out.println("Alumnos con nota: "+nota);
			System.out.println(notasalumno.get(nota));
		}
	}
}