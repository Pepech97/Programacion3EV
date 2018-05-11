import java.util.Arrays;

public class Vagon {
	private Integer num;
	private int[] asientos = new int [10];
	private static Integer siguiente=1;
	
	public Vagon() {
		this.num = siguiente;
		siguiente++;
		if (siguiente==3) {
			siguiente=1;
		}
	}
	public void anularAsiento(Integer asiento){
		this.asientos[asiento-1]=0;
	}
	public Integer getNum() {
		return num;
	}
	public int[] getAsientos() {
		return asientos;
	}

	public void setAsientos(int[] asientos) {
		this.asientos = asientos;
	}

	@Override
	public String toString() {
		return "VAGON " + num + "\nAsientos" + Arrays.toString(asientos) + "\n";
	}
	
	
}
