// 중복된 숫자 개수
class Solution {
    public int solution(int[] array, int n) {
                int answer = 0;
        for(int i : array) {
            answer += n==i? 1 : 0;
        }
        return answer;
    }
}
