import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
		Scanner sc= new Scanner(System.in);
		Byte n=sc.nextByte();
		Byte m=sc.nextByte();
		
		int [][] a =new int[n][m];
		int [][] b= new int[n][m] ;
		int count = 0;
		
	
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
			a[i][j]=sc.nextByte();
		   }
		}
		for(int i=0; i<n; i++) {
		for(int j=0; j<m; j++) {	
			b[i][j]=sc.nextByte();
		   }
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
			System.out.print(a[i][j]+b[i][j]+" ");
		    if(j==m-1)
		    	System.out.println();
			}
		}
   }
}
