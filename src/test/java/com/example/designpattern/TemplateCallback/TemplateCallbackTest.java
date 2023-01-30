package com.example.designpattern.TemplateCallback;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
/*
    Template Callback Pattern
    핵심 비지니스 로직을 콜백함수로 받는 패턴
    전략패턴보다 유연성이 높아 비지니스 로직의 변화가 많다면 추천
 */
@Slf4j
public class TemplateCallbackTest {

    @Test
    public void test2(){
        Template template = new Template();
        template.execute(() -> log.info("비지니스 로직 실행"));
    }
}
