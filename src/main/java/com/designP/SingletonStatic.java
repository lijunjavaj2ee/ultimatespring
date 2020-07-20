package com.designP;

public class SingletonStatic {
    private static class LazyHolder {
        private static final SingletonStatic instace = new SingletonStatic();
    }
    private SingletonStatic() {}
    private static SingletonStatic getInstance() {
        return LazyHolder.instace;
    }
}


