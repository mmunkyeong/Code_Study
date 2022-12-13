import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc= new Scanner(System.in);
		String a=sc.next();
		int count = 0;
		
		for(int i=1; i<=a.length(); i++) {
			count=i;
		}
		System.out.println(count);
   }
}
