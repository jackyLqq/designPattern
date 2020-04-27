package com.liuqiqi.builder;

/**
 * ConcreteProduct
 *
 * @author liuqiqi
 * @date 2020/4/27 22:50
 */
public class ConcreteProductBuilder extends Builder {

    Product product = new Product();

    @Override
    public void setPart() {
        /*堆product产品属性进行设置*/
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
