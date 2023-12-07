// 공 던지기

class Solution {
    public int solution(int[] numbers, int k) {
      int answer = 2*k-1;   //k번째 공던지는 사람의 번호
      
      answer %= numbers.length;  //배열 안에 있는 사람 고려
      if(answer==0) {answer = numbers.length;}  //나머지가 0인 경우는 마지막 사람
      return answer;
    }
}
