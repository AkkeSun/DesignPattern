package com.example.designpattern.proxy.proxyPattern;

import com.example.designpattern.proxy.Subject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AccessProxy implements Subject {
    private Subject target;
    private String role;

    public AccessProxy (Subject target, String role){
        this.target = target;
        this.role = role;
    }

    @Override
    public String operation() {
        if(role.equals("ADMIN")){
            return target.operation();
        } else {
            throw new RuntimeException("Access Denied");
        }
    }
}
