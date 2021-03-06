
public class Arbol {
	private Nodo raiz;
	
	
	public Arbol(){
		raiz=null;
	}
	
	public void insertar(Integer elemento){
		Nodo nuevo= new Nodo(elemento);
		Nodo aux= raiz;
		Nodo ant=null;
		if(raiz==null){
			raiz=nuevo;
		} else {
			while(aux != null){
				if(nuevo.getDato()<aux.getDato()){
					ant= aux;
					aux = ant.getIzq();
				}else{
					ant = aux;
					aux= ant.getDer();
				}
			}
			if(nuevo.getDato()<ant.getDato()){
				ant.setIzq(nuevo);
			} else {
				ant.setDer(nuevo);
			}
			
		}
	}
	
    private void imprimirPre (Nodo reco)
    {
        if (reco != null)
        {
            System.out.print(reco.getDato() + " ");
            imprimirPre (reco.getIzq());
            imprimirPre (reco.getDer());
        }
    }
    
    public void imprimirPre ()
    {
        imprimirPre (raiz);
        System.out.println();
    }
    
    private void imprimirEntre (Nodo reco)
    {
        if (reco != null)
        {    
            imprimirEntre (reco.getIzq());
            System.out.print(reco.getDato() + " ");
            imprimirEntre (reco.getDer());
        }
    }

    public void imprimirEntre ()
    {
        imprimirEntre (raiz);
        System.out.println();
    }


    private void imprimirPost (Nodo reco)
    {
        if (reco != null)
        {
            imprimirPost (reco.getIzq());
            imprimirPost (reco.getDer());
            System.out.print(reco.getDato() + " ");
        }
    }


    public void imprimirPost ()
    {
        imprimirPost (raiz);
        System.out.println();
    }

}
