class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(int ch=0; ch<s1.length; ch++) {
            for(int kan=0; kan<s2.length; kan++) {
                answer += s1[ch].equals(s2[kan])? 1 : 0;
            }
        }

        return answer;
    }
}
