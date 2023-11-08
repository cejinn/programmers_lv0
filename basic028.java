// 점의 위치 구하기

class Solution {
    public int solution(int[] dot) {
        int answer = dot[0]<0? dot[1]<0? 3 : 2 : dot[1]<0? 4: 1;
        return answer;
    }
}