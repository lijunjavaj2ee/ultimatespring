package com.algorithm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RedPagkage {
    public static void main(String[] args) {
        List<Integer> amountList = divideRedPackage(200,10);
//        BigDecimal temp = new BigDecimal("0.00");
//        BigDecimal total = new BigDecimal("0.00");
        for (Integer amount:amountList) {
//            temp = new BigDecimal(amount).divide(new BigDecimal(1));
//            total = total.add(temp);
            System.out.println("抢到金额："+new BigDecimal(amount).divide(new BigDecimal(1)));
//            System.out.println(total);
        }
    }

    private static List<Integer> divideRedPackage(int totalAmount, int totalPeopleNum) {
        List<Integer> amountList = new ArrayList<>();
        Integer restAmount = totalAmount;
        Integer restPeopleNum = totalPeopleNum;
        Random random = new Random();
        for (int i=0;i<totalPeopleNum-1;i++) {
            int amount = random.nextInt(restAmount/restPeopleNum*2-1)+1;
            restAmount -=amount;
            restPeopleNum--;
            amountList.add(amount);
        }
        amountList.add(restAmount);
        return  amountList;
    }
}
