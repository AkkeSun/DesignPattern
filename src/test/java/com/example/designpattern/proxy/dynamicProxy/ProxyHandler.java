package com.example.designpattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxyHandler implements InvocationHandler {

    private final Object target;

    public ProxyHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("Proxy 실행");

        Object result = method.invoke(target, args);

        log.info("Proxy 종료");
        return result;
    }
}
