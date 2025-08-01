package com.hutu.springframework;

import com.hutu.springframework.service.UserService;

/**
 * 创建简单bean容器
 */
public class App {
    public static void main(String[] args) {
        BeanFactory factory = new BeanFactory();
        System.out.println("========== userService bean 开始注入 ==========");
        factory.registerBeanDefinition("userService",new BeanDefinition(new UserService()));
        System.out.println("========== userService bean 注入完毕 ==========");
        System.out.println("========== 从factory获取 userService bean ==========");
        UserService userService = (UserService) factory.getBean("userService");
        System.out.println("========== 从factory获取 userService bean 成功 ==========");
        userService.queryUserInfo();
    }
}
