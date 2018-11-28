package com.hw.springannotation.test;

import com.hw.springannotation.beans.Pension;
import com.hw.springannotation.config.MainConfigOfPropertyValues;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author Administrator
 * @Date 2018/11/28
 */
public class Test_PropertyValues {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);

    @Test
    public void test() {

        System.out.println("IOC容器创建完成...");
        printBeans();

        Pension pension = (Pension) applicationContext.getBean("pension");
        System.out.println(pension);

        // 关闭容器
        applicationContext.close();
    }

    private void printBeans() {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
