package com.liuqiqi.abstractFactory;

/**
 * 有多少产品等级就有多少产品工厂，每个产品工厂实现不同产品族的生产任务
 *
 *
 * @author liuqiqi
 * @date 2020/4/26 22:23
 */
public abstract class AbstractCreator {

    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
