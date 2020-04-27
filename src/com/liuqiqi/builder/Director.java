package com.liuqiqi.builder;

/**
 * 导演类
 *
 * @author liuqiqi
 * @date 2020/4/27 22:53
 */
public class Director {
    Builder builder = new ConcreteProductBuilder();

    public Product getProduct() {
        /*设置产品属性*/
        builder.setPart();
        /*返回建造的产品*/
        return builder.buildProduct();
    }
}
