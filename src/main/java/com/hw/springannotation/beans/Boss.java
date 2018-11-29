package com.hw.springannotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/29 17:36
 * @Version 1.0
 */
@Component
public class Boss {

    private Car car;

    public Car getCar() {
        return car;
    }

//    @Autowired
//    public void setCar(Car car) {
//        this.car = car;
//    }

    @Autowired
    public Boss(Car car) {
        this.car = car;
        System.out.println("Boss 的有参构造器...");
    }
}
