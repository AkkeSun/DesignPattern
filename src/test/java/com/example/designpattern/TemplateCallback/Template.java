package com.example.designpattern.TemplateCallback;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Template {
    public void execute(Callback callback){
        log.info("템플릿 콜백패턴 시작");
        callback.call();
        log.info("템플릿 콜백패턴 종료");
    }
}
