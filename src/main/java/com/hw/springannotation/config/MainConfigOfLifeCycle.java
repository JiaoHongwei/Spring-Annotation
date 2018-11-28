package com.hw.springannotation.config;

import com.hw.springannotation.beans.Car;
import com.hw.springannotation.beans.Cat;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Description bean生命周期
 * bean创建 -》 初始化 -》 销毁
 * 容器管理bean的生命周期
 * 可以自定义初始化和销毁方法
 * 1、指定初始化销毁方法
 * @Author hw
 * @Date 2018/11/28 16:50
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.hw.springannotation.beans")
public class MainConfigOfLifeCycle {

    //    @Scope("prototype") // 多实例
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }

    @Bean
    public Cat cat() {
        return new Cat();
    }


}
