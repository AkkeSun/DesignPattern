package com.example.designpattern.proxy.dynamicProxy;

import com.example.designpattern.proxy.RealSubject;
import com.example.designpattern.proxy.Subject;
import java.lang.reflect.Proxy;
import org.junit.jupiter.api.Test;

public class DynamicProxyTest {

    @Test
    public void test(){
        Subject subject = new RealSubject();
        ProxyHandler handler = new ProxyHandler(subject);
        Subject proxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
            new Class[]{Subject.class}, handler);
        proxy.operation();
    }
}
