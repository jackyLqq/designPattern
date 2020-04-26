package com.liuqiqi.abstractFactory;

/**
 * 产品等级2工厂
 *
 * @author liuqiqi
 * @date 2020/4/26 22:27
 */
public class Creator2 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
