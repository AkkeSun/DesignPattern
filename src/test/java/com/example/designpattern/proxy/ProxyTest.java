package com.example.designpattern.proxy;

import com.example.designpattern.proxy.decoratorPattern.DecoratorPattern;
import com.example.designpattern.proxy.proxyPattern.AccessProxy;
import com.example.designpattern.proxy.proxyPattern.CacheProxy;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ProxyTest {

    @Test
    public void noProxyTest(){
        Subject subject = new RealSubject();
        clientCall(subject);
        clientCall(subject);
        clientCall(subject);
    }

    @Test
    public void cacheProxyTest () {
        Subject subject = new RealSubject();
        Subject proxy = new CacheProxy(subject);
        clientCall(proxy);
        clientCall(proxy);
        clientCall(proxy);
    }

    @Test
    public void accessProxyTest () {
        Subject subject = new RealSubject();

        Subject proxy = new AccessProxy(subject, "ADMIN");
        clientCall(proxy);

        Subject proxy2 = new AccessProxy(subject, "USER");
        clientCall(proxy2);
    }

    @Test
    public void decoratorTest () {
        Subject proxy = new DecoratorPattern(new RealSubject());
        clientCall(proxy);
    }

    private void clientCall(Subject subject){
        String data = subject.operation();
        log.info(data);
    }

}
