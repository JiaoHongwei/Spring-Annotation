package com.hw.springannotation.conditional;

import com.hw.springannotation.beans.RainBow;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/28 16:16
 * @Version 1.0
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * @param importingClassMetadata annotation metadata of the importing class 当前类的注解信息
     * @param registry               current bean definition registry   定义的注册类
     *                               所有需要添加到容器中的bean BeanDefinitionRegistry.registerBeanDefinition 手动注册进来
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean red = registry.containsBeanDefinition("com.hw.springannotation.beans.Red");
        boolean blue = registry.containsBeanDefinition("com.hw.springannotation.beans.Blue");

        if (red && blue) {
            // 指定Bean的定义信息，Bean的类型，作用域等
            BeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            // 注册一个Bean，指定bean名
            registry.registerBeanDefinition("rainBow", beanDefinition);
        }
    }
}
