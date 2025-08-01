package com.hutu.springframework.config;


/**
 * 较001相比，这里不再是Object，而是Class，用来注册类的信息，但是不实例化。
 */
public class BeanDefinition {
    private Class<?> beanClass;

    public BeanDefinition(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public Class<?> getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class<?> beanClass) {
        this.beanClass = beanClass;
    }
}
