
public class Metodos {
	private Nodo inicio;
	
	public boolean isListavacia(){
		return inicio == null;
	}
	
	public void insertar(Integer elemento){
		
		Nodo nuevo= new Nodo(elemento);
		
		if (isListavacia()){
			inicio= nuevo;
		}else{
			Nodo aux= inicio;
			
			while(aux.getSiguiente()!=null){
				aux=aux.getSiguiente();
			}
			
			aux.setSiguiente(nuevo);
		}
		
	}
	
	public void recorrer(){
		long Tinicio, Tfin, tiempo;
		Tinicio = System.currentTimeMillis();
		Nodo aux= inicio;
		
		while(aux!=null){
			System.out.println(aux.getDato());
			
			aux= aux.getSiguiente();
		}
		System.out.println(" ");
		Tfin= System.currentTimeMillis();
		tiempo= Tfin-Tinicio;
		System.out.println("Tiempo de recorrer en milisegundos" + tiempo);
	}
	
	
	public void ordenarPolinomioBurbuja() {
		long Tinicio, Tfin, tiempo;
		Tinicio = System.currentTimeMillis();
		if (inicio == null) {
			System.out.println("no hay datos");
		}else{
			Nodo aux = inicio;
			Nodo aux2 = null;
			Integer auxDato = 0;

			while (aux != null) {
				aux2 = aux.getSiguiente();
				while (aux2 != null) {

					if (aux.getDato() < aux2.getDato()) {
						auxDato = aux.getDato();
						aux.setDato(aux2.getDato());
						aux2.setDato(auxDato);

					}else{

						aux2 = aux2.getSiguiente();
					}
				}
				aux = aux.getSiguiente();
			}	
		}
		Tfin= System.currentTimeMillis();
		tiempo= Tfin-Tinicio;
		System.out.println("Tiempo de ejecucion en milisegundos" + tiempo);
	}
	
	public static void Shell() {
		
		System.out.println("");
		System.out.print("Shell");
		
		
	}

	

}
