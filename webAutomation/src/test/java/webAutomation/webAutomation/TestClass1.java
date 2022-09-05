package webAutomation.webAutomation;

public class TestClass1 {
	
	public static void main(String args[]) {
		
	//	int arr[] = {-1,0,1,2,-1,-4};
		int arr[] = {1,2,3,4};
        findsubarray(arr);
	}

	private static void findsubarray(int[] arr) {
		boolean flag= false;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k =j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
					//	int subarray[] = new int[n];
						System.out.println(arr[i] + " " +arr[j]+ " " +arr[k]);
						flag= true;
					}
					else {
						flag=false;
					}
				}
			}
		}
		if(flag=false)
			System.out.println("No sub elements with 0 sum");
			
	}

}
