package com.example.designpattern.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class SingletonTest {

    @Test
    void test(){
        Singleton2 instance = Singleton2.getInstance();
        instance.setNum(10);

        Singleton2 instance2 = Singleton2.getInstance();
        log.info(instance2.getNum() + "");
    }
}
