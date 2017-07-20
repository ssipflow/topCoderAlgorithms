package com.topcoder.party;

import java.util.HashMap;

public class InterestingParty {

    public int bestInvitation(String[] first, String[] second){
        if(first.length < 1 || first.length > 50) return -1;
        if(first.length != second.length) return -1;

        for(int i = 0; i < first.length; i++){
            if(first[i].length() > 15 || first[i].length() < 1 || second[i].length() > 15 || second[i].length() < 1) return -1;

            first[i] = first[i].toLowerCase();
            second[i] = second[i].toLowerCase();
        }

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < first.length; i++){
            if( !map.containsKey(first[i]) ) map.put(first[i], 1);
            else map.replace( first[i], map.get(first[i])+1 );

            if( !map.containsKey(second[i]) ) map.put(second[i], 1);
            else map.replace( second[i], map.get(second[i])+1 );
        }

        int max = 0;
        for(String key: map.keySet()) max = Math.max(max, map.get(key));

        return max;
    }
}
