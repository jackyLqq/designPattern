package com.liuqiqi.meditor;

/**
 * 中介实现类
 *
 * @author liuqiqi
 * @date 2020/5/4 21:39
 */
public class ConcreteMediator extends Mediator {

    @Override
    public void doSomething1() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
