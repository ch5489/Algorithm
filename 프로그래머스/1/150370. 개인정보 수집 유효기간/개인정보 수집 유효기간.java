import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int[] toDate = new int[3];
        int[] endDate = new int[3];


        toDate = trans(today);

        for (int i = 0; i<privacies.length; i++){
            endDate = endDate(privacies[i],terms);
            if(toDate[0]<endDate[0] ){
                
            }else if(toDate[0]==endDate[0] &&toDate[1]<endDate[1]){
                
            }else if(toDate[0]==endDate[0] &&toDate[1]==endDate[1]&&toDate[2]<=endDate[2]){
            }else {
                ans.add(i+1);
            }
        }
            
            
        return ans;
    }
        public static int[] trans (String str){
        int[] sp = new int[3];
        sp[0]= Integer.parseInt(str.substring(0,4));
        sp[1]= Integer.parseInt(str.substring(5,7));
        sp[2]= Integer.parseInt(str.substring(8,10));
        return sp;
    }

    public static int[] endDate (String str, String[] terms){
        int[] sp = new int[3];
        sp[0]= Integer.parseInt(str.substring(0,4));
        sp[1]= Integer.parseInt(str.substring(5,7));
        sp[2]= Integer.parseInt(str.substring(8,10));
        String ter = str.substring(11,12);

        for(int i =0; i<terms.length;i++){
            if(ter.equals(Character.toString(terms[i].charAt(0)))){
                sp[1] += Integer.parseInt(terms[i].substring(2,terms[i].length()));

            }

        }
        int time = sp[1]/12+1;
        for(int i=0; i<time; i++){
            if(sp[1]>12){
                sp[0]+=1;
                sp[1]-=12;
            }
        }
        sp[2]-=1;
        if(sp[2] == 0){
            sp[1]-=1;
            sp[2]=28;
            if(sp[1] == 0){
                sp[0]-=1;
                sp[1]=12;
            }
        }

        return sp;
    }
}