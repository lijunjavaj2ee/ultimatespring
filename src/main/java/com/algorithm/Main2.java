package com.algorithm;

import java.math.BigDecimal;

public class Main2 {
    public static void main(String[] args) {
        Integer aa = 0;
        BigDecimal a = new BigDecimal(0);
        BigDecimal b = new BigDecimal(88);
        b.add(BigDecimal.valueOf(90));
        a.add(b);

        System.out.println(new BigDecimal(aa).add(b));
    }
}
