//문자 반복 출력하기

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int ch=0; ch<my_string.length(); ch++) {
            for(int kan=0; kan<n; kan++) {
                answer += my_string.charAt(ch);
            }
            
        }
        return answer;
    }
}
