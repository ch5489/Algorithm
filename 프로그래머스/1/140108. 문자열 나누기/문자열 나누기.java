import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String s) {
         
        List<String> res = new ArrayList<>();
        int answer = 0;

        boolean st = true;
        int sam = 0;
        int dif = 0;
        String temp = s;

        for(int i=0; i<s.length();i++){
            if(temp.equals("")){
                break;
            } else if (temp.length()==1) {
                res.add(temp);
                temp = "";
            }else {
                res.add(subStr(temp, st, sam, dif));
                temp =temp.substring(subStr(temp, st, sam, dif).length());
                
            }

        }

        answer = res.size();

       return answer;
    }

    public static String subStr (String s, boolean st, int sam, int dif){
       String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (st) {
                char ch = s.charAt(0);
                if (ch == s.charAt(i)) {
                    sam += 1;
                } else {
                    dif += 1;
                }

                if (sam > 0 && sam == dif) {
                    str =s.substring(0,i+1);
                    st = false;
                }else {
                    str = s;
                }

            }else {
                break;
            }
        }
        return str;
    }
}