package com.hw.springannotation.ext;

import com.hw.springannotation.beans.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 拓展原理
 * @Author hw
 * @Date 2018/12/17 14:31
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.hw.springannotation.ext")
public class ExtConfig {


    @Bean
    public Blue blue() {
        return new Blue();
    }
}
