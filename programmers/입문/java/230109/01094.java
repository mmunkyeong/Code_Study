import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max=Integer.MAX_VALUE*-1;
        int index_last=numbers.length-1;
        for(int i=0; i<numbers.length; i++){
           for(int j=1; j<numbers.length; j++){
               if(numbers[i]*numbers[j]>max&& i!=j){
                   max=numbers[i]*numbers[j];
               }
           }
        }
       answer=max;
        return answer;
    }
}
