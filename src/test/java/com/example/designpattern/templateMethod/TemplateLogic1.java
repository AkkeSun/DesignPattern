package com.example.designpattern.templateMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TemplateLogic1 extends AbstractTemplate{

    @Override
    protected void call() {
        log.info("TemplateLogic1 비지니스로직 실행");
    }
}
