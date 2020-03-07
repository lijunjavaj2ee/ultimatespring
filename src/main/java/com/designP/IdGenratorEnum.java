package com.designP;

import java.util.concurrent.atomic.AtomicLong;

public enum IdGenratorEnum {
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        System.out.println("getId()被执行");
//        return id.incrementAndGet();
        return id.getAndIncrement();
    }
}
