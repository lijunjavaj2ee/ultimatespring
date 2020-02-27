package com.designP;

import java.io.IOException;

public class OrderController {
    private Logger logger = new Logger();

    public OrderController() throws IOException {
    }

    public void create(String str) throws IOException {
        logger.log("Created an order:"+str);
        System.out.println("Created an order:"+str);
    }
}
