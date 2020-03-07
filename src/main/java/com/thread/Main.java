package com.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
//    public static int count = 0;
//    public static AtomicInteger count = new AtomicInteger(0);
    public volatile static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<10;i++) {
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            for (int j=0;j<100;j++) {
//                                synchronized (Main.class) {
//                                    count.incrementAndGet();
//                                }
                                count++;
                            }
                        }
                    }
            ).start();
        }
        Thread.sleep(10);
        System.out.println("count="+count);
    }
}
