import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            list1.add(arr[i]);
        }
        
        List<Integer> list2 = new ArrayList<>();
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            list2.add(arr[i]);
        }
        
        list1.addAll(list2);
        
        int[] answer = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            answer[i] = list1.get(i);
        }
        
        return answer;
    }
}
