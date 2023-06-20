import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Ej2 {
	static int numEstudiantes = 5, j = 0, a = 0;
	static int codigo[] = new int[numEstudiantes];
	static String nombre[] = new String[numEstudiantes];
	static int notas[][] = new int[5][5];

	static String[] x = { "Carolina Parra", "Estefania Lopez", "Andrea Cruz", "Daniela Gomez", "Bernardo Perez" };
	static Random rand = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TABLA INICIAL:\n");
		llenarMostrar();
		System.out.println("\nTABLA ORGANIZADA POR NOMBRE:\n");
		ordenarPorNombre();
		imprimirTodo();
		System.out.println("\nBUSCAR ESTUDIANTE POR CODIGO\n");
		BuscarPorCodigo();
		System.out.println("\nTABLA ORGANIZADA POR DEFINITIVA:\n");
		ordenarPorNotaDef();
		imprimirTodo();
	}

	public static void llenarMostrar() {

		System.out.println("Cod\tNombre\t\tNota1\tNota2\tNota3\tDefinitiva");

		for (int i = 0; i < numEstudiantes; i++) {

			codigo[i] = (int) Math.floor(Math.random() * (5 - 1 + 1) + 1);
			nombre[i] = x[i];

			System.out.print(codigo[i] + "\t");
			System.out.print(nombre[i] + "\t");
			int definitiva = 0;
			for (int j = 0; j < 3; j++) {

				notas[i][j] = (int) Math.floor(Math.random() * (5 - 1 + 1) + 1);
				definitiva += notas[i][j];
				System.out.print(notas[i][j] + "\t");

			}
			notas[i][4] = definitiva / 4;
			System.out.print("Def:" + notas[i][4] + "\n");
		}

	}

	public static void ordenarPorNombre() {

		for (int i = 0; i < nombre.length; i++) {
			String aux = nombre[i];
			int aux2 = codigo[i];
			int aux3 = notas[i][i];
			int pos = i;

			// Desplazamiento de los elementos de la matriz
			while (pos > 0 && nombre[pos - 1].charAt(0) > aux.charAt(0)) {// compara el actual con el de la izquierda y
																			// cambia

				nombre[pos] = nombre[pos - 1];
				codigo[pos] = codigo[pos - 1];
				cambiarFila(pos, pos - 1);

				pos--;
			}

			// insertar el elemento en su lugar
			nombre[pos] = aux;
			codigo[pos] = aux2;

		}
	}

	public static void ordenarPorNotaDef() {

		for(int i=0;i<4;i++) {
			
				String aux3 = nombre[i];
				int aux2 = codigo[i];
				int aux = notas[i][4];
				int pos = i;
				// Desplazamiento de los elementos de la matriz
				while (pos > 0 && notas[pos-1][4] < aux) {// compara el actual con el de la izquierda y
																				// cambia

					nombre[pos] = nombre[pos - 1];
					codigo[pos] = codigo[pos - 1];
					cambiarFila(pos, pos - 1);

					pos--;
				}

				// insertar el elemento en su lugar
				nombre[pos] = aux3;
				codigo[pos] = aux2;
			}
		}
	
	public static void cambiarFila(int pos, int pos2) {
		int auxiliar;
		for (int i = 0; i < notas[pos].length; i++) {// recorrer toda la primera fila
			auxiliar = notas[pos][i];
			notas[pos][i] = notas[pos2][i];
			notas[pos2][i] = auxiliar;

		}
	}

	public static void imprimirTodo() {

		System.out.println("Cod\tNombre\t\tNota1\tNota2\tNota3\tDefinitiva");

		for (int i = 0; i < numEstudiantes; i++) {

			System.out.print(codigo[i] + "\t");
			System.out.print(nombre[i] + "\t");

			for (int j = 0; j < 3; j++) {

				System.out.print(notas[i][j] + "\t");

			}

			System.out.print("Def:" + notas[i][4] + "\n");
		}
	}

	public static void BuscarPorCodigo() {
		int x = 3;
		System.out.println("Cod\tNombre\t\tNota1\tNota2\tNota3\tDefinitiva");

		for (int i = 0; i < codigo.length - 1; i++) {
			if (x == codigo[i]) {

				System.out.print(codigo[i] + "\t");
				System.out.print(nombre[i] + "\t");
				for (int j = 0; j < notas[i].length; j++) {// recorrer toda la primera fila
					System.out.print(notas[i][j] + "\t");

				}

			}
		}
	}
}
