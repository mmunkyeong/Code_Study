class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length]; // numbers의 배열길이 만큼 answer 배열 길이 정하기 
        for(int i=0; i<numbers.length; i++){
            answer[i]=numbers[i]*2;
        }
        return answer;
    }
}
