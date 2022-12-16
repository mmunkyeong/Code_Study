import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%4==0 && n!=n%100 && n%400==0) {
			System.out.print("1");
		}
		else {
			System.out.print("0");
		}
	
   }
}
