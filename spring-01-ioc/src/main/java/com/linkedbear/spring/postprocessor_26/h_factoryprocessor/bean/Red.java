package com.linkedbear.spring.postprocessor_26.h_factoryprocessor.bean;

import org.springframework.stereotype.Component;

@Component
public class Red extends Color {

    @Override
    public String toString() {
        return "Red{" + "name='" + name + '\'' + "}";
    }
}
