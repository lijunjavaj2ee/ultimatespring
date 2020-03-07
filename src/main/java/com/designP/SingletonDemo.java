package com.designP;

public class SingletonDemo {
    private SingletonDemo() {}
    private volatile static SingletonDemo instance = null;
    public static SingletonDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo();
                    System.out.println("Singleton创建成功！");
                }
            }
        }
        return instance;
    }
}
