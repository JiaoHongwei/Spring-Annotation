package com.hw.springannotation.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/28 19:32
 * @Version 1.0
 */
public class Cat implements InitializingBean, DisposableBean {

    public Cat() {
        System.out.println("Cat constructor...");
    }

    public void destroy() throws Exception {
        System.out.println("Cat destroy...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat afterPropertiesSet...");
    }
}
