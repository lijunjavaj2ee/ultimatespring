package com.designP;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 静态内部类
 */
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);

    private IdGenerator() {
        System.out.println("IdGenerator()私有构造函数被调用");
    }

    private static class SingletonHolder {
        private static final IdGenerator instance = new IdGenerator();
    }

    public static IdGenerator getInstance() {
        System.out.println("getInstance()被调用");
        return SingletonHolder.instance;
    }

    public long getId() {
        System.out.println("getId()被调用");
        return id.incrementAndGet();
    }

}
