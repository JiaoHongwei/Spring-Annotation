package com.hw.springannotation.test;

import com.hw.springannotation.config.MainConfigOfProfile;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.applet.Main;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/29 20:14
 * @Version 1.0
 */
public class Test_ofProfile {

    @Test
    public void test() {
        // 1. 构造IOC容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 2. 设置需要激活的环境（可以同时激活多个）
        applicationContext.getEnvironment().setActiveProfiles("test", "dev");
        // 3. 注入配置类
        applicationContext.register(MainConfigOfProfile.class);
        // 4. 启动刷新容器
        applicationContext.refresh();

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }

    }
}
