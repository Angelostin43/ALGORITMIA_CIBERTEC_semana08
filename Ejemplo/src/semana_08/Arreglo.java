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
	public void adicionar(int numero) {
		if (indice == n.length)
			ampliarArreglo();
		n[indice] = numero;
		indice ++;
	}
	//  Operaciones públicas complementarias
	public void buscarRezagar(int numero) {
		int pos = buscar(numero);
		if (pos != -1)
			for (int i=pos; i<indice-1; i++)
				intercambiar(i, i+1);
	}
	public void buscarPriorizar(int numero) {
		int pos = buscar(numero);
		if (pos != -1)
			for (int i=pos; i>0; i--)
				intercambiar(i, i-1);
	}
	public void invertirArreglo() {
		int i = 0, j = indice-1;
		while (i < j) {
			intercambiar(i, j);
			i ++;
			j --;
		}
	}
	//de menor a mayor
	public void ordenarArreglo() {
		for (int i=0; i<indice-1; i++)
			for (int j=i+1; j<indice; j++)
				if (n[i] > n[j])
					intercambiar(i, j);
	}
	//  Operaciones privadas
	private void ampliarArreglo() {
		int[] aux = n;
		n = new int[indice + 10];
		for (int i=0; i<indice; i++)
			n[i] = aux[i];
	}
	private int buscar(int numero) {
		for (int i=0; i<indice; i++)
			if (n[i] == numero)
				return i;
		return -1;
	}
	private void intercambiar(int pos1, int pos2) {
		int aux = n[pos1];
		n[pos1] = n[pos2];
		n[pos2] = aux;
	}
	
}
