package com.designP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TempDemo {
    public static void main(String[] args) {
//        List<String> ls = new ArrayList<>();
        HashMap<String,String> map = new HashMap<>();
        map.put("A","AAA");
        map.put("B","BBB");
        map.put("C","CCC");
        System.out.println(map.clone().hashCode());
        System.out.println(map.hashCode());
    }
}
