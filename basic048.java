// 모스 부호 (1)

class Solution {
    public String solution(String letter) {
    	//데이터 준비
        String answer = "";
        String[] letter_str = letter.split(" ");
    	String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    	
        //데이터 처리
    	for(int ch=0; ch<letter_str.length; ch++) {
    		for(int kan = 0; kan<morse.length; kan++) {
    			if(letter_str[ch].equals(morse[kan])) {answer += alpha[kan]; break;}
    			else {answer += "";}
    		}
    	}

        return answer;
    }
}
