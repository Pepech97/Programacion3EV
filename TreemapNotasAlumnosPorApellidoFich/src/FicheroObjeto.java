import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class FicheroObjeto {
	private ObjectInputStream entrada;
	private ObjectOutputStream salida;

	public FicheroObjeto(String nombre, String io){
		//fin=false;
		if (io.equals("I")){//abrir el fichero para leer
			try{
				entrada=new ObjectInputStream(new FileInputStream(nombre));//asignar fichero a buffer
			}catch(IOException e){//controlar el error
				Leer.mostrarEnPantalla("Error al abrir el archivo de entrada "+e.getMessage());
				System.exit(1);
			}
		}
		if (io.equals("O")){//abrir el fichero para escribir
			try{
				salida=new ObjectOutputStream(new FileOutputStream(nombre));//asignar fichero a buffer
			}catch(IOException e){//controlar el error
				Leer.mostrarEnPantalla("Error al abrir el archivo de salida "+e.getMessage());
				System.exit(1);
			}
		}
	}
	
	public Boolean escribir(TreeMap<String,Integer> mapaAlumnos ){
		
		try {
			if(mapaAlumnos!=null){//si el objeto existe lo escribimos
				salida.writeObject(mapaAlumnos);
			}
		}catch(IOException e){//controlar el error de escritura
			Leer.mostrarEnPantalla("Error al leer en el archivo "+e.getMessage());
			System.exit(1);
		} catch (NullPointerException e) {//controlar el error de asignación de fichero
	        return false;
	    }
		return true;
	}
	public TreeMap<String,Integer> leer( ) {
		TreeMap<String,Integer> mapaAlumnos= new TreeMap<String,Integer>();
		try {
			mapaAlumnos = (TreeMap<String,Integer>) entrada.readObject();//leemos un registro
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mapaAlumnos=null;
		} catch (NullPointerException e) {
			mapaAlumnos= null;
		} catch(IOException e){
			//Leer.mostrarEnPantalla("Error al leer en el archivo "+e.getMessage());
			mapaAlumnos=null;
		} 
		return mapaAlumnos;
	}

	/*public Boolean escribir(List<Persona> persona ){
		
		try {
			if(persona!=null){//si el objeto existe lo escribimos
				salida.writeObject(persona);
			}
		}catch(IOException e){//controlar el error de escritura
			Leer.mostrarEnPantalla("Error al leer en el archivo "+e.getMessage());
			System.exit(1);
		} catch (NullPointerException e) {//controlar el error de asignación de fichero
	        return false;
	    }
		return true;
	}*/
	
	public void cerrar(String io){ 
		try{
			if(io.equals("I")){//cerrar el buffer de entrada
				entrada.close();
			}
			if(io.equals("O")){//cerrar el buffer de salida
				salida.close();
			}
		}catch(IOException e){//controlar la excepción
			Leer.mostrarEnPantalla("Error al cerrar el archivo "+e.getMessage());
			System.exit(1);
		}
	}
}
