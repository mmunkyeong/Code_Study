class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        while(hp>0){
            if(hp>=5){
                hp=hp-5;
                answer+=1;
            }
            else if(hp>=3){
                hp=hp-3;
                answer+=1;
            }
            else{
                hp=hp-1;
                answer+=1;
            }
        }
        return answer;
    }
}
