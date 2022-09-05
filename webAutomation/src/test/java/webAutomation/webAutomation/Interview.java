package webAutomation.webAutomation;

public class Interview {
	//1,2 ,6(skip),     1-10 range 
	
	public static void main(String args[]) {
		for(int i=1;i<10;i++){
			if(i==6) {
				continue;
			}
			else if(i==8) {
				break;
			}
			else {
				System.out.print(i);
				//continue;
			}
				
		}
	}
}

