package com.hw.springannotation.conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/28 15:02
 * @Version 1.0
 */
public class LinuxConditional implements Condition {
    /**
     * Determine if the condition matches.
     *
     * @param context  判断条件使用的上下文环境
     * @param metadata 当前标注了该注解的注释信息
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        // TODO: 2018/11/28 判断是否是linux系统
        // 1 能获取到ioc使用的beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        // 2 获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        // 3 获取当前环境信息
        Environment environment = context.getEnvironment();
        // 4 获取bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();
        // 判断容器中是否包含某个bean
        boolean de = registry.containsBeanDefinition("pension");
        String property = environment.getProperty("os.name");


        if (property.contains("Linux")) {
            return true;
        }
        return false;
    }
}
