package com.liuqiqi.strategy;

/**
 * @author liuqiqi
 * @date 2020/6/21 21:19
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doAnything();
    }
}
