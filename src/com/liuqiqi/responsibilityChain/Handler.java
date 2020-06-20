package com.liuqiqi.responsibilityChain;

/**
 * @author liuqiqi
 * @date 2020/6/20 21:36
 */
public abstract class Handler {
    private Handler nextHandler;

    public final Response handlerMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            if (nextHandler.getHandlerLevel().equals(request.getRequestLevel())) {
                response = this.nextHandler.handlerMessage(request);
            } else {
                //业务自己处理
            }
        }
        return response;
    }

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    protected abstract Level getHandlerLevel();

    protected abstract Response echo(Request request);
}
