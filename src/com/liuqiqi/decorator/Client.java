package com.liuqiqi.decorator;

/**
 * @author liuqiqi
 * @date 2020/6/20 22:10
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);
        component.operate();
    }
}
