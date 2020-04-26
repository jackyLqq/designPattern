package com.liuqiqi.abstractFactory;

/**
 * 产品等级1工厂
 * @author liuqiqi
 * @date 2020/4/26 22:27
 */
public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
