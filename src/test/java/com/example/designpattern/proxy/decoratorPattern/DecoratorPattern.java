package com.example.designpattern.proxy.decoratorPattern;

import com.example.designpattern.proxy.Subject;

/*
    데코레이터 패턴
    RealSubject 를 직접 변경하기 어려운데 기능을 추가해야하는 경우 효과적이디
 */
public class DecoratorPattern implements Subject {

    private Subject subject;

    public DecoratorPattern(Subject subject){
        this.subject = subject;
    }

    @Override
    public String operation() {
        return "+++" + subject.operation() + "+++";
    }
}
