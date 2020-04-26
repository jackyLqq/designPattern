package com.liuqiqi.sigleton;

/**
 * 饿汉式
 *
 * @author liuqiqi
 * @date 2020/4/26 21:11
 */
public class SimpleSingleton {

    private static final SimpleSingleton SIMPLE_SINGLETON = new SimpleSingleton();

    /*不可new创建*/
    private SimpleSingleton() {
    }

    public static SimpleSingleton getSimpleSingleton() {
        return SIMPLE_SINGLETON;
    }

    /*其他方法尽量是静态方法*/
    public static void doSomeThing() {

    }
}
