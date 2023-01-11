class Solution {
    public int solution(int num, int k) {
        int answer=0;
        int s=13240;
        
        String num_str=Integer.toString(num);
        String k_str=Integer.toString(k);
        
        
        if(num_str.indexOf(k_str)==-1){
            return -1;
        }else {
            return num_str.indexOf(k_str)+1;
        }
    }
}
