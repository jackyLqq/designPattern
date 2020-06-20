package com.liuqiqi.responsibilityChain;

/**
 * @author liuqiqi
 * @date 2020/6/20 21:42
 */
public class ConcreteHandler1 extends Handler{
    @Override
    protected Level getHandlerLevel() {
        /*完成处理逻辑*/
        return null;
    }

    @Override
    protected Response echo(Request request) {
        /*完成请求处理*/
        return null;
    }
}
