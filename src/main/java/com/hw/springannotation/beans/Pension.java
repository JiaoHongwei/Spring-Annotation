package com.hw.springannotation.beans;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/27 17:21
 * @Version 1.0
 */
public class Pension {
    /**
     * 使用@Value赋值：
     * 1. 基本数值
     * 2. 可以写SPEL 表达式，例如： #{}
     * 3. 可以写${} ,取出配置文件中的值（在运行环境变量里面的值）
     */
    @Value("张三")
    private String name;
    @Value("#{22-1}")
    private Integer age;
    @Value("${nickName}")
    private String nickName;


    public Pension() {
    }

    public Pension(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pension(String name, int age, String nickName) {
        this.name = name;
        this.age = age;
        this.nickName = nickName;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Pension{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
