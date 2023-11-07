// 삼각형의 완성조건 (1)

class Solution {
    public int solution(int[] sides) {
        int sum=0, max=0;
        int answer = 0;
        for(int i=0; i<sides.length; i++) { 
            sum+=sides[i];
            max=sides[i]>max? sides[i] : max;
            }
        sum-= max;
        return answer=max<sum? 1 : 2;
    }
}