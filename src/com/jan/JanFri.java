package com.jan;

import java.time.LocalDate;
import java.util.*;

public class JanFri {
    //LocalDate
    //Math
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6);
        Integer max = ls.stream().max((a,b) ->
        {
            if (a>b) {
                return 1;
            } else {
                return -1;
            }
        }).get();

        int max2 = ls.stream().max((a,b)-> a>b?1:-1).get();

        //Optional<Integer> max2 = ls.stream().max();
        //Collections.sort();

        System.out.println(max2);
    }

}
