package com.liuqiqi.strategy;

/**
 * @author liuqiqi
 * @date 2020/6/21 21:17
 */
public class Context {
    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything() {
        this.strategy.doSomething();
    }
}
