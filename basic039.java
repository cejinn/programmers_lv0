// 최빈값 구하기


import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
	    	int max=0, maxIndex=0, cnt=0;

	    	if(array.length == 1) {return array[0];}
	    	
	    	int[] index = new int[array.length];
	        Arrays.sort(array);

	    	//배열 복사
	    	for(int i=0; i<array.length; i++) { 
	    		index[i] = array[i];
	    	}

	    	// 중복 제거한 인덱스 배열
	    	index = Arrays.stream(index).distinct().toArray(); 

	        //빈도수를 구하는 배열
	    	int[] sum = new int[index.length];
	        
	        for(int ch=0; ch<index.length; ch++) {
	        	for(int kan=0; kan<array.length; kan++) {
	        		sum[ch] += (index[ch] == array[kan])? 1 : 0;
	        	}
	        }
	        
	        //제일 빈도수가 높은 값 구하기
	        for(int i=0; i<sum.length; i++) {
	        	max = max<sum[i]? sum[i] : max;
	        }
	        

	        //빈도수 확인
	        for(int i=0; i<sum.length; i++) {
	        	if(max == sum[i]) {cnt++; maxIndex=i;}
	        }
        
	        return cnt>1? -1 : index[maxIndex];
	    }

        
    
}
