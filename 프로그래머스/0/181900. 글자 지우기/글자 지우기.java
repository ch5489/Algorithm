import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Integer[] sort = Arrays.stream(indices).boxed().toArray(Integer[]::new);
        Arrays.sort(sort, Collections.reverseOrder());
        for (int i =0; i<sort.length; i++){
            my_string = my_string.substring(0, sort[i]) + my_string.substring( sort[i]+1);
            
        }
        answer = my_string;
        return answer;
    }
}