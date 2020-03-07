package com.designP;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        for (int i=0;i<10;i++) {
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            System.out.println("run之前");
                            SingletonDemo.getInstance();
                            System.out.println("run之后");
                        }
                    }
            ).start();
        }
        Thread.sleep(100);
    }
}
