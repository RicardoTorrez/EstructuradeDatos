
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arbol arbol1= new Arbol();
		
		arbol1.insertar(5);
		arbol1.insertar(4);
		arbol1.insertar(3);
		arbol1.insertar(2);
		arbol1.insertar(6);
		arbol1.insertar(7);
		arbol1.insertar(8);
		
		arbol1.imprimirPre();
		arbol1.imprimirEntre();
		arbol1.imprimirPost();
	}

}
