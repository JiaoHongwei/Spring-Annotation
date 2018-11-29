package com.hw.springannotation.beans;

import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/28 15:42
 * @Version 1.0
 */
public class Color {
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Color(Car car) {
        this.car = car;
    }

    public Color() {
    }

    @Override
    public String toString() {
        return "Color{" +
                "car=" + car +
                '}';
    }
}
