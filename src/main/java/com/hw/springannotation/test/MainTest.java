package com.hw.springannotation.test;

import com.hw.springannotation.beans.Pension;
import com.hw.springannotation.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/27 17:26
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
//        /**
//         * 配置文件的方式
//         */
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Pension pension = (Pension) applicationContext.getBean("pension");
//        System.out.println(pension);

        /**
         * 注解方式
         */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Pension pension = applicationContext.getBean(Pension.class);
        System.out.println(pension);

        String[] beanNamesForType = applicationContext.getBeanNamesForType(Pension.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }


    }
}
