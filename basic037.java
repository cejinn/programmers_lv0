// 분수의 덧셈

class Solution {
    public static int gcd(int p, int q)
	 {
		if (q == 0) return p;
		return gcd(q, p%q);
	 }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int max = 0, min=0, ea=0;
        
        answer[1] = denom1*denom2;
        answer[0] = numer1*denom2 + numer2*denom1;
        
        if(answer[1]>=answer[0]) {
        	max = answer[1]; min = answer[0];
        	ea = gcd(answer[1], answer[0]);
        	}
        
        else {
        	max = answer[0]; min = answer[1];
        	ea = gcd(answer[0], answer[1]);
        	}
        
    	answer[0] /= ea;
    	answer[1] /= ea;
        

        return answer;
    }
}
