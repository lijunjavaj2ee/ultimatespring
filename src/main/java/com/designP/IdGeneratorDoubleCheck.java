package com.designP;

import java.util.concurrent.atomic.AtomicLong;

public class IdGeneratorDoubleCheck {
    private AtomicLong id = new AtomicLong(0);
    private static IdGeneratorDoubleCheck instance;
    private IdGeneratorDoubleCheck() {}
    public static IdGeneratorDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (IdGeneratorDoubleCheck.class) {
                if (instance == null) {
                    System.out.println("创建instance");
                    instance = new IdGeneratorDoubleCheck();
                }
            }
        }
        return instance;
    }

    public long getId() {
        System.out.println("调用ID");
        return id.getAndIncrement();
    }
}
