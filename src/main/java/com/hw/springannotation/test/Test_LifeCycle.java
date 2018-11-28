package com.hw.springannotation.test;

import com.hw.springannotation.config.MainConfigOfLifeCycle;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/28 17:01
 * @Version 1.0
 */
public class Test_LifeCycle {
    /**
     * 创建IOC容器
     */
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

    @Test
    public void test() {
        System.out.println("IOC容器创建完成...");

        // 关闭容器
        applicationContext.close();
    }
}
