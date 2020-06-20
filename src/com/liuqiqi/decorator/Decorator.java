package com.liuqiqi.decorator;

/**
 * @author liuqiqi
 * @date 2020/6/20 22:05
 */
public class Decorator extends Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    void operate() {
        this.component.operate();
    }
}
