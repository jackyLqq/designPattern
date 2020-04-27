package com.liuqiqi.prototype;

/**
 * 原型设计模式
 *
 * @author liuqiqi
 * @date 2020/4/27 23:15
 */
public class PrototypeClass implements Cloneable {
    @Override
    protected PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
