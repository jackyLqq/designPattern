package com.liuqiqi.strategy;

/**
 * @author liuqiqi
 * @date 2020/6/21 21:17
 */
public class ConcreteStrategy2 implements Strategy{
    @Override
    public void doSomething() {
        System.out.println("策略2运算");
    }
}
