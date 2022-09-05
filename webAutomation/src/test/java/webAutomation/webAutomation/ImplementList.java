package webAutomation.webAutomation;

import java.util.Arrays;

public class ImplementList {
	
	public static void main(String args[]) {
	
		int arr[] = {1,2,3,5,7,10};
		String sentence = "Given number    exist  in array";
		if(findnuminarray(arr, 9)) {
			System.out.println("Given number exist in array");
		}
		else {
			System.out.println("Given number not found in array");
		}
		
		findMaxcharastring(sentence);
		
		
		
	}
	
	private static void findMaxcharastring(String sentence) {
			String[] words = sentence.split(" ");
			int maxchar = 0;
			String maxString =null;
			for(String word:words) {
				if(maxchar>word.length()) {
					continue;
				}
				else {
					maxchar = word.length();
					maxString = word;
				}
			}
			//System.out.println(maxchar);
			System.out.println(maxString);
		
	}

	public static boolean findnuminarray(int[] arr,int num){
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;
			}
			else {
				continue;
			}
		}
		return false;
		
	}

}
