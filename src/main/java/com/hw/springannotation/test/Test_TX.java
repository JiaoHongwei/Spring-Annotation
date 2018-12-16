package com.hw.springannotation.test;

import com.hw.springannotation.tx.TxConfig;
import com.hw.springannotation.tx.UserService;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author Administrator
 * @Date 2018/12/16
 */
public class Test_TX {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.insertUser();
        applicationContext.close();
    }

}
