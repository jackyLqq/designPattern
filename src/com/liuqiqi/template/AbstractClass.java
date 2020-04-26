package com.liuqiqi.template;

/**
 * @author liuqiqi
 * @date 2020/4/26 23:01
 */
public abstract class AbstractClass {
    /*基本方法*/
    protected abstract void doSomeThing();

    protected abstract void doAnyThing();

    public void templateMethod() {
        /*调用基本方法完成逻辑*/
        this.doSomeThing();
        this.doAnyThing();
    }
}
