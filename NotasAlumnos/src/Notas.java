import java.util.*;

public class Notas {
	public static void main(String[] args) {
		ArrayList<Alumno> alumnos=new ArrayList<>(50);
		TreeMap<Integer,ArrayList<Integer>> nota1 = new TreeMap<>();
		TreeMap<Integer,ArrayList<Integer>> nota2 = new TreeMap<>();
		TreeMap<Integer,ArrayList<Integer>> nota3 = new TreeMap<>();
		crearAlumnos(alumnos);
		asignarNotas(alumnos, nota1, nota2, nota3);
		menu(alumnos, nota1, nota2, nota3);
		
		
		
		
	}

	private static void menu(ArrayList<Alumno> alumnos, TreeMap<Integer, ArrayList<Integer>> nota1,
			TreeMap<Integer, ArrayList<Integer>> nota2, TreeMap<Integer, ArrayList<Integer>> nota3) {
		int opcion;
		do {
			opcion=Leer.pedirEntero("1.-Nota 1\n2.-Nota 2\n3.-Nota 3\n4.-Salir");
			switch (opcion) {
		case 1:
			notasAlumnos(alumnos, nota1);
			break;
		case 2:
			notasAlumnos(alumnos, nota2);
			break;
		case 3:
			notasAlumnos(alumnos, nota3);
			break;
		}
	} while (opcion!=4);
	}
	
	private static void crearAlumnos(ArrayList<Alumno> alumnos) {
		String[] nombre={"nombre 1","nombre 2","nombre 3","nombre 4","nombre 5","nombre 6","nombre 7","nombre 8","nombre 9"};
		String[] apellido={"apellido 1","apellido 2","apellido 3","apellido 4","apellido 5","apellido 6","apellido 7","apellido 8","apellido 9"};
		for (int i = 0; i < 50; i++) {
			Alumno alumno = new Alumno(nombre[(int)(Math.random() * (9 - 0) + 0)], apellido[(int)(Math.random() * (9 - 0) + 0)],(int)(Math.random() * (101 - 0) + 0),
					(int)(Math.random() * (101 - 0) + 0),(int)(Math.random() * (101 - 0) + 0));
			alumnos.add(alumno);
		}
	}
	
	private static void asignarNotas(ArrayList<Alumno> alumnos, TreeMap<Integer, ArrayList<Integer>> nota1,
			TreeMap<Integer, ArrayList<Integer>> nota2, TreeMap<Integer, ArrayList<Integer>> nota3) {
		for (int i = 0; i < 50; i++) {
			Integer notas=alumnos.get(i).getNota1();
			if (nota1.containsKey(notas)) {
				nota1.get(notas).add(i);
			}else {
				ArrayList<Integer> indices=new ArrayList<>();
				indices.add(i);
				nota1.put(notas, indices);
			}
		}
		for (int i = 0; i < 50; i++) {
			Integer notas=alumnos.get(i).getNota2();
			if (nota2.containsKey(notas)) {
				nota2.get(notas).add(i);
			}else {
				ArrayList<Integer> indices=new ArrayList<>();
				indices.add(i);
				nota2.put(notas, indices);
			}
		}
		for (int i = 0; i < 50; i++) {
			Integer notas=alumnos.get(i).getNota3();
			if (nota3.containsKey(notas)) {
				nota3.get(notas).add(i);
			}else {
				ArrayList<Integer> indices=new ArrayList<>();
				indices.add(i);
				nota3.put(notas, indices);
			}
		}
	}
	
	private static void notasAlumnos(ArrayList<Alumno> alumnos, TreeMap<Integer, ArrayList<Integer>> nota) {
		System.out.println("\tNOTA 1");
		for (Integer notas : nota.keySet()) {
			System.out.println("Alumnos con un "+notas+":");
			for (int i = 0; i < nota.get(notas).size(); i++) {
				Integer indiceAlum= nota.get(notas).get(i);
				System.out.println(alumnos.get(indiceAlum).toString());
			}
		}
	}
}