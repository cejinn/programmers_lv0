// 최댓값 만들기 (1)

class Solution {
    public int solution(int[] numbers) {
        int answer = 0, max=0, cnt=0;

        //최대값 찾기
        for(int n : numbers) {
            max = n>max? n : max;
        }
        
        for(int n : numbers) {
            if(n == max) {cnt++; }  //최대값 개수 확인
            if(n != max) {  //두 번째로 큰 값 찾기
                answer = n>answer? n : answer;
            }
        }
        return cnt>1? max*max : answer*max;
    }
}
