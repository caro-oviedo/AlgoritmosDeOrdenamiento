package seleccion;

public class Burbujeo {

	public static void burbujeo(Integer[] arreglo) {
		Integer aux;
		for (int i = 0; i < arreglo.length - 1; i++) {
			for (int j = arreglo.length - 1; j > i; j--) {
				if (arreglo[j] < arreglo[j - 1]) {
					aux = arreglo[j];
					arreglo[j] = arreglo[j - 1];
					arreglo[j - 1] = aux;
				}
			}
		}
	}

}
