import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        List<Integer> resultList = new ArrayList<>();
        
        switch(n) {
            case 1:  answer= Arrays.copyOfRange(num_list, 0, slicer[1]+1);
                 break;
            case 2: answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
                 break;
            case 3: answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
                 break;
            case 4:  
                int a = slicer[0];
                int b = slicer[1];
                int c = slicer[2];

                for (int i = a; i <= b; i += c) {
                    resultList.add(num_list[i]);
                }
                answer = resultList.stream().mapToInt(Integer::intValue).toArray();
                break;
                
            default:
                answer = new int[0]; 
                break;
        }
        return answer;
    }
}