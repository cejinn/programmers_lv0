//flag에 따라 다른 값 반환하기

class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = flag? a+b : a-b;
        return answer;
    }
}
