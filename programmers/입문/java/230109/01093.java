import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        String num_string=my_string.replaceAll("[^0-9]","");
        int[] answer = new int[num_string.length()];
        int number=Integer.parseInt(num_string);
        int index=0;
        
        while(number>=1){
            answer[index]=number%10;
            number/=10;
            index++;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
