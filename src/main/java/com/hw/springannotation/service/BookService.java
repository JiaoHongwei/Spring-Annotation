package com.hw.springannotation.service;

import com.hw.springannotation.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/27 18:15
 * @Version 1.0
 */
@Service
public class BookService {

    @Autowired(required = false)
//    @Qualifier("bookRepository")
    private BookRepository bookRepository2;

    public void print() {
        System.out.println("bookRepository2。。。");
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookRepository=" + bookRepository2 +
                '}';
    }
}
