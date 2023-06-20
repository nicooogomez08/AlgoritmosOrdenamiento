
public class Seleccion {
	static int comparaciones = 0, movimientos = 0;
	static int datos[] = { 64, 31, 78, 1, 24, 33, 36, 85, 27, 4, 12,8,34,23,22 };// desorden
	static int datos2[] = { 85, 78, 64, 36, 33, 31, 27, 24, 4, 1 };//mayor a menor
	static int datos3[] = { 1, 4, 24, 27, 31, 33, 36, 64, 78, 85 };//menor a mayor

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("En desorden: ");
		System.out.println("Datos iniciales:");
		imprimir(datos);
		System.out.println("Datos finales: ");
		selection(datos);
		System.out.println("# de comparaciones: " + comparaciones);
		System.out.println("# de movimientos: " + movimientos);
		System.out.println("\nEn orden descendente: ");
		System.out.println("Datos iniciales:");
		imprimir(datos2);
		System.out.println("Datos finales: ");
		selection(datos2);
		System.out.println("# de comparaciones: " + comparaciones);
		System.out.println("# de movimientos: " + movimientos);
		System.out.println("\nEn orden : ");
		System.out.println("Datos iniciales:");
		imprimir(datos3);
		System.out.println("Datos finales: ");
		selection(datos3);
		System.out.println("# de comparaciones: " + comparaciones);
		System.out.println("# de movimientos: " + movimientos);

	}

	public static void selection(int vector[]) {
		int mas_pequeno, pos, temp;

		for (int i = 0; i < vector.length - 1; i++) {
			mas_pequeno = vector[i];
			pos = i;
			for (int j = i + 1; j < vector.length; j++) { // toma la pos siguiente
				comparaciones++;
				if (vector[j] < mas_pequeno) { // ¿Es el siguiente < al anterior?
					movimientos++;
					mas_pequeno = vector[j];
					pos = j;
				}
			}
			if (pos != i) {
				temp = vector[i];
				vector[i] = vector[pos];
				vector[pos] = temp;
				
			}

		}
		imprimir(vector);
	}

	public static void imprimir(int vec[]) {

		for (int i = 0; i < vec.length; i++) {
			System.out.print(vec[i] + "-");
		}
		System.out.println("\n");
	}

}
