// 개미 군단

class Solution {
    public int solution(int hp) {
        int cnt = 0;
        
        while(true) {
           if(hp<5) {break;}
        	hp = hp-5;
        	cnt++;
        }
        
        while(true) {
            if(hp<3) {break;}
        	hp = hp-3;
        	cnt++;
        }  
    
        cnt+=hp;

        return cnt;
    }
}
