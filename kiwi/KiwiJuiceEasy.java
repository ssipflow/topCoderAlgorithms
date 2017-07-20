package com.topcoder.kiwi;

public class KiwiJuiceEasy {

    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId){

        if( capacities.length < 2 || capacities.length > 50 ||
                capacities.length != bottles.length ||
                fromId.length < 1 || fromId.length > 50 ||
                fromId.length != toId.length ){
            return null;
        }

        for(int capacity : capacities) {
            if (capacity < 1 || capacity > 1000000)
                return null;
        }


        for(int i = 0; i < fromId.length; i++){
            int from = fromId[i];   //시작 병의 위치
            int to = toId[i];       //목적 병의 위치

            int pour = 0;
            int available = capacities[to] - bottles[to];

            if(bottles[from] > available) pour = available;
            else pour = bottles[from];

            bottles[from] = bottles[from] - pour;
            bottles[to] = bottles[to] + pour;
        }

        System.out.print("Returns: ");
        for(int curBottle : bottles){
            System.out.print(curBottle + " ");
        }
        System.out.println();

        return bottles;
    }
}
