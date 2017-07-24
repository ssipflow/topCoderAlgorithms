package com.topcoder.friendScore;

public class FriendScore {

    public int highestScore(String[] friends){
        if(friends.length < 1 || friends.length > 50) return -1;

        int ans = 0;
        int n = friends[0].length();

        for(int i = 0; i < n; i++){
            int count = 0;

            for(int j = 0; j < n; j++){
                if(i == j) continue;

                if(friends[i].charAt(j) == 'Y'){
                    count++;
                    for(int k = 0; k < n; k ++){
                        if(friends[j].charAt(k) == 'Y' && i != k  && i != j) count++;
                    }
                }
            }
            ans = Math.max(ans, count);
        }

        return ans;
    }
}
