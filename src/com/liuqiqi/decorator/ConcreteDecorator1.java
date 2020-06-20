package com.liuqiqi.decorator;

/**
 * @author liuqiqi
 * @date 2020/6/20 22:06
 */
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    private void method1() {
        System.out.println("method1修饰");
    }

    @Override
    void operate() {
        this.method1();
        super.operate();
    }
}
