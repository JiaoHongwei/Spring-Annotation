package com.hw.springannotation.test;

import com.hw.springannotation.ext.ExtConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/12/17 14:39
 * @Version 1.0
 */
public class Test_Ext {
    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
        applicationContext.publishEvent(new ApplicationEvent("我发布了一个事件") {});
        applicationContext.close();
    }


}
