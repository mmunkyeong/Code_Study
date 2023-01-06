class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int num=0;
        int count=numbers.length-1;
        
        if(direction.equals("right")){
            answer[0]=numbers[count];
            for(int i=1; i<numbers.length; i++){
                answer[i]=numbers[i-1];
            }
        }
        else if (direction.equals("left")){
            answer[count]=numbers[0];
            for(int i=0; i<numbers.length-1; i++){
                answer[i]=numbers[i+1];
            }
        }
        return answer;
    }
}
