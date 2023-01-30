package com.example.designpattern.factoryBean;

import org.springframework.stereotype.Component;

@Component
public class Bean1 implements BaseBean{

    @Override
    public int getIndex() {
        return 1;
    }

    @Override
    public String getData() {
        return "Hello Bean1";
    }
}
