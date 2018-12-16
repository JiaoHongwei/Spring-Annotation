package com.hw.springannotation.test;

import com.hw.springannotation.aop.MathCalculator;
import com.hw.springannotation.config.MainConfigOfAop;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author Administrator
 * @Date 2018/12/1
 */
public class Test_Aop {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAop.class);

    @Test
    public void test() {

        // 不要自己创建对象
//        MathCalculator calculator = new MathCalculator();
//        calculator.div(1, 1);

        // 从容器中获取
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
        mathCalculator.div(1, 1);
        applicationContext.close();
    }
}
