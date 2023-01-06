class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int length=cipher.length();
        int index=code-1;
        
            while(index<length){
            answer+=cipher.charAt(index);
                index+=code;
        }
        return answer;
    }
}
