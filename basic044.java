//꼬리 문자열

class Solution {
    public String solution(String[] str_list, String ex) {
        String a ="";
        for(String s : str_list) {
        a += s.contains(ex)? "" : s;
            }
        return a;
    }
}