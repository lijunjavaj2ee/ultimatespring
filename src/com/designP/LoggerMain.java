package com.designP;

import com.sun.tools.corba.se.idl.constExpr.Or;

import java.io.IOException;

public class LoggerMain {
    public int count = 0;
    public static void main(String[] args) throws IOException {
        UserController user = new UserController();
        user.login("jet","jet1");
        user.login("eclipse","eclipse1");

        OrderController order = new OrderController();
        order.create("笔记本");
        order.create("平板电脑");

        Thread thread1 = new Thread(user);
        thread1.start();

        Thread thread2 = new Thread(user);
        thread2.start();

        Thread thread3 = new Thread(user);
        thread3.start();

        Thread thread4 = new Thread(user);
        thread4.start();
    }
}
