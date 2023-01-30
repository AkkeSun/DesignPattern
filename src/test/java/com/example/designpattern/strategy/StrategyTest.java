package com.example.designpattern.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/*
    전략 패턴
    비지니스로직을 인터페이스로 만들고 (strategy) 필드로 주입받는 방식 (context)
    스프링에서 주로 사용되는 패턴이다
 */
@Slf4j
public class StrategyTest {

    @Test
    public void test1(){
        Strategy strategy = new StrategyLogic();
        Context context = new Context(strategy);
        context.execute();
    }

    @Test
    public void test2(){
        // 함수형 인터페이스이므로 람다로 처리 가능
        Context context = new Context(() -> log.info("비지니스 로직 실행"));
        context.execute();
    }
}
