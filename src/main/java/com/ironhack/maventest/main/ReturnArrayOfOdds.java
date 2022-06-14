package com.ironhack.maventest.main;

import java.util.ArrayList;
import java.util.List;

public class ReturnArrayOfOdds {

    //ARRAY OF ODDS
    public List<Integer> returnArrayOfOdds(Integer n){
        List<Integer> arrList = new ArrayList<>();
        for(int i=0; i <=n ; i++){
            if (i % 2 !=0){
                arrList.add(i);
            }
        }
        return arrList;
    }


}

