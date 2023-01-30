package com.example.designpattern.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyLogic implements Strategy{

    @Override
    public void call() {
        log.info("비지니스 로직 실행");
    }
}
