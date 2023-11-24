// 구슬을 나누는 경우의 수

class Solution {
    public int solution(int balls, int share) {
        int up = re(balls);
        int down = re(balls-share) * re(share);
        return up / down;
    }

    // 곱하는 재귀함수 사용
    int re (int n) {
        if(n==1) return 1;
        return n *= re(n-1);
    }
}
