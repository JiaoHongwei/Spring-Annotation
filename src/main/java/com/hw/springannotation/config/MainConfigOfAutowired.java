package com.hw.springannotation.config;

import com.hw.springannotation.beans.Car;
import com.hw.springannotation.beans.Color;
import com.hw.springannotation.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.management.relation.RelationType;

/**
 * @Description 自动装配：
 * <p>
 * Spring 利用依赖注入（DI），完成对IOC容器中各个依赖关系赋值
 * 1. @Autowire
 * @Author hw
 * @Date 2018/11/29 16:04
 * @Version 1.0
 */
@Configuration
@ComponentScan({"com.hw.springannotation.service", "com.hw.springannotation.controller", "com.hw.springannotation.dao","com.hw.springannotation.beans"})
public class MainConfigOfAutowired {

    @Primary // 首选装配bean
    @Bean("bookRepository2")
    public BookRepository bookRepository() {
        return new BookRepository("2");
    }



    @Bean
    public Color color(Car car) {
        return new Color(car);
    }
}
