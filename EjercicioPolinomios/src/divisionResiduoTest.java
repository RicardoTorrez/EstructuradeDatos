
public class divisionResiduoTest {
	public static void main(String[] args){
		//Datos del primer polinomio
		lista lista1 = new lista();
		
		lista1.insertar(5,4);
		lista1.insertar(-10,3);
		lista1.insertar(2,2);
		lista1.insertar(-7,1);
		lista1.insertar(1,0);
		//datos del segundo polinomio
		lista lista2 = new lista();

		lista2.insertar(1,1);
		lista2.insertar(-2,0);
		
		System.out.println("Polinomio 1");
		
		lista1.recorrer();
		
		System.out.println("Polinomio 2");
		
		lista2.recorrer();
		lista1.simplificarlistas(lista1);
		lista2.simplificarlistas(lista2);	
		System.out.println("SIMPLIFICACION");
		System.out.println("Polinomio 1");
		lista1.recorrer();
		System.out.println("Polinomio 2");
		lista2.recorrer();
		System.out.println("Division");
		lista1.divisionResiduo(lista1, lista2);
		
	}

}
