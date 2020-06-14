package com.liuqiqi.command;

/**
 * @author liuqiqi
 * @date 2020/6/14 21:58
 */
public class ConcreteCommand2 extends Command {

    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    void execute() {
        this.receiver.doSomething();
    }
}
