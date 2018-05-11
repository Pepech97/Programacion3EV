
public class Billete implements Comparable<Billete>{
	private Integer numero;
	private Tren tren;
	private Vagon vagon;
	private Integer asiento;
	private Integer precio;
	private static int siguiente=1;
	private static int auxasiento=1;
	
	public Billete(Tren tren, Vagon vagon) {
		this.numero = siguiente;
		this.tren = tren;
		this.vagon = vagon;
		this.asiento = auxasiento;
		if (auxasiento==10) {
			auxasiento=0;
		}
		this.precio = (int)(Math.random() * (21 - 15) + 15);
		siguiente++;
		auxasiento++;
	}

	public Vagon getVagon() {
		return vagon;
	}
	

	public Integer getAsiento() {
		return asiento;
	}
	public static int getSiguiente(){
		return siguiente;
	}

	public static void setSiguiente(int siguiente) {
		Billete.siguiente = siguiente;
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
