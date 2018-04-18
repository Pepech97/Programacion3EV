import java.util.*;

public class GestionUsuarios {

	public static void main(String[] args) {
		TreeMap<String, String> usuarios = new TreeMap<>();
		menu(usuarios);
	}

	private static void menu(TreeMap<String, String> usuarios) {
		int opcion;
		do {
			opcion=Leer.pedirEntero("1.-Crear Usuario\n2.-Modificar contrase�a\n3.-Eliminar Usuario\n4.-Salir");
			switch (opcion) {
			case 1:
				crearUsuarios(usuarios);
				break;
			case 2:
				modificarContrase�a(usuarios);
				break;
			case 3:
				eliminarUsuario(usuarios);
				break;
			}
		} while (opcion!=4);

	}

	private static void eliminarUsuario(TreeMap<String, String> usuarios) {
		String usuario=Leer.pedirCadena("Introduce el usuario: ");
		if (!usuarios.containsKey(usuario)) {
			System.out.println("El usuario no existe");
		}else {
			String contrase�a=Leer.pedirCadena("Introduce tu contrase�a");
			String contracifrada="";
			for (int i = 0; i < contrase�a.length(); i++) {
				char charcontra = contrase�a.charAt(i);
				int charcifrado = (int) charcontra;
				charcontra = (char) (charcifrado + 3);
				contracifrada = contracifrada + charcontra;
			}
			contrase�a=contracifrada;
			boolean comprobarcont=true;
			do {
				comprobarcont=true;
				if (usuarios.get(usuario).equals(contrase�a)) {
					usuarios.remove(usuario);
					System.out.println("Usuario eliminado correctamente");
				}else {
					contrase�a=Leer.pedirCadena("Contrase�a incorrecta, vuelve a introducir la contrase�a");
					comprobarcont=false;
				}

			} while (comprobarcont==false);
		}
	}

	private static void modificarContrase�a(TreeMap<String, String> usuarios) {
		String usuario=Leer.pedirCadena("Introduce el usuario:");
		if (!usuarios.containsKey(usuario)) {
			System.out.println("El usuario no existe");
		}else {
			String contrase�a=Leer.pedirCadena("Introduce tu contrase�a");
			String contracifrada="";
			for (int i = 0; i < contrase�a.length(); i++) {
				char charcontra = contrase�a.charAt(i);
				int charcifrado = (int) charcontra;
				charcontra = (char) (charcifrado + 3);
				contracifrada = contracifrada + charcontra;
			}
			
			contrase�a=contracifrada;
			contracifrada="";
			if (usuarios.get(usuario).equals(contrase�a)) {
					boolean comprobarcont=true;
					do {
					String nuevacontrase�a=Leer.pedirCadena("Introduce la nueva contrase�a");
					comprobarcont=true;
					String comprobar=Leer.pedirCadena("Vuelve a introducirla");
					if (nuevacontrase�a.equals(comprobar)) {
						for (int i = 0; i < nuevacontrase�a.length(); i++) {
							char charcontra = nuevacontrase�a.charAt(i);
							int charcifrado = (int) charcontra;
							charcontra = (char) (charcifrado + 3);
							contracifrada = contracifrada + charcontra;
						}
						nuevacontrase�a=contracifrada;
						usuarios.put(usuario, nuevacontrase�a);
						System.out.println("Contrase�a modificada correctamente");
					}else {
						comprobarcont=false;
						System.out.println("Las contrase�as no coinciden");
					}
					} while (comprobarcont==false);
			}else {
				System.out.println("Contrase�a incorrecta");
			}
		}
	}

	private static void crearUsuarios(TreeMap<String, String> usuarios) {
		boolean usuCorrecto = true;
		String usuario = Leer.pedirCadena("Introduce el usuario:");
		String contrase�a = Leer.pedirCadena("Introduce la contrase�a:");
		do {
			usuCorrecto = true;
			String contracifrada = "";
			for (int i = 0; i < contrase�a.length(); i++) {
				char charcontra = contrase�a.charAt(i);
				if ((charcontra < 'a' || charcontra > 'z') && (charcontra < 'A' || charcontra > 'Z')
						&& (charcontra < '0' || charcontra > '9')) {
					usuCorrecto = false;
				} else {
					int charcifrado = (int) charcontra;
					charcontra = (char) (charcifrado + 3);
					contracifrada = contracifrada + charcontra;
				}
			}
			if (usuCorrecto == false) {
				contrase�a = Leer.pedirCadena("Caracteres incorrectos, introduzca otra contrase�a");
			}
			contrase�a = contracifrada;
		} while (usuCorrecto == false);
		if (usuarios.containsKey(usuario)) {
			System.out.println("El usuario ya existe");
		} else {
			usuarios.put(usuario, contrase�a);
		}
	}

}
