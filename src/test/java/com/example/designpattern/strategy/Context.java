package com.example.designpattern.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Context {
    private final Strategy strategy;

    // 필드 주입
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void execute(){
        log.info("Context 시작");
        this.strategy.call();
        log.info("Context 종료");
    }
}
