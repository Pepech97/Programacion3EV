import java.util.*;
public class gestionTrenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Fecha, TreeSet<Tren>> fechaTrenes= new TreeMap<Fecha,TreeSet<Tren>>();
		TreeMap<Fecha, TreeSet<Billete>> fechaBilletes= new TreeMap<Fecha,TreeSet<Billete>>();
		TreeSet<Billete> billetes=new TreeSet<Billete>();
		crearMapa(fechaTrenes);
		menu(fechaTrenes, fechaBilletes,billetes);
	}

	private static void menu(TreeMap<Fecha, TreeSet<Tren>> fechaTrenes,
			TreeMap<Fecha, TreeSet<Billete>> fechaBilletes,TreeSet<Billete> billetes) {
		int opcion=0;
		do {
			opcion=Leer.pedirEntero("1.-Comprar Billete\n2.-Anular Billete\n3.-Salir");
			switch (opcion) {
			case 1:
				comprarBillete(fechaTrenes, fechaBilletes, billetes);
				break;
			case 2:
				anularBillete(fechaBilletes);
				break;
			}
		} while (opcion!=3);

	}

	private static void anularBillete(TreeMap<Fecha, TreeSet<Billete>> fechaBilletes) {
		Billete auxbillete=null;
		for (Fecha fecha : fechaBilletes.keySet()) {
			for (Billete billetes : fechaBilletes.get(fecha)) {
				System.out.println(billetes);

			}
		}

		for (Fecha fecha : fechaBilletes.keySet()) {

			if (fechaBilletes.get(fecha).isEmpty()) {
				System.out.println("No tienes billetes comprados");
			}else{
				Integer anularbillete=Leer.pedirEntero("Que billete quieres anular");
				for (Billete billetes : fechaBilletes.get(fecha)) {	
					if (anularbillete==billetes.getNumero()) {
						billetes.getVagon().anularAsiento(billetes.getAsiento());;
						auxbillete=billetes;
						
						billetes.setSiguiente(billetes.getSiguiente()-1);
					}	
				}
			}
			if (!fechaBilletes.get(fecha).isEmpty()) {
				fechaBilletes.get(fecha).remove(auxbillete);
			}
			
		}
		
	}

	private static void comprarBillete(TreeMap<Fecha, TreeSet<Tren>> fechaTrenes,
			TreeMap<Fecha, TreeSet<Billete>> fechaBilletes,TreeSet<Billete> Billetes) {
		int dia=Leer.pedirEntero("Elige el dia");
		for (Fecha fecha : fechaTrenes.keySet()) {
			if (fecha.getDia()==dia){
				for (Tren trenes : fechaTrenes.get(fecha)) {
					System.out.println(trenes);
				}
			}

		}
		Integer idtren=Leer.pedirEntero("Que tren quieres coger");
		int vagon;

		for (Fecha fecha : fechaTrenes.keySet()) {
			if (fecha.getDia()==dia){
				for (Tren trenes : fechaTrenes.get(fecha)) {
					if (trenes.getIdtren()==(idtren+100)) {
						System.out.println(trenes);
						vagon=trenes.asignarVagon();
						if(vagon==-1){
							System.out.println("No quedan plazas en el tren");
						}else {
							Billete billete=new Billete(trenes, trenes.getVagon(vagon));
							Billetes.add(billete);
							fechaBilletes.put(fecha, Billetes);
						}
					}
				}
			}

		}
	}

	private static void crearMapa(TreeMap<Fecha, TreeSet<Tren>> fechaTrenes ) {
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
