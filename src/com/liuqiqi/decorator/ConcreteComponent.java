package com.liuqiqi.decorator;

/**
 * @author liuqiqi
 * @date 2020/6/20 22:04
 */
public class ConcreteComponent extends Component{
    @Override
    void operate() {
        System.out.println("do something");
    }
}
