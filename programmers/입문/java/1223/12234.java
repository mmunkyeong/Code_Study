import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int center=0;
        Arrays.sort(array);
        center=array.length/2;
        answer=array[center];
        return answer;
    }
}
