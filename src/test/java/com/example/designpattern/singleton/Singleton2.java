package com.example.designpattern.singleton;

import lombok.Data;

// static inner class 를 사용함으로 thread safe 한 코딩
@Data
public class Singleton2 {
    private int num;
    private Singleton2 () {}

    private static class singletonHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return singletonHolder.INSTANCE;
    }
}
