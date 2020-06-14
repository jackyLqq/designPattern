package com.liuqiqi.command;

/**
 * @author liuqiqi
 * @date 2020/6/14 21:56
 */
public class ConcreteCommand1 extends Command {
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    void execute() {
        this.receiver.doSomething();
    }
}
