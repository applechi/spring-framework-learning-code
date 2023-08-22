package com.linkedbear.spring.basic_di_08_10.e_jsr250.bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Bird {

    @Resource(name = "master")
    private Person person;

    @Override
    public String toString() {
        return "Bird{" + "person=" + person + '}';
    }
}
