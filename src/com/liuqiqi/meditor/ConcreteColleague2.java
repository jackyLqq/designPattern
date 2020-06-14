package com.liuqiqi.meditor;

/**
 * @author liuqiqi
 * @date 2020/5/4 21:46
 */
public class ConcreteColleague2  extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    /*自有方法*/
    public void selfMethod2() {
        //处理自己的业务逻辑
    }

    /*依赖方法*/
    public void dependMethod2() {
        //处理自己的业务逻辑
        //自己处理不了的委托给中介处理
        super.mediator.doSomething1();
    }
}
