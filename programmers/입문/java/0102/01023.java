import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max= sides.length-1;
        Arrays.sort(sides);
        
        if(sides[max]<sides[0]+sides[1])
            answer=1;
        else
            answer=2;
        return answer;
    }
}
