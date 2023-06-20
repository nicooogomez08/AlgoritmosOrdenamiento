
public class Insercion {
	static int comparaciones = 0, movimientos = 0;
	static int datos[] = { 56,53,1,38,84,50,50,2,41,34 };// desorden
	static int datos2[] = { 85, 78, 64, 36, 33, 31, 27, 24, 4, 1 };//mayor a menor
	static int datos3[] = { 1,2,3,4,5,6,7,8,9, };//menor a mayor
    static int j=0, a=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("En desorden: ");
		System.out.println("Datos iniciales:");
		imprimir(datos);
		System.out.println("Datos finales: ");
		Insertion(datos);
		imprimir(datos);
		System.out.println("# de comparaciones: " + comparaciones);
		System.out.println("# de movimientos: " + movimientos);
		System.out.println("\nEn orden descendente: ");
		System.out.println("Datos iniciales:");
		imprimir(datos2);
		
		System.out.println("Datos finales: ");
		Insertion(datos2);
		imprimir(datos2);
		System.out.println("# de comparaciones: " + comparaciones);
		System.out.println("# de movimientos: " + movimientos);
		System.out.println("\nEn orden : ");
		System.out.println("Datos iniciales:");
		imprimir(datos3);
		System.out.println("Datos finales: ");
		Insertion(datos3);
		imprimir(datos3);
		System.out.println("# de comparaciones: " + comparaciones);
		System.out.println("# de movimientos: " + movimientos);
	}

	public static void Insertion(int[] Vector) {
		for (int i = 0; i < Vector.length; i++) {
			int aux = Vector[i];
			int pos = i;
			
			// Desplazamiento de los elementos de la matriz
			while (pos > 0 && Vector[pos - 1] > aux) {// compara el actual con el de la izquierda y cambia
				if(Vector[pos - 1] > aux) {
					Vector[pos] = Vector[pos - 1];
					pos--;
					comparaciones++;
				}
				
				// insertar el elemento en su lugar
				Vector[pos] = aux;
				movimientos++;
			}

		}
	}
	  public static void imprimir(int vec[]) {

  		for (int i = 0; i < vec.length; i++) {
  			System.out.print(vec[i] + "-");
  		}
  		System.out.println("\n");
  	}
}