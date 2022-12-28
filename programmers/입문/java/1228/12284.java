// 아이스아메리카노
class Solution {
    public int[] solution(int money) {
        int count= 0;
        count=money/5500;
        int change=0;
        change=money%5500;
        
        int[] answer = {count,change};
        
        return answer;
    }
}
