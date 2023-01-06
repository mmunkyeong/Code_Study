class Solution {
    public int[] solution(int n, int[] numlist) {
        int count=0;
        int index=0;
        for(int i=0; i<numlist.length; i++){
          if(numlist[i]%n==0)
              count++;
        }
        
        int[] answer = new int[count];
           
        while(index<count){
        for(int k=0; k<numlist.length; k++){
            if(numlist[k]%n==0){
                answer[index]=numlist[k];
                index++;
                }
            }
        }
        return answer;
    }
}
