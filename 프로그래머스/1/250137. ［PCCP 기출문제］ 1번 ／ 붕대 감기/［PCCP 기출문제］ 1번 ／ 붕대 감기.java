import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
       
        int answer = 0;
        answer = health;

        int count = 0;

        Map<Integer,Integer> attMap = new HashMap<>();
        for(int t =0; t< attacks.length; t++){
            attMap.put(attacks[t][0],attacks[t][1]);
        }

        for (int i =1; i<=attacks[attacks.length-1][0]; i++){

            if(answer>0){
                if(attMap.containsKey(i)){
                    answer-=attMap.get(i);
                    count =0;
                }else {
                    count++;
                    if(answer==health){

                    }else {
                        answer+= answer+bandage[1]<=health?bandage[1]:health-answer;
                    }
                }
                if(count == bandage[0]){
                    answer+= answer+bandage[2]<=health?bandage[2]:health-answer;
                    count =0;
                }
            }else {
                answer=-1;
               break;
            }
        }
        answer = answer<=0?-1:answer;
        
        return answer;
    }
}