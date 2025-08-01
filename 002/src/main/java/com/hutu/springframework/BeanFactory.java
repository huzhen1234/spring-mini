package com.hutu.springframework;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}