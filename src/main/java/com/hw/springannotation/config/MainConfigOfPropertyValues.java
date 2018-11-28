package com.hw.springannotation.config;

import com.hw.springannotation.beans.Pension;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author Administrator
 * @Date 2018/11/28
 */
@Configuration
public class MainConfigOfPropertyValues {
    @Bean
    public Pension pension() {
        return new Pension();
    }

}
