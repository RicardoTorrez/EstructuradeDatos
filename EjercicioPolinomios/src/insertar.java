
public class insertar {
	public static void main(String[] args){
		lista lista1 = new lista();
		monomio dato1 = new monomio(-2,1);
		monomio dato2= new monomio(3,2);
		monomio dato3 = new monomio(-4,3);
		monomio dato4= new monomio(5,0);
		monomio dato5= new monomio(2,4);
		monomio dato6= new monomio(3,3);
		monomio dato7= new monomio(-2,2);
		monomio dato8= new monomio(3,1);
		monomio dato9= new monomio(-2,0);
		
		lista lista2 = new lista();
		
		lista1.insertar(dato1);
		lista1.insertar(dato2);
		lista1.insertar(dato3);
		lista1.insertar(dato4);
		
		
		lista2.insertar(dato5);
		lista2.insertar(dato6);
		lista2.insertar(dato7);
		lista2.insertar(dato8);
		lista2.insertar(dato9);
		
		System.out.println("Polinomio 1");
		
		lista1.recorrer();
		
		System.out.println("Polinomio 2");
		
		lista2.recorrer();
		lista2.simplificar(lista2);	
		//lista1.suma(lista1, lista2);
		
		//System.out.println("resta");
		
		lista1.resta(lista1, lista2);
		
		
	}

	
}
