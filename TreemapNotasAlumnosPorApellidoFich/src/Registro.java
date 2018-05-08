
public class Registro implements Separable{
	private String apellido;
	private int nota;
		
	public Registro(String apellido, int nota) {
		this.apellido = apellido;
		this.nota = nota;
	}

	public String getApellido() {
		return apellido;
	}

	public int getNota() {
		return nota;
	}

	@Override
	public String toString() {// formato para la escritura en el archivo
		return apellido+getSeparador()+nota+"\n";
	}
	
}
