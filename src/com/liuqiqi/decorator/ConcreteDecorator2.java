package com.liuqiqi.decorator;

/**
 * @author liuqiqi
 * @date 2020/6/20 22:08
 */
public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void method2() {
        System.out.println("method2修饰");
    }

    @Override
    void operate() {
        super.operate();
        this.method2();
    }
}
