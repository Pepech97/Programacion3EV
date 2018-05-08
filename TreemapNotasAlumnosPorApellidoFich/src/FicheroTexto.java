import java.io.*;

public class FicheroTexto implements Separable{
	private BufferedReader entrada;
	private BufferedWriter salida;

	public FicheroTexto(String nombre, String io){

		if (io.equals("I")){//abrir el fichero para leer
			try{
				entrada=new BufferedReader(new FileReader(nombre));//asignar fichero a buffer
			}catch(IOException e){//controlar el error
				Leer.mostrarEnPantalla("Error al abrir el archivo de entrada "+e.getMessage());
				System.exit(1);
			}
		}
		if (io.equals("O")){//abrir el fichero para escribir
			try{
				salida=new BufferedWriter(new FileWriter(nombre,true));//asignar fichero a buffer
			}catch(IOException e){//controlar el error
				Leer.mostrarEnPantalla("Error al abrir el archivo de salida "+e.getMessage());
				System.exit(1);
			}
		}
	}
	
	public Registro leer( ){
		Registro reg=null;
		String regTexto=null;
		String apellido= "";
		int nota=0;
		try {
			regTexto = entrada.readLine();//leemos un registro
			if(regTexto.length() != 0){// si tiene contenido procesamos sabiendo que separa cada campo y cuantos campos tiene
				// los valores de cada atributo estan separados por lo que devuelve getSeparador() En este caso ;
				if(regTexto.indexOf(getSeparador())!=-1){// recuperamos el valor del primer atributo		
					apellido= regTexto.substring(0, regTexto.indexOf(getSeparador()));
					regTexto = regTexto.substring(regTexto.indexOf(getSeparador()) + 1 );
				}
								// recuperamos el valor del tercer atributo
				try {
					nota = Integer.parseInt(regTexto);
				} catch(NumberFormatException e){
					Leer.mostrarEnPantalla("Datos erróneos se asigna 0.");
					nota=0;
				}
			}
			reg=new Registro(apellido,nota);
			return reg;
		}catch(IOException e){
			Leer.mostrarEnPantalla("Error al leer en el archivo "+e.getMessage());
			System.exit(1);
		} catch (NullPointerException e) {
			return null;
		}
		return reg;
	}

	public Boolean escribir(Registro reg ){
		
		try {
			if(reg!=null){//si el objeto existe lo escribimos
				salida.write(reg.toString());
			}
		}catch(IOException e){//controlar el error de escritura
			Leer.mostrarEnPantalla("Error al leer en el archivo "+e.getMessage());
			System.exit(1);
		} catch (NullPointerException e) {//controlar el error de asignación de fichero
	        return false;
	    }
		return true;
	}
	
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
