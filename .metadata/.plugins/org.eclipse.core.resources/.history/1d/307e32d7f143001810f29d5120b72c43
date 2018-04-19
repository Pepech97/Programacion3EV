import java.util.*;

public class GestionUsuarios {

	public static void main(String[] args) {
		TreeMap<String, String> usuarios = new TreeMap<>();
		menu(usuarios);
	}

	private static void menu(TreeMap<String, String> usuarios) {
		int opcion;
		do {
			opcion=Leer.pedirEntero("1.-Crear Usuario\n2.-Modificar contraseña\n3.-Eliminar Usuario\n4.-Salir");
			switch (opcion) {
			case 1:
				crearUsuarios(usuarios);
				break;
			case 2:
				modificarContraseña(usuarios);
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
			String contraseña=Leer.pedirCadena("Introduce tu contraseña");
			String contracifrada="";
			for (int i = 0; i < contraseña.length(); i++) {
				char charcontra = contraseña.charAt(i);
				int charcifrado = (int) charcontra;
				charcontra = (char) (charcifrado + 3);
				contracifrada = contracifrada + charcontra;
			}
			contraseña=contracifrada;
			boolean comprobarcont=true;
			do {
				comprobarcont=true;
				if (usuarios.get(usuario).equals(contraseña)) {
					usuarios.remove(usuario);
					System.out.println("Usuario eliminado correctamente");
				}else {
					contraseña=Leer.pedirCadena("Contraseña incorrecta, vuelve a introducir la contraseña");
					comprobarcont=false;
				}

			} while (comprobarcont==false);
		}
	}

	private static void modificarContraseña(TreeMap<String, String> usuarios) {
		String usuario=Leer.pedirCadena("Introduce el usuario:");
		if (!usuarios.containsKey(usuario)) {
			System.out.println("El usuario no existe");
		}else {
			String contraseña=Leer.pedirCadena("Introduce tu contraseña");
			String contracifrada="";
			for (int i = 0; i < contraseña.length(); i++) {
				char charcontra = contraseña.charAt(i);
				int charcifrado = (int) charcontra;
				charcontra = (char) (charcifrado + 3);
				contracifrada = contracifrada + charcontra;
			}
			
			contraseña=contracifrada;
			contracifrada="";
			if (usuarios.get(usuario).equals(contraseña)) {
					boolean comprobarcont=true;
					do {
					String nuevacontraseña=Leer.pedirCadena("Introduce la nueva contraseña");
					comprobarcont=true;
					String comprobar=Leer.pedirCadena("Vuelve a introducirla");
					if (nuevacontraseña.equals(comprobar)) {
						for (int i = 0; i < nuevacontraseña.length(); i++) {
							char charcontra = nuevacontraseña.charAt(i);
							int charcifrado = (int) charcontra;
							charcontra = (char) (charcifrado + 3);
							contracifrada = contracifrada + charcontra;
						}
						nuevacontraseña=contracifrada;
						usuarios.put(usuario, nuevacontraseña);
						System.out.println("Contraseña modificada correctamente");
					}else {
						comprobarcont=false;
						System.out.println("Las contraseñas no coinciden");
					}
					} while (comprobarcont==false);
			}else {
				System.out.println("Contraseña incorrecta");
			}
		}
	}

	private static void crearUsuarios(TreeMap<String, String> usuarios) {
		boolean usuCorrecto = true;
		String usuario = Leer.pedirCadena("Introduce el usuario:");
		String contraseña = Leer.pedirCadena("Introduce la contraseña:");
		do {
			usuCorrecto = true;
			String contracifrada = "";
			for (int i = 0; i < contraseña.length(); i++) {
				char charcontra = contraseña.charAt(i);
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
				contraseña = Leer.pedirCadena("Caracteres incorrectos, introduzca otra contraseña");
			}
			contraseña = contracifrada;
		} while (usuCorrecto == false);
		if (usuarios.containsKey(usuario)) {
			System.out.println("El usuario ya existe");
		} else {
			usuarios.put(usuario, contraseña);
		}
	}

}
