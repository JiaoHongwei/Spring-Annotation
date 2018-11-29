package com.hw.springannotation.config;

import com.hw.springannotation.beans.Pension;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description
 * @Author Administrator
 * @Date 2018/11/28
 */
// 使用@PropertySource来读取外部配置文件中的k/v值 保存到运行的环境变量中,加载完就可以使用${}取出
@PropertySource(value = {"classpath:/pension.properties"})
@Configuration
public class MainConfigOfPropertyValues {
    @Bean
    public Pension pension() {
        return new Pension();
    }

}
