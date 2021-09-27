package seleccion;

public class BurbujeoControlado {

	public static void burbujeo(Integer[] arreglo) {
		Integer aux;
		boolean hayIntercambio = true;
		int i = 0;

		while (hayIntercambio && i < arreglo.length - 1) {
			hayIntercambio = false;

			for (int j = arreglo.length - 1; j > i; j--) {
				if (arreglo[j] < arreglo[j - 1]) {
					hayIntercambio = true;
					aux = arreglo[j];
					arreglo[j] = arreglo[j - 1];
					arreglo[j - 1] = aux;
				}
			}

			i++;
		}
	}
}
