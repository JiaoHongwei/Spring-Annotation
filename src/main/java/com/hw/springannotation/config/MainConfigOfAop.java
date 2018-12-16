package com.hw.springannotation.config;

import com.hw.springannotation.aop.LogAspects;
import com.hw.springannotation.aop.MathCalculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description
 * @Author Administrator
 * @Date 2018/12/1
 */
@Configuration
@EnableAspectJAutoProxy
public class MainConfigOfAop {

    // 业务逻辑类加入到容器中
    @Bean
    public MathCalculator mathCalculator() {
        return new MathCalculator();
    }

    // 切面类 也加入到容器中
    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }

}
