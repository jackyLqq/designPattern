package com.liuqiqi.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author liuqiqi
 * @date 2020/4/27 23:09
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler invocationHandler) {
        return (T) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
