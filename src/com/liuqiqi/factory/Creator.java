package com.liuqiqi.factory;

/**
 * 抽象工厂
 *
 * @author liuqiqi
 * @date 2020/4/26 22:04
 */
public abstract class Creator {
    /*创建产品方法，根据参数创建，参数可以为String,Enum,Class*/
    public abstract <T extends Product> T createProduct(Class<T> c);
}
