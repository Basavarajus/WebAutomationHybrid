package webAutomation.webAutomation;

import java.util.Arrays;

public class livspace {
	
	public static void main(String args[]) {
		int arr[] = {1,-3,4,5,-6,2,0};
		int n = arr.length;
		int neg[] = new int[n/2];
		int pos[] = new int[n/2];
		
		
		for(int i=0;i<n;i++) {
			if(arr[i]<=0) {
				neg[i]=arr[i];
				System.out.println(arr[i]);
			}
			else {
				System.out.println(arr[i]);
			    pos[i]=arr[i];
			}
		}
		
		System.out.println(Arrays.toString(neg) + Arrays.toString(pos));
		
		
		
		
		
		
		
//		
//		for(int i=0;i<n;i++) {
//				if(arr[i]<0) {
//					fin[i]=arr[i];
//					}
//				else {
//					fin[n]=arr[i];
//				}
//		}
		//System.out.println("Final Array is : "+fin);
	
	}

}
