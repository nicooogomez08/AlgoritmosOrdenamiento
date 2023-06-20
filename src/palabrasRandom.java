import java.util.Random;

public class palabrasRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] x = {"Sofia Parra", "Laura Lopez", "Juan Cruz", "Nicole Gómez", "David Perez"};
	        Random rand = new Random();

	        int n = rand.nextInt(5);
	        String z = x [n];

	        System.out.println(z);
	}

}

