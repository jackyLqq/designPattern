package com.liuqiqi.staticpProxy;

/**
 * 代理类
 *
 * @author liuqiqi
 * @date 2020/4/27 23:01
 */
public class Proxy implements Subject {

    private Subject subject = null;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    public void before() {

    }

    public void after() {

    }
}

