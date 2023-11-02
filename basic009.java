class Solution {
    public int solution(int n) {
        int answer = n<=7? 1 : (n/7 + 1);
        return answer;
    }
}
