package com.hw.springannotation.test;

import com.hw.springannotation.beans.Pension;
import com.hw.springannotation.config.MainConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/27 18:16
 * @Version 1.0
 */
public class IocTest {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }


    /**
     * @Conditional注解
     */
    @Test
    public void test3() {
        String[] names = applicationContext.getBeanNamesForType(Pension.class);
        for (String name : names) {
            System.out.println(name);
        }
        // 获取操作系统环境变量值 Windows 7
        Environment environment = applicationContext.getEnvironment();
        String osName = environment.getProperty("os.name");
        System.out.println(osName);
        Map<String, Pension> map = applicationContext.getBeansOfType(Pension.class);

        System.out.println(map);
    }

    /**
     * @Import注解
     */
    @Test
    public void testImport() {
        printBeans();
//        System.exit(0);
    }

    private void printBeans(){
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
