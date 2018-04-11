import java.util.*;
public class Elecciones {

	public static void main(String[] args) {
		int partidos=Leer.pedirEntero("�Cuantos partidos hay?");
		int esca�os=Leer.pedirEntero("�Cuantos esca�os hay?");
		TreeMap<String,Partido> Partidos = new TreeMap<>();
		TreeMap<Integer,TreeSet<String>>mapPartidos = new TreeMap<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		crearPartidos(partidos, Partidos);
		asigVotos(Partidos);
		eliminarPartidos(Partidos);
		calcularVotos(esca�os, Partidos, mapPartidos);
		asigEsca�os(esca�os, Partidos, mapPartidos);
	}
	
	public static void crearPartidos(int partidos, TreeMap<String, Partido> Partidos) {
		System.out.println("-----------PARTIDOS-----------");
		for (int i = 0; i < partidos; i++) {
			Partido unPartido = new Partido();
			Partidos.put(unPartido.getNombre(), unPartido);
			System.out.println(unPartido.toString());
		}
	}
	public static void asigVotos(TreeMap<String, Partido> Partidos){
		System.out.println("-----------VOTOS ASIGNADOS-----------");
		for (String i : Partidos.keySet()) {
			Partidos.get(i).setVotos((int)(Math.random() * (100001 - 5000) + 5000));
			System.out.println(Partidos.get(i).toString());
		}
	}
	private static void eliminarPartidos(TreeMap<String, Partido> Partidos) {
		int contvotos = 0;
		for (String i : Partidos.keySet()) {
			contvotos=Partidos.get(i).getVotos()+contvotos;
		}
		System.out.println("-----------ELIMINADOS-----------");
		Iterator <String> It = Partidos.keySet().iterator();
		while(It.hasNext()){
			String nombrePart=It.next();
			if (Partidos.get(nombrePart).getVotos()<contvotos*0.05) {
				It.remove();
				System.out.println(nombrePart);
			}
		}
		System.out.println("-----------PARTIDOS-----------");
		for (String i : Partidos.keySet()) {
			System.out.println(Partidos.get(i).toString());
		}
	}
	private static void calcularVotos(int esca�os, TreeMap<String, Partido> Partidos,
			TreeMap<Integer, TreeSet<String>> mapPartidos) {
		for (String nombre : Partidos.keySet()) {
			Integer numvotos=Partidos.get(nombre).getVotos();
			for (int j = 1; j <= esca�os; j++) {
				int resultado=numvotos/j;
				if (mapPartidos.get(resultado)==null) {
					TreeSet<String> nombrePartidos = new TreeSet<String>();
					nombrePartidos.add(nombre);
					mapPartidos.put(resultado, nombrePartidos);
				}else{
					mapPartidos.get(resultado).add(nombre);
				}
			}
		}
	}
	private static void asigEsca�os(int esca�os, TreeMap<String, Partido> Partidos,
			TreeMap<Integer, TreeSet<String>> mapPartidos) {
		int contadorvotos=0;
		for (Integer numVotos : mapPartidos.keySet()) {
			if (contadorvotos==esca�os) {
				break;
			}
			for (String nombrepartido : mapPartidos.get(numVotos)) {
				if (contadorvotos==esca�os) {
					break;
				}
				Partidos.get(nombrepartido).a�adirEsca�o();
				contadorvotos++;
			}
			
		}
		for (String i : Partidos.keySet()) {
			System.out.println(Partidos.get(i).toString());
		}
	}
}
