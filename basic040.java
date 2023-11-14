//피자 나눠 먹기 (2)

class Solution {
    public int solution(int n) {
        int i=6;
        while(true) {
            if(i%n==0) {return i/6;}
            i+=6;
        }
        //6의배수%사람수==0 이면 6의배수/사람수 리턴
    }
}
