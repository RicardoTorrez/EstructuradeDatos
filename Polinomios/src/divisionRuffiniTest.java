
public class divisionRuffiniTest {
	public static void main(String[] args){
		//Datos del primer polinomio
		lista lista1 = new lista();
		lista lista2 = new lista();
		
		/**
		 * Dato agregar todos los elementos del polinomio
		 * sin faltar un numero ejemplo
		 * 
		 * 3x^2 + 2x^1 + 12x^0 forma correcta
		 * 
		 * 3x^2 + 12x^0 forma incorrecta
		 * 
		 * Este m�todo solo funciona si 
		 * el divisor es un binomio de la forma x � a
		 */
		
		/**
		 * EJEMPLO 1 
		lista1.insertar(5,4);
		lista1.insertar(-10,3);
		lista1.insertar(2,2);
		lista1.insertar(-7,1);
		lista1.insertar(1,0);
		//datos del segundo polinomio
		

		lista2.insertar(1,1);
		lista2.insertar(-2,0);
		**/
		
		// EJEMPLO2
		
		lista1.insertar(1, 4);
		lista1.insertar(0, 3);
		lista1.insertar(-3, 2);
		lista1.insertar(0, 1);
		lista1.insertar(2, 0);
		
		lista2.insertar(1,1);
		lista2.insertar(-3,0);
		
		
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
		lista1.divisionRuffini(lista1, lista2);
		
	}

}
