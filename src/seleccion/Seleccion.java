package seleccion;

public class Seleccion {

	public static void seleccion(Integer[] arreglo) {
		int posMax;
		Integer aux;
		for (int i = arreglo.length - 1; i > 0; i--) { // start from last position
			posMax = 0;
			for (int j = 0; j <= i; j++) {
				if (arreglo[j] > arreglo[posMax])
					posMax = j;
			}
			aux = arreglo[i];
			arreglo[i] = arreglo[posMax];
			arreglo[posMax] = aux;
		}
	}
}
