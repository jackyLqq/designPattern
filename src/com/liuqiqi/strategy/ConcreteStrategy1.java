package com.liuqiqi.strategy;

/**
 * @author liuqiqi
 * @date 2020/6/21 21:15
 */
class ConcreteStrategy1 implements Strategy{
    @Override
    public void doSomething() {
        System.out.println("策略1运算");
    }
}
