import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] numarr = new int[emergency.length];
        int[] answer = new int[emergency.length];
        int num=0;
       
        for(int i=0; i<emergency.length; i++){
            numarr[i]=emergency[i];
        }
        Arrays.sort(numarr);
        
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(numarr[i]==emergency[j]){
                    answer[j]=emergency.length-i;
                }
            }
        }
        return answer;
    }
}
