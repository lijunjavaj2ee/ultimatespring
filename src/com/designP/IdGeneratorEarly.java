package com.designP;

import java.util.concurrent.atomic.AtomicLong;

public class IdGeneratorEarly {
    private AtomicLong id = new AtomicLong(0);
    private static final IdGeneratorEarly instance = new IdGeneratorEarly();
    private IdGeneratorEarly() {}
    public static IdGeneratorEarly getInstance() {
        System.out.println("getInstance()执行");
        return instance;
    }
    public long getId() {
        System.out.println("getId()执行");
        return id.incrementAndGet();
    }
}
