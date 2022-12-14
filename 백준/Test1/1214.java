
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
	    String output="";
	    int tmp;
	    
		Scanner sc= new Scanner(System.in);
		String input=sc.next();
		
		for(int i=0; i<input.length(); i++) {
			
			tmp=(int)input.charAt(i);
			
			if((65<=tmp)&&(tmp<=90)) {
			
				output+=(char)(tmp+32);
			
			}else if((97<=tmp)&&(tmp<=122)) {
				
				output+=(char)(tmp-32);
				
			}else {
				
				output +=(char)tmp;
				
			}
		}
		System.out.println(output);
		
   }
}
