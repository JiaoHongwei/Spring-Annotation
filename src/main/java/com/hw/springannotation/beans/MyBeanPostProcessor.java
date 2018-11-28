package com.hw.springannotation.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Description 后置处理器
 * @Author Administrator
 * @Date 2018/11/28
 */
@Component  // 将后置处理器加入到IOC容器中
public class MyBeanPostProcessor implements BeanPostProcessor {

    /**
     * @return 返回之后要用 的 bean
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(" postProcessBeforeInitialization" + beanName + "> " + bean);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(" postProcessAfterInitialization" + beanName + "> " + bean);
        return bean;
    }
}
