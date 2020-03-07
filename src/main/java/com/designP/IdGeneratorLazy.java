package com.designP;

import java.util.concurrent.atomic.AtomicLong;

public class IdGeneratorLazy {
    private AtomicLong id = new AtomicLong(0);
    private static IdGeneratorLazy instance;
    private IdGeneratorLazy() {}
    public static synchronized IdGeneratorLazy getInstance() {
        if (instance == null) {
            System.out.println("创建instace");
            instance = new IdGeneratorLazy();
        }
        return instance;
    }
    public long getId() {
        System.out.println("getId执行");
        return id.incrementAndGet();
    }
}
