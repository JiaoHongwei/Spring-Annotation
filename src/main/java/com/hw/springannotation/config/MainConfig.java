package com.hw.springannotation.config;

import com.hw.springannotation.beans.Pension;
import com.hw.springannotation.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @Description 配置类=配置文件
 * @Author hw
 * @Date 2018/11/27 17:29
 * @Version 1.0
 */
@Configuration  // 告诉spring 这是一个配置类
//@ComponentScan(value = "com.hw.springannotation")
//@ComponentScan(value = "com.hw.springannotation",
//        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})}
//)   // 指定排除
//@ComponentScan(value = "com.hw.springannotation", useDefaultFilters = false,
//        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})}
//)       // 指定只扫描
//@ComponentScans(value = {
//        @ComponentScan(value = "com.hw.springannotation", useDefaultFilters = false,
//                includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})}
//        ), @ComponentScan(value = "com.hw.springannotation",
//        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})})
//})
@ComponentScan(value = "com.hw.springannotation", useDefaultFilters = false,
        includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class}),
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
        }
)       // 指定只扫描
public class MainConfig {

    @Bean(value = "pension01")   // 给容器中注册一个 Bean ；类型为返回值类型，id默认为方法名,
    public Pension pension() {
        return new Pension("hongwei", 24);
    }
}
