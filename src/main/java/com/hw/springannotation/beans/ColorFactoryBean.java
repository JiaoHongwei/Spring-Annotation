package com.hw.springannotation.beans;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Description 创建Spring 工厂bean
 * @Author hw
 * @Date 2018/11/28 16:32
 * @Version 1.0
 */
public class ColorFactoryBean implements FactoryBean<Color> {

    /**
     * 返回一个color对象 ，这个对象会被添加到容器中
     *
     * @return
     * @throws Exception
     */
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean……");
        return new Color();

    }

    /**
     * 返回Color对象的类型
     *
     * @return
     */
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * 控制是否单例
     *
     * @return true 单实例 false 多实例
     */
    public boolean isSingleton() {
        return true;
    }
}
