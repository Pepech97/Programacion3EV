
public class Tren {
	private Fecha fechaSalida;
	private String salida;
	private String destino;
	private Integer idtren=101;
	private Integer vagones;
	
	public Tren(Fecha fechaSalida, String salida, 
			String destino) {
		this.fechaSalida = fechaSalida;
		this.destino = destino;
		this.salida = salida;
		this.idtren = idtren+1;
	}
	
	public void comprarBillete(){
		if (vagones<10) {
			vagones++;
		}else {
			Leer.mostrarEnPantalla("El vagon esta lleno");
		}
	}
	
}
