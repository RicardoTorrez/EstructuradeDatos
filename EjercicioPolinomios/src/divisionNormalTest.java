
public class divisionNormalTest {
	public static void main(String[] args){
lista lista1 = new lista();

lista lista2 = new lista();
		
/**
 * Dato agregar todos los elementos del polinomio
 * sin faltar un numero ejemplo
 * 
 * 3x^2 + 2x^1 + 12x^0 forma correcta
 * 
 * 3x^2 + 12x^0 forma incorrecta
 */

		lista1.insertar(1,5);
		lista1.insertar(2,3);
		lista1.insertar(-1,1);
		lista1.insertar(-8, 0);
		lista1.insertar(0,4);
		lista1.insertar(0,2);
		
		//datos del segundo polinomio

		lista2.insertar(1, 2);
		lista2.insertar(-2,1);
		lista2.insertar(1,0);
		

		
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
		
		lista1.division(lista1, lista2);
	}
}