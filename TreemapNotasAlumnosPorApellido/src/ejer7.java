import java.util.*;

public class ejer7 {
	public static void main(String[] args) {
		TreeMap<String,Integer> notasalumno=new TreeMap<String,Integer>();
		String alumnos;
		int n;
		do {
			alumnos=Leer.pedirCadena("Apellido: ( * para acabar)");
			if (!alumnos.equals("*")) {
				n=Leer.pedirEntero("nota:");
				notasalumno.put(alumnos, n);
			}
		} while (!alumnos.equals("*"));
		System.out.println(notasalumno);
	}
}