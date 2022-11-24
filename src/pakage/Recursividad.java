package pakage;

public class Recursividad {

	public static void main(String[] args) {

		int n = 3;
		
		System.out.println("El resultado de los números naturales es: " + sumarecursiva(n));
		
	}
	
	public static int sumarecursiva(int n) {
		
		int r;
		
		if (n == 1) {
			r = 1;
		}else {
			r = n + (n-1);
		}
		return r;
	}

}