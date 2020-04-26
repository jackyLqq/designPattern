package com.liuqiqi.sigleton;

/**
 * 静态内部类实现，延迟初始化
 *
 * @author liuqiqi
 * @date 2020/4/26 21:14
 */
public class InnerClassSingleton {

    static class singletonHolder {
        private static final InnerClassSingleton INNER_CLASS_SINGLETON = new InnerClassSingleton();

        public static InnerClassSingleton getInnerClassSingleton() {
            return INNER_CLASS_SINGLETON;
        }
    }

    public InnerClassSingleton getInnerClassSingleton() {
        return singletonHolder.getInnerClassSingleton();
    }

}
