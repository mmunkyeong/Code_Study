import java.lang.Math;
class Solution {
    public int[] solution(int n) {
        double b= n;
        int count=(int)Math.round(b/2);
        int[] answer = new int[count];
        int index=0;
        
        for(int i=0; i<=n; i++){
            if(i%2==1){
                answer[index]=i;
                index++;
            }
        }
        
        return answer;
    }
}
