//구슬을 나누는 경우의 수

import java.math.BigInteger;

class Solution {
    public static int solution(int balls, int share) {
    	BigInteger bigBalls = BigInteger.valueOf(balls);
    	BigInteger bigShare = BigInteger.valueOf(share);
    	BigInteger bigDown = bigBalls.subtract(bigShare);

        BigInteger up = factorial(bigBalls);
        BigInteger down = factorial(bigDown).multiply(factorial(bigShare));

        
        return (up.divide(down)).intValue();
    }
    
    public static BigInteger factorial(BigInteger n) {
        if(n.intValue() <= 1) { return BigInteger.ONE; }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
