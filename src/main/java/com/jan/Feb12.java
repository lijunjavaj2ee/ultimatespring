package com.jan;

import java.lang.reflect.Array;
import java.util.*;

public class Feb12 {
    public static void main(String[] args) {
        int arr[]={1, 6, 7, 9, 0, 3};
//        ArrayList;
//        LinkedList;
//        LinkedHashMap
        List<String> ls = new ArrayList<String>();
        ls.add("dev2");
        ls.add("dev1");
        ls.add("dev3");
//        System.out.println(ls.toArray().length);
        //ls.sort();
        //Collections.sort(ls);
//        Collections.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });
        ls.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.compareTo(o2) > 0) {
                    // 升序 1，降序 -1
                    return -1;
                }
                return 1;
            }
        });
        for (String str:ls
             ) {
            System.out.println(str);
            System.out.println(str.hashCode());
        }
//        System.out.println(ls.toString().hashCode());
    }
}
