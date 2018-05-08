import java.util.*;
public class gestionTrenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Fecha, TreeSet<Tren>> fechaTrenes= new TreeMap<Fecha,TreeSet<Tren>>();
		crearMapa(fechaTrenes);
		
	}

	private static void crearMapa(TreeMap<Fecha, TreeSet<Tren>> fechaTrenes) {
		for (int i = 0; i <32 ; i++) {
			Fecha dia = new Fecha(i, 5, 2018);
			if (dia.getDia()!=null) {
				Tren tren1 = new Tren(dia,"Zaragoza", "Madrid");
				Tren tren2 = new Tren(dia,"Barcelona", "Jerez");
				Tren tren3 = new Tren(dia,"Sevilla", "Leon");
				TreeSet<Tren> Trenes=new TreeSet<Tren>();
				Trenes.add(tren1);
				Trenes.add(tren2);
				Trenes.add(tren3);
				fechaTrenes.put(dia, Trenes);
			}
			
		}
	}

}
