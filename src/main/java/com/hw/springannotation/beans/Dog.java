package com.hw.springannotation.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/28 19:53
 * @Version 1.0
 */
@Component
public class Dog {
    public Dog() {
        System.out.println("Dog construct....");
    }

    @PostConstruct
    public void initDog() {
        System.out.println("Dog PostConstruct.....");
    }

    @PreDestroy
    public void destroyDog() {
        System.out.println("Dog PreDestroy....");
    }
}
