package com.liuqiqi.builder;

/**
 * 抽象建造者
 *
 * @author liuqiqi
 * @date 2020/4/27 22:48
 */
public abstract class Builder {

    /*设置产品的不同部分，以获取不同的产品*/
    public abstract void setPart();

    /*建造产品方法*/
    public abstract Product buildProduct();
}
