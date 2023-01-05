class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int num=0;// numbers 가져올 때 사용 
        
        for(int i=1; i<k; i++){
        num+=2; //k번째로 공을 던지는 사람 구하기, 오른쪽 한명을 건너뛰기 +2
        }
        num %=numbers.length; // 배열의 길이보다 길어질 수 있으니 나누기
        answer=numbers[num];
        return answer;
    }
}
