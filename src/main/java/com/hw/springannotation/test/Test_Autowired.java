package com.hw.springannotation.test;

import com.hw.springannotation.beans.Car;
import com.hw.springannotation.config.MainConfigOfAutowired;
import com.hw.springannotation.dao.BookRepository;
import com.hw.springannotation.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/29 16:09
 * @Version 1.0
 */
public class Test_Autowired {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

    @Test
    public void test1() {
//        BookService bookService = applicationContext.getBean(BookService.class);
//        System.out.println(bookService);

        Car bean = applicationContext.getBean(Car.class);
        System.out.println(bean);
        applicationContext.close();
    }
}
