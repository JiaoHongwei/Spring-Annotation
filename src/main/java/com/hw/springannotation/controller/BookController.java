package com.hw.springannotation.controller;

import com.hw.springannotation.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/27 18:14
 * @Version 1.0
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;
}
