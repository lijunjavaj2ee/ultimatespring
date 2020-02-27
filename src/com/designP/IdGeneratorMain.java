package com.designP;

public class IdGeneratorMain {
    public static void main(String[] args) {
//        IdGenerator.getInstance();
//        IdGenerator.getInstance().getId();
//        IdGenratorEnum id = IdGenratorEnum.INSTANCE;
//        long id = IdGenratorEnum.INSTANCE.getId();
//        System.out.println(id);

//        IdGeneratorEarly.getInstance().getId();
//        IdGeneratorLazy.getInstance().getId();
        IdGeneratorDoubleCheck.getInstance().getId();
    }
}
