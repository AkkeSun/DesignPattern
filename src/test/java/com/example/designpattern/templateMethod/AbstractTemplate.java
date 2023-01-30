package com.example.designpattern.templateMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractTemplate {

    public void execute(){
        log.info("Template Start");
        call();
        log.info("Template End");
    }

    protected abstract void call();
}
