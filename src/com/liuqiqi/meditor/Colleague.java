package com.liuqiqi.meditor;

/**
 * @author liuqiqi
 * @date 2020/5/4 21:40
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
