// 특정 문자 제거하기

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            answer+=my_string.charAt(i)==letter.charAt(0)? "" : my_string.charAt(i);
            }
        return answer;
    }
}