package com.example.designpattern.factoryBean;

import org.springframework.stereotype.Component;

@Component
public class Bean2 implements BaseBean{

    @Override
    public int getIndex() {
        return 2;
    }

    @Override
    public String getData() {
        return "Hello Bean2";
    }
}
