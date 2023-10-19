package semana_08;

public class Arreglo {
	
	//  Atributos privados
	private int[] n;
	private int indice;
	//  Constructor
	public Arreglo() {
		n = new int[10];
		indice = 0;
	}
	//  Operaciones públicas básicas
	public int tamanio() {
		return indice;
	}
	public int obtener(int i) {
		return n[i];
	}
	
	private void intercambiar(int pos1, int pos2) {
		int aux = n[pos1];
		n[pos1] = n[pos2];
		n[pos2] = aux;
	}
	
	public void adicionarDistintoYordenar(int numero) { 
            for (int i=0;i<indice;i++) {
	        if (numero == n[i]) {
	            return; 
	        }
	    }
	    adicionar(numero); 
	    for (int i=0;i<indice-1;i++) {
	        for (int j=i+1;j<indice;j++) {
	            if (n[i] > n[j]) {
	                intercambiar(i,j);
	            }
	        }
	    }
	}
	//  Operaciones privadas
	private void ampliarArreglo() {
		int[] aux = n;
		n = new int[indice + 10];
		for (int i=0; i<indice; i++)
			n[i] = aux[i];
	}
	public void adicionar(int numero) {
		if (indice == n.length)
			ampliarArreglo();
		n[indice] = numero;
		indice ++;
	}
	
}
