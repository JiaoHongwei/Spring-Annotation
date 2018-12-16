package com.hw.springannotation.aop;

/**
 * @Description
 * @Author Administrator
 * @Date 2018/12/1
 */
public class MathCalculator {

    public int div(int i, int j) {
        System.out.println("MathCalculator   div 运行...");
        return i / j;
    }
}
