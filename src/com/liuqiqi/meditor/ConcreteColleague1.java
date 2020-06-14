package com.liuqiqi.meditor;

/**
 * 具体同事类
 *
 * @author liuqiqi
 * @date 2020/5/4 21:41
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    /*自有方法*/
    public void selfMethod1() {
        //处理自己的业务逻辑
    }

    /*依赖方法*/
    public void dependMethod1() {
        //处理自己的业务逻辑
        //自己处理不了的委托给中介处理
        super.mediator.doSomething1();
    }
}
