# 피자 나눠먹기(2)
  
  class Solution {
    public int solution(int n) {
        int pizza=1;
        
        while((pizza*6)%n !=0)
            pizza+=1;
            
        return pizza;
     
        
}
}
