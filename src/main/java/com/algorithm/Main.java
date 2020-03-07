package com.algorithm;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(5);
        lruCache.put("001","用户1信息");
        lruCache.put("002","用户2信息");
        lruCache.put("003","用户3信息");
        lruCache.put("004","用户4信息");
        lruCache.put("005","用户5信息");
        lruCache.get("002");
        lruCache.put("004","用户4信息更新");
        lruCache.put("006","用户6信息");
        System.out.println(lruCache.get("001"));
        System.out.println(lruCache.get("002"));
        System.out.println(lruCache.get("003"));
        System.out.println(lruCache.get("004"));
        System.out.println(lruCache.get("005"));
        System.out.println(lruCache.get("006"));

//        HashMap<String,String> map = new HashMap<>();
//        map.put("001","AAA");
//        map.put("002","BBB");
//        map.put("003","CCC");
//        map.put("004","DDD");
//        map.put("005","EEE");
//        map.put("006","FFF");
//        map.put("003","update");
//        System.out.println(map.get("003"));
    }
}
