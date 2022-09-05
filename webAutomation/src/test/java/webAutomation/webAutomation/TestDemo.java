package webAutomation.webAutomation;

public class TestDemo {
	
	static int arr[]= {1,2,4};
	static int  n = arr.length;
	
	public static int rec(int arr[],int n) {
		
		if(n<=0)
			return 0;
		return(rec(arr,n-1)+ arr[n-1]);
		
	}
	
	public static void main(String args[]) {
		System.out.println(rec(arr, n));
	}

}
