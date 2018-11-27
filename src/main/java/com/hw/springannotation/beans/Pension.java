package com.hw.springannotation.beans;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/27 17:21
 * @Version 1.0
 */
public class Pension {

    private String name;
    private Integer age;

    public Pension() {
    }

    public Pension(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pension{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
