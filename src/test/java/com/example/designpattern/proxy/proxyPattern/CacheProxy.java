package com.example.designpattern.proxy.proxyPattern;


import com.example.designpattern.proxy.Subject;
import org.springframework.util.StringUtils;

public class CacheProxy implements Subject {

    private Subject target;
    private String cacheData;

    public CacheProxy(Subject target) {
        this.target = target;
    }

    @Override
    public String operation() {
        if(!StringUtils.hasText(cacheData)){
            cacheData = target.operation();
        }
        return cacheData;
    }
}
