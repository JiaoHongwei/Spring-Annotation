package com.hw.springannotation.config;

import com.hw.springannotation.beans.Color;
import com.hw.springannotation.beans.Pension;
import com.hw.springannotation.beans.Red;
import com.hw.springannotation.conditional.LinuxConditional;
import com.hw.springannotation.conditional.MyImportBeanDefinitionRegistrar;
import com.hw.springannotation.conditional.MyImportSelector;
import com.hw.springannotation.conditional.WindowsConditional;
import com.hw.springannotation.beans.ColorFactoryBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

/**
 * @Description 配置类=配置文件
 * @Author hw
 * @Date 2018/11/27 17:29
 * @Version 1.0
 */
@Configuration  // 告诉spring 这是一个配置类
@Conditional({WindowsConditional.class})
@ComponentScan(value = "com.hw.springannotation")
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
//@ComponentScan(value = "com.hw.springannotation", useDefaultFilters = false,
//        includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class}),
//                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
//        }
//)       // 指定只扫描
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
// 快速导入组建，ID 默认是全路径包名
public class MainConfig {

    /**
     * * {@link ConfigurableBeanFactory#SCOPE_SINGLETON SCOPE_SINGLETON}.
     * * @since 4.2
     * * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
     * * @see ConfigurableBeanFactory#SCOPE_SINGLETON
     * * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
     * * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
     * * @see #value
     * <p>
     * <p>
     * prototype 多实例的 IOC容器启动的时候不会创建Bean，每次获取的时候才会去创建Bean
     * singleton 单实例的 默认值 IOC容器启动就会调用方法创建Bean，以后每次就是直接从容器（map.get）中拿
     * request 同一个请求创建一个实例（WEB环境）
     * session 同一个session创建一个实例（WEB环境）
     *
     * @return
     */
//    @Scope("prototype") // 多实例
    @Lazy // 单实例下懒加载bean
    @Bean(value = "pension")   // 给容器中注册一个 Bean ；类型为返回值类型，id默认为方法名,
    public Pension pension() {
        return new Pension("hongwei", 24);
    }

    /**
     * 如果是windows 注册bill
     *
     * @return
     */
    @Conditional({WindowsConditional.class})
    @Bean("bill")
    public Pension pension01() {
        return new Pension("bill", 23);
    }


    /**
     * linux
     *
     * @return
     */
    @Bean("linus")
    @Conditional({LinuxConditional.class})
    public Pension pension02() {
        return new Pension("linus", 48);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
