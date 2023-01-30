package com.example.designpattern.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealSubject implements Subject{

    @Override
    public String operation() {
        log.info("Real Subject Call");
        return "data";
    }
}
