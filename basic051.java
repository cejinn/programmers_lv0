// 진료 순서 정하기

import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
    	int[] origin = new int[emergency.length];  //원본 저장
    	int[] answer = new int[emergency.length];  //정답용
    	
    	//배열 복사
    	for(int i=0; i<origin.length; i++) {  
    		origin[i] = emergency[i];
    	}
    	
    	//배열 정렬
        Arrays.sort(emergency);
        
        //값을 비교해서 넣기
        for(int ch=0; ch<origin.length; ch++) {
        	for(int kan=0; kan<emergency.length; kan++) {
        		if(emergency[ch] == origin[kan]) {answer[ch] = origin.length-kan; break;}
        	}
        }    	
        
        return answer;
    }
}
