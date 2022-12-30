import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c="*";
        
        for(int i=1; i<=n; i++){
          System.out.println(c.repeat(i));   //repeat i만큼 문자열 반복
        }
    }
}
