
public class Billete implements Comparable<Billete>{
	private Integer numero;
	private Tren tren;
	private Vagon vagon;
	private Integer asiento;
	private Integer precio;
	private static int siguiente=1;
	
	public Billete(Tren tren, Vagon vagon, Integer asiento) {
		this.numero = siguiente;
		this.tren = tren;
		this.vagon = vagon;
		this.asiento = asiento;
		this.precio = (int)(Math.random() * (21 - 15) + 15);
		siguiente++;
	}

	public Vagon getVagon() {
		return vagon;
	}
	

	public Integer getAsiento() {
		return asiento;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setVagon(Vagon vagon) {
		this.vagon = vagon;
	}

	@Override
	public String toString() {
		return "Billete [numero=" + numero + ", tren=" + tren + ", vagon=" + vagon + ", asiento=" + asiento
				+ ", precio=" + precio + "]";
	}

	@Override
	public int compareTo(Billete numero) {
		// TODO Auto-generated method stub
		return this.numero-numero.numero;
	}
	
}
