import java.util.Arrays;

public class Burbuja {

	static int datos[] = { 64, 31, 78, 1, 24, 33, 36, 85, 27, 4, 12,8,34,23,22 };// desorden
	static int datos2[] = { 85, 78, 64, 36, 33, 31, 27, 24, 4, 1 };//mayor a menor
	static int datos3[] = { 1, 4, 24, 27, 31, 33, 36, 64, 78, 85 };//menor a mayor
      static int comparaciones=0;
      static int movimientos=0;
      static int iteraciones=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("NUMEROS MENOR A MAYOR:");
		System.out.println("En desorden: ");
		System.out.println("Datos iniciales:");
		imprimir(datos);
		System.out.println("Datos finales: ");
		burbuja(datos);
		imprimir(datos);
		System.out.println("# de comparaciones: " + comparaciones);
		System.out.println("# de movimientos: " + movimientos);
		System.out.println("\nEn orden descendente: ");
		System.out.println("Datos iniciales:");
		imprimir(datos2);
		
		System.out.println("Datos finales: ");
		burbuja(datos2);
		imprimir(datos2);
		System.out.println("# de comparaciones: " + comparaciones);
		System.out.println("# de movimientos: " + movimientos);
		System.out.println("\nEn orden : ");
		System.out.println("Datos iniciales:");
		imprimir(datos3);
		System.out.println("Datos finales: ");
		burbuja(datos3);
		imprimir(datos3);
		System.out.println("# de comparaciones: " + comparaciones);
		System.out.println("# de movimientos: " + movimientos);

	}
	public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {                                                              
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                    movimientos++;
                }
              comparaciones++;
            }
            iteraciones++;
        }
	}
     public static void imprimir(int vec[]) {

    		for (int i = 0; i < vec.length; i++) {
    			System.out.print(vec[i] + "-");
    		}
    		System.out.println("\n");
    	}



}
