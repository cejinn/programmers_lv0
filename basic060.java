// 합성수 찾기

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=3; i<=n; i++) {
            for(int div = 2; div<(i-1); div++) {
                if(i%div == 0) {answer++; break;}
            }
        }
        return answer;
    }
}
