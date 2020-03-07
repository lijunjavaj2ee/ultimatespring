package com.designP;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main2 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Constructor constructor = SingletonStatic.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        SingletonStatic s1 = (SingletonStatic) constructor.newInstance();
//        SingletonStatic s2 = (SingletonStatic) constructor.newInstance();
//        System.out.println(s1.equals(s2));

        Constructor con = SingletonEnum.class.getDeclaredConstructor();
        con.setAccessible(true);
        SingletonEnum s1 = (SingletonEnum) con.newInstance();
        SingletonEnum s2 = (SingletonEnum) con.newInstance();
        System.out.println(s1.equals(s2));
    }
}
