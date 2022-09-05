package webAutomation.webAutomation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.json.Json;

import com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator.Builder;

public class SixT {
	
	static String name;
	public static String getName() {
		return name;
		josn("test","test133","bangalore");
	}

	public static void setName(String name) {
		SixT.name = name;
	}

	public static String getId() {
		return Id;
	}

	public static void setId(String id) {
		Id = id;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		SixT.address = address;
	}

	static String Id;
	static  String address;
	
	
	public static void main(String args[]) {
		int[] arr = {1,3,5,6,0};
		System.out.println(sumarray(arr));			
	}

	private static int  sumarray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
		
		
		
	}
	
	public static void  josn(String string, String string2, String string3)
	{
		setName(string);
		setId(string2);
		setAddress(string3);
		setName(string3);
	    
	}
	
	
	
	
	
	}