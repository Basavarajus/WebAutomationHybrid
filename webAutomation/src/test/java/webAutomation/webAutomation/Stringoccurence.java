package webAutomation.webAutomation;

import java.util.ArrayList;
import java.util.List;

public class Stringoccurence {
	
	
	public static void main(String args[]) {
		String str = "This is an interview ongoing between Chingari and Basavaraju";
		
		
		System.out.println(checkvowels(str));
		
	}


	public static List<Integer> checkvowels(String str) {
		
		int vowels=0;
		int cons =0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i)=='o'| str.charAt(i)=='u') {
				vowels++;
				
			}
			else {
				cons++;
			}
		}
		List<Integer> list = new ArrayList<>();
		list.add(vowels);
		list.add(cons);
		return list;
	}
}
