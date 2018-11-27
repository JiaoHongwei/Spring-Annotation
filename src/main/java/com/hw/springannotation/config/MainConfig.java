package com.hw.springannotation.config;

import com.hw.springannotation.beans.Pension;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 配置类=配置文件
 * @Author hw
 * @Date 2018/11/27 17:29
 * @Version 1.0
 */
@Configuration  // 告诉spring 这是一个配置类
public class MainConfig {

    @Bean(value = "pension01")   // 给容器中注册一个 Bean ；类型为返回值类型，id默认为方法名,
    public Pension pension() {
        return new Pension("hongwei", 24);
    }
}
