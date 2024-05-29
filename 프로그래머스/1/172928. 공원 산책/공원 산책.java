class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] start = {0,0};
        int[] finish = {park.length - 1, park[0].length() - 1};
        
        for (int i =0; i<park.length; i++){
            for (int t=0; t<park[i].length();t++){
                if(park[i].charAt(t) == 'S'){
                    start[0] = i;
                    start[1] = t;
                }
            }
        }
        
        for (int i = 0; i < routes.length; i++) {
            String[] temp = routes[i].split(" ");

            if (temp[0].equals("E") ) {
                if(east(start[1], finish[1], start[1]+Integer.parseInt(temp[1]),park[start[0]] )){
                    start[1] += Integer.parseInt(temp[1]);
                }

            } else if (temp[0].equals("W")) {
                
                if(west(start[1],start[1]-Integer.parseInt(temp[1]),park[start[0]] )){
                    start[1] -= Integer.parseInt(temp[1]);
                }
            } else if (temp[0].equals("N")){
                boolean nboo = true;

                if(start[0]-Integer.parseInt(temp[1])>=0){
                    for(int y =start[0]-1; y>start[0]-Integer.parseInt(temp[1])-1;y--){
                        if(park[y].charAt(start[1]) == 'X'){
                            nboo = false;
                        }
                    }
                    if(nboo){
                        start[0] -= Integer.parseInt(temp[1]);
                    }
                }

            } else if (temp[0].equals("S")) {
                boolean sboo = true;
                if(finish[0]>=start[0]+Integer.parseInt(temp[1])){
                    for(int y =start[0]+1; y<start[0]+Integer.parseInt(temp[1])+1;y++){
                        if(park[y].charAt(start[1]) == 'X'){
                            sboo = false;
                        }
                    }
                    if(sboo){
                        start[0] += Integer.parseInt(temp[1]);
                    }
                }

            }

        }
        return start;
    }
    public static boolean east (int a, int b, int c, String s){
        boolean boo = true;
        if(c<=b){
            for (int t = a + 1; t < c + 1; t++) {
                if (s.charAt(t) == 'X') {
                    boo = false;
                } else {
                    continue;
                }
            }
        }else {
            boo = false;
        }

        return boo;
    }
    public static boolean west (int a, int c, String s){
        boolean boo = true;
        if(c>=0){
            for (int t = a- 1; t > c-1; t--) {
                if (s.charAt(t) == 'X') {
                    boo = false;
                } else {
                    continue;
                }
            }
        }else {
            boo = false;
        }

        return boo;
    }
}