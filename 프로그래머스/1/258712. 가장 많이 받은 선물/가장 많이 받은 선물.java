class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[] numGift = new int[friends.length];
        int[] addGift = new int[friends.length];

        for(int i = 0; i<friends.length; i++){
            for(int t =0; t<gifts.length; t++){
                if(friends[i].equals(gifts[t].split(" ")[0])){
                    numGift[i] ++;
                }else if(friends[i].equals(gifts[t].split(" ")[1])){
                    numGift[i] --;
                }
            }
        }

        for (int z=0; z<friends.length;z++){
            for (int y=z+1; y<friends.length;y++){
                int addCount = 0;
                int delCount = 0;

                for (int x =0; x<gifts.length; x++){
                    if(friends[z].equals(gifts[x].split(" ")[0]) && friends[y].equals(gifts[x].split(" ")[1])){
                        addCount ++;
                    } else if (friends[z].equals(gifts[x].split(" ")[1]) && friends[y].equals(gifts[x].split(" ")[0])) {
                        delCount ++;
                    }

                }
                if(addCount > delCount){
                    addGift[z] ++;
                } else if (addCount<delCount) {
                    addGift[y] ++;
                } else {
                    if(numGift[z]>numGift[y]){
                        addGift[z] ++;
                    } else if (numGift[z]<numGift[y]) {
                        addGift[y]++;
                    }
                }

            }


        }
        for (int k =0; k<addGift.length;k++){
            answer = answer<addGift[k]? addGift[k]: answer;
        }
        return answer;
    }
}