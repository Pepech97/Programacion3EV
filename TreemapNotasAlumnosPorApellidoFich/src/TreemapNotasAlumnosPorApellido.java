import java.util.*;
public class TreemapNotasAlumnosPorApellido {

	public static void main(String[] args) {
		/*TreeMap<String,Integer> mapaAlumnos=new TreeMap<String, Integer>();
		String apellido;
		Integer nota;
		FicheroTexto fichTexto = new FicheroTexto("fichero.txt","I");//Apertura del fichero de entrada.donde leemos
		leeFichero(mapaAlumnos, fichTexto);
		Leer.mostrarEnPantalla(mapaAlumnos.toString());
		apellido=Leer.pedirCadena("Apellido (\"*\": fin)");
		while(!apellido.equals("*")){
			if(mapaAlumnos.containsKey(apellido)){
				Leer.mostrarEnPantalla("No se puede repetir el apellido");
			}else{
				do{
					nota=Leer.pedirEntero("Nota entre 1 y 10: ");
				}while(nota < 1 || nota > 10);
				mapaAlumnos.put(apellido, nota);
			}
			apellido=Leer.pedirCadena("Apellido (\"*\": fin)");
		}
		FicheroObjeto ficheroObjeto;
		ficheroObjeto = new FicheroObjeto("fichMapAluApe.da2","O");//abrimos el fichero para escritura
		ficheroObjeto.escribir(mapaAlumnos);
		ficheroObjeto.cerrar("O");

		//mostramos el primer mapa
		muestraMapa(mapaAlumnos);
		 */
		FicheroObjeto ficheroObjeto;
		TreeMap<String,Integer> mapaAlumnos2=new TreeMap<String, Integer>();
		ficheroObjeto = new FicheroObjeto("fichMapAluApe.da2","I");
		mapaAlumnos2 = ficheroObjeto.leer();

		muestraMapa(mapaAlumnos2);

	}// main

	private static void leeFichero(TreeMap<String,Integer> mapaAlumnos, FicheroTexto fichTexto) {
		Registro reg;
		reg = fichTexto.leer();
		while (reg != null) {
			//lista.add(reg);//lo añadimos a la lista
			mapaAlumnos.put(reg.getApellido(), reg.getNota());			
			Leer.mostrarEnPantalla("Apellido: " + reg.getApellido());//imprimimos apellido
			Leer.mostrarEnPantalla("Nota : " + reg.getNota()+"\n");//imprimimos edad
			reg = fichTexto.leer();//leemos siguiente
		}
		fichTexto.cerrar("I");//cerrar fichero de lectura 
	}
	
	private static void muestraMapa(TreeMap<String,Integer> mapaAlumnos){
		int nota;
		for (String claveApe: mapaAlumnos.keySet()){ // Recorremos el conjunto generado por keySet,
			// contendrá las claves.
			nota=mapaAlumnos.get(claveApe); //Para cada clave, accedemos a su valor
			Leer.mostrarEnPantalla(claveApe + ":  " + nota); 			
		}
		System.out.println("\n**************************************\n");

		//obtenemos una lista con todos los pares clave/valor del mapa
		Set <Map.Entry< String, Integer> > unSet = mapaAlumnos.entrySet();

		//recorremos cada objeto de la lista anterior
		for(Map.Entry<String, Integer> mEntry: unSet){
			Leer.mostrarEnPantalla(mEntry.getKey() + ": " + mEntry.getValue());
		}

		System.out.println("\n**************************************\n");

		// ahora hacemos el recorrido usando un iterador
		Iterator< Map.Entry<String, Integer> > it = mapaAlumnos.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<String, Integer> mEntry = (Map.Entry<String, Integer>)it.next();
			Leer.mostrarEnPantalla(mEntry.getKey() + ": " + mEntry.getValue());
		}
	}
}
