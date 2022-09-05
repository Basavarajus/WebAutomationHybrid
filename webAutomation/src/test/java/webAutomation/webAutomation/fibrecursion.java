package webAutomation.webAutomation;

public class fibrecursion {
	public static void main(String args[]) {
		
		
		
		System.out.println(fib(7));
		
		
	}
	
	static int fib(int n) {
		
		if(n<2) {
			return n;
		}
		
		return fib(n-1)+fib(n-2);
	}

}
