package com.designP;

import java.io.IOException;
import java.util.function.DoubleToIntFunction;

public class UserController implements Runnable{
    private Logger logger = new Logger();

    public UserController() throws IOException {
    }

    public void login(String username,String password) throws IOException {
        logger.log(username+"logined!");
        System.out.println(username+password);
    }

    public int count = 0;
    @Override
    public void run() {
        try {
            logger.log("用户登录");
            System.out.println("用户登录"+"线程开始执行"+count++);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
