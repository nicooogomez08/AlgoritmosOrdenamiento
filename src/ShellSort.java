import java.util.Arrays;

public class ShellSort {
	static int datos[] = { 64, 31, 78, 1, 24, 33, 36, 85, 27, 4 };// desorden
	static int datos2[] = { 85, 78, 64, 36, 33, 31, 27, 24, 4, 1 };//mayor a menor
	static int datos3[] = { 1, 4, 24, 27, 31, 33, 36, 64, 78, 85 };//menor a mayor
    static int movimientos=0;
    static int comparaciones=0;
    static int iteraciones=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("En desorden: ");
		System.out.println("Datos iniciales:");
		imprimir(datos);
		System.out.println("Datos finales: ");
		shell(datos);
		imprimir(datos);
		System.out.println("# de comparaciones: " + comparaciones);
		System.out.println("# de movimientos: " + movimientos);
		System.out.println("\nEn orden descendente: ");
		System.out.println("Datos iniciales:");
		imprimir(datos2);
		
		System.out.println("Datos finales: ");
		shell(datos2);
		imprimir(datos2);
		System.out.println("# de comparaciones: " + comparaciones);
		System.out.println("# de movimientos: " + movimientos);
		System.out.println("\nEn orden : ");
		System.out.println("Datos iniciales:");
		imprimir(datos3);
		System.out.println("Datos finales: ");
		shell(datos3);
		imprimir(datos3);
		System.out.println("# de comparaciones: " + comparaciones);
		System.out.println("# de movimientos: " + movimientos);
	
		


	}
	
    public static void shell(int[] arreglo) {
    	int salto,i,j,k,aux;
    	salto=arreglo.length/2;
    	while(salto>0) {
    		for(i=0;i<arreglo.length;i++) {
    			j=i-salto;
    			while(j>=0) {
    				k=j+salto;
    				if(arreglo[j]<=arreglo[k]) {
    					j=-1;
    				}else {
    					aux= arreglo[j];
    					arreglo[j]=arreglo[k];
    					arreglo[k]=aux;
    					j-=salto;
    					movimientos++;
    				}
    				comparaciones++;
    			}
    		}
    		salto=salto/2;
    	}
 
    }
    public static void imprimir(int vec[]) {

  		for (int i = 0; i < vec.length; i++) {
  			System.out.print(vec[i] + "-");
  		}
  		System.out.println("\n");
  	}

}
