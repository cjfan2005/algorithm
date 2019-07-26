package kent.algorithm.recursive;

public class Factorial {
	
	public int factorial(int n) {
		
		// 4! = 4*3*2*1
		// n! = n *(n-1)*(n-2)...
		
		if(n==1) return 1;
		
		return n * factorial(n - 1);
		
	}
}
