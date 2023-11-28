// 2차원으로 만들기

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int temp = num_list.length/n;
        int[][] answer = new int[temp][n];
        int cnt=0;
        
        for(int ch=0; ch<temp; ch++) {
            for(int kan=0; kan<n; kan++) {
                answer[ch][kan] = num_list[cnt];
                cnt++;
            }
        }
        return answer;
    }
}
