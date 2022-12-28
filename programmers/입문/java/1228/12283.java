// 피자나눠먹기 3
class Solution {
    public int solution(int slice, int n) {
        int pizza=1;
     
            while((slice*pizza)/n <1){
                pizza++;
            }
        return pizza;
    }
}
