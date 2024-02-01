import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<arr.length;i++){
            if(arr[i]==2){
                list.add(i);
            }
        }
        if(list.size() == 0){
            list.add(-1);
        }
        int[] answer = new int [list.size()];
        if(list.size() == 1){
            answer[0] = list.get(0) == -1 ? -1 : 2;
        }else{
        answer = Arrays.copyOfRange(arr, list.get(0), list.get(list.size()-1)+1);
            }
        return answer;
    }
}