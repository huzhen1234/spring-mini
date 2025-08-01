package com.hutu.springframework;

public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
        System.out.println("============发生了bean异常================");
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}