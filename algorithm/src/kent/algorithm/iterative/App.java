package kent.algorithm.iterative;

public class App {

	public static void main(String[] args) {
		
		Algorithm a = new Algorithm();
		System.out.println("Iterative result = " + a.sumIterative(3));
		
		System.out.println("Recursive result = " + a.sumRecursive(5));
		
	}
}