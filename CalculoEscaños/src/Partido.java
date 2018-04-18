
public class Partido {
	private String nombre;
	private Integer votos;
	private Integer esca�os;
	private static Integer contnombre=1;
	public Partido() {
		this.nombre = "Partido "+contnombre;
		this.votos = 0;
		this.esca�os = 0;
		contnombre++;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getVotos() {
		return votos;
	}
	public void setVotos(Integer votos) {
		this.votos = votos;
	}
	public Integer getEsca�os() {
		return esca�os;
	}
	public void a�adirEsca�o() {
		this.esca�os++;
	}
	@Override
	public String toString() {
		return "Partido [nombre=" + nombre + ", votos=" + votos + ", esca�os=" + esca�os + "]";
	}
}