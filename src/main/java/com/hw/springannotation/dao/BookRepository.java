package com.hw.springannotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/27 18:15
 * @Version 1.0
 */
@Repository
public class BookRepository {

    private String label = "1";

    @Override
    public String toString() {
        return "BookRepository{" +
                "label='" + label + '\'' +
                '}';
    }

    public BookRepository() {
    }

    public BookRepository(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
