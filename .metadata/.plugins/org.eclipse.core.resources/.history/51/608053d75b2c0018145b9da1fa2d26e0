
public class ColaDinamica implements Dinamizable{

	private Integer cola[];
	private Integer ultimo;
	private Integer frente;
	
	ColaDinamica(Integer tamanioMax) {
		cola = new Integer[tamanioMax];
		ultimo = 0;
		frente = 0;
	}
	public void add(Integer elemento){ // apilar un elemento
		if(ultimo==cola.length){  
			System.out.println("La pila esta llena.");
		}else{
			cola[ultimo] = elemento;
			ultimo++;
		}
	}

	public Integer delete(){ // desapilar un elemento
		int valor;
		if(ultimo == 0) {
			System.out.println("Pila vacía.");
			return 0;
		}
		else {
			valor=cola[frente];
			for (int i = 0; i < cola.length-1; i++) {
				cola[i]=cola[i+1];
				cola[i+1]=null;
			}
		}
		return valor;
	}
}