// 옷가게 할인 받기

class Solution {
    public int solution(int price) {
        double answer = 0.0;
        
        answer = price >= 500000? price*0.8: price>=300000? price*0.9 : price>=100000? price*0.95 : price;
        
        return (int)answer;
    }
}