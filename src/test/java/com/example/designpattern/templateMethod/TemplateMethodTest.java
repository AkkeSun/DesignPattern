package com.example.designpattern.templateMethod;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/*
    Template Method Pattern
    반복적인 로직을 추상클래스로 만든 후 상속받아 비지니스로직을 구성하는 방법
 */
@Slf4j
public class TemplateMethodTest {

    @Test
    public void test1(){
        AbstractTemplate template = new TemplateLogic1();
        template.execute();
    }

    @Test
    public void test2(){
        // 매번 새로운 클래스를 상속받지 않고 익명 내부클래스로 생성
        AbstractTemplate template = new AbstractTemplate(){
            @Override
            protected void call() {
                log.info("비지니스 로직 실행");
            }
        };
        template.execute();
    }

}
