package com.hw.springannotation.beans;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/28 16:58
 * @Version 1.0
 */
public class Car {

    public Car() {
        System.out.println("Car construct...");
    }

    public void init() {
        System.out.println("Car init ...");
    }

    public void destroy() {
        System.out.println("Car destroy ...");
    }
}
