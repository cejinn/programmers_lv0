// 가위 바위 보

class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++) {
        	switch(rsp.charAt(i)) {
        	case '2' : answer += 0; break;
        	case '5' : answer += 2; break;
        	case '0' : answer += 5; break;
        	}
        }
        return answer;
    }
}
