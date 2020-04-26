package com.liuqiqi.factory;

/**
 * @author liuqiqi
 * @date 2020/4/26 22:07
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T) product;
    }
}
