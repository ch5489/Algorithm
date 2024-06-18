import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] resReport = new int[id_list.length];

        Set <String> setTemp = new HashSet<>();
        setTemp.addAll(Arrays.asList(report));
        
        Map<String, List<String>> arrReport = new HashMap<>();

        for ( String str : setTemp){
        }

for (String str : setTemp) {
                String[] strA = str.split(" ");

                

                    List<String> listReport = arrReport.getOrDefault(strA[1], null);
                    if(listReport == null){
                        listReport = new ArrayList<>();
                    }
                    listReport.add(strA[0]);
                    arrReport.put(strA[1],listReport);
                
                

            }
        for (int i = 0; i < id_list.length; i++) {
            

            if(arrReport.containsKey(id_list[i])&&arrReport.get(id_list[i]).size()>= k ){
                for(int t =0; t<arrReport.get(id_list[i]).size(); t++){
                    answer[Arrays.asList(id_list).indexOf(arrReport.get(id_list[i]).get(t))]++;
                }

            }
        }
        return answer;
    }
}