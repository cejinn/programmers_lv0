// 짝수의 합
class Solution {
    public int solution(int n) {
        int sum =0;
        for(int i=0; i<=n; i++) {
         sum += i%2==0? i :0;
            }
        return sum;
    }
}
