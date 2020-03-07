package com.algorithm;

import java.util.concurrent.atomic.AtomicInteger;

public class TempMain {
    public static void main(String[] args) {
        System.out.println("正常日志打印：");
        System.err.println("错误日志打印：");
        AtomicInteger a = new AtomicInteger();
        a.incrementAndGet();
    }
}
