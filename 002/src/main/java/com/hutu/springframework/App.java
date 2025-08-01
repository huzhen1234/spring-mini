package com.hutu.springframework;

import com.hutu.springframework.config.BeanDefinition;
import com.hutu.springframework.service.UserService;
import com.hutu.springframework.supprot.DefaultListableBeanFactory;

public class App {
    public static void main(String[] args) {

        // 初始化 DefaultListableBeanFactory 容器
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        // 创建bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        factory.registerBeanDefinition("userService",beanDefinition);
        // 获取bean
        UserService userService = (UserService) factory.getBean("userService");
        userService.queryUserInfo();

    }
}
